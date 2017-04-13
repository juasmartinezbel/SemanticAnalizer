package classes;

import java.util.HashMap;
import java.util.List;

import classes.MyLanguageParser.*;

public class MyVisitor <T> extends MyLanguageBaseVisitor<T> {
	HashMap<HashMap, String[]> table = new HashMap<>();
	//HashMap<String, Object> variable = new HashMap<>();
	
	public Object define(String type, Object obj){
		switch(type){
			case "string":
				if (obj==null){
					return "";
				}else{
					return obj.toString();
				}
			case "double":
				if (obj==null){
					return 0.0;
				}else{
					return (Double) obj;
				}
			case "single":
				if (obj==null){
					return 0.0;
				}else{
					return (Double) obj;
				}
			case "long":
				if (obj==null){
					return 0;
				}else{
					return (Long) obj;
				}
			case "integer":
				if (obj==null){
					return 0;
				}else{
					return (Integer) obj;
				}
		}
		return null;
	}
	
	@Override
	public T visitQb64 (MyLanguageParser.Qb64Context ctx) {
	    List<MyLanguageParser.InstrContext> instruction = ctx.instr();
	    //List<MyLanguageParser.FunctionsubContext> functionSub = ctx.functionsub();

	    //for (MyLanguageParser.FunctionsubContext f : functionSub)
	    //    visit(f);

	    for (MyLanguageParser.InstrContext i : instruction)
	        visit(i);

	    return null;
	}
	
	@Override
	public T visitInstr(MyLanguageParser.InstrContext ctx) {
		return visitChildren(ctx);
	}
	
	@Override
	public T visitDecl(MyLanguageParser.DeclContext ctx) {
		return visitChildren(ctx);
	}
	
	@Override
	public T visitDim(MyLanguageParser.DimContext ctx){
		String[] myTypeArray = new String[2];
		String typeVar="variable";
		if(ctx.shared()!=null){
			typeVar="global";
		}
		myTypeArray[0]=typeVar;
		String valType= new String(ctx.TYPE().getText());
		System.out.print(valType);
		myTypeArray[1]=valType;
		visitIdim(ctx.idim(), myTypeArray);
		return null;
	}

	public T visitIdim(MyLanguageParser.IdimContext ctx, String[]typeVar) {
		String name = ctx.ID().getText();
		HashMap<String, Object> variable = new HashMap<>();
		Object vari=define(typeVar[0],null);
		System.out.println(vari);
		
		return null;
	}
	/*
	 * 
	 * Print Methods
	 * 
	 */
	public T visitPrint(MyLanguageParser.PrintContext ctx) {
		String Result= visitToprintfst(ctx.toprintfst()).toString();
		System.out.println(Result);
		return null;
	}
	
	@Override
	public T visitToprintfst(MyLanguageParser.ToprintfstContext ctx){
		String printTo="";
		if (ctx.expr()!=null){
			printTo+=visitExpr(ctx.expr(), null).toString()+" ";
		}
		
	    List<MyLanguageParser.ToprintContext> ToPrint = ctx.toprint();
	    //List<MyLanguageParser.FunctionsubContext> functionSub = ctx.functionsub();

	    //for (MyLanguageParser.FunctionsubContext f : functionSub)
	    //    visit(f);

	    for (MyLanguageParser.ToprintContext i : ToPrint){
			printTo+=visitToprint(i).toString()+" ";
	    }
		return (T) printTo;
	}
	
	@Override
	public T visitToprint(MyLanguageParser.ToprintContext ctx){
		return visitExpr(ctx.expr(), null);
	}
	/*
	 * 
	 * Methods for expressions
	 * 
	 */
	public T visitExpr(MyLanguageParser.ExprContext ctx, String Error) {
		// ()
		if (ctx.PIZQ()!=null && ctx.PDER()!=null){
			return visitExpr(ctx.expr(0), null);
			
		// not y -	
		}else if (ctx.neg()!=null){
			Object ne=ctx.neg().getText().toString();
			Object arch=visitExpr(ctx.expr(0), null);
			String ty=TypeOf(arch);
			if (ty.equals("string")){
				String [] should={"double", "integer", "long", "single"};
				Error=error_types("string", should);
				visitExpr(ctx.expr(0), Error);
			}else{	
				if (ne.equals("not")){
					if(ty.equals("integer") || ty.equals("float")){
						if (ty.equals("float")){
							int notArch=(int)(float)arch;
							Integer notU = ~notArch;
							return (T) notU;
						}else{
							int notArch= (int) arch;
							Integer notU = ~notArch;
							return (T) notU;
						}

						
					}else if (ty.equals("double") || ty.equals("long")){
						if (ty.equals("double")){
							long notArch=(long)(double)arch;
							Long notU = ~notArch;
							return (T) notU;
						}else{
							long notArch= (long) arch;
							Long notU = ~notArch;
							return (T) notU;
						}
					}
				}else if(ne.equals("-")){
					if(ty.equals("double")){
						double notArch= (double) arch;
						Double notU = -notArch;
						return (T) notU;
					}else if (ty.equals("long")){
						long notArch= (long) arch;
						Long notU = -notArch;
						return (T) notU;
					}else if (ty.equals("integer")){
						int notArch= (int) arch;
						Integer notU = -notArch;
						return (T) notU;
					}else if (ty.equals("float")){
						float notArch= (float) arch;
						Float notU = -notArch;
						return (T) notU;
					}
				}
			}
		// ^		
		}else if(ctx.POT()!=null){
			Object i=visitExpr(ctx.expr(0), null);
			Object j=visitExpr(ctx.expr(1), null);	
			String ti=TypeOf(i);
			String tj=TypeOf(j);
			if (ti.equals("string")||tj.equals("string")){
				String [] should={"double", "integer", "long", "single"};
				Error=error_types("string", should);
				if (ti.equals("string"))
					visitExpr(ctx.expr(0), Error);
				else if(tj.equals("string"))
					visitExpr(ctx.expr(1), Error);
			}else{
				Object [] op = operand(i, j);
				String operand= TypeOfOperands(op);
				if(operand.equals("integer")){
					Integer potencia= (int)Math.pow(((int)op[0]),((int)op[1]));
					return (T) potencia;
				}else if(operand.equals("long")){
					Long potencia= (long) Math.pow(((long)op[0]),((long)op[1]));
					return (T) potencia;
				}else if(operand.equals("float")){
					Float potencia=(float) Math.pow(((float)op[0]),((float)op[1]));
					return (T) potencia;
				}else{
					Double potencia=(double) Math.pow(((double)op[0]),((double)op[1]));
					return (T) potencia;
				}
			}
		//Mult
		}else if(ctx.MULT()!=null){
			Object i=visitExpr(ctx.expr(0), null);
			Object j=visitExpr(ctx.expr(1), null);	
			String ti=TypeOf(i);
			String tj=TypeOf(j);
			if (ti.equals("string")||tj.equals("string")){
				String [] should={"double", "integer", "long", "single"};
				Error=error_types("string", should);
				if (ti.equals("string"))
					visitExpr(ctx.expr(0), Error);
				else if(tj.equals("string"))
					visitExpr(ctx.expr(1), Error);
			}else{
				String op=ctx.MULT().getText();
				Object [] ope = operand(i, j);
				String operand= TypeOfOperands(ope);
				switch(op){
					case "*":
						if(operand.equals("integer")){
							Integer mult= (int)(((int)ope[0])*((int)ope[1]));
							return (T) mult;
						}else if(operand.equals("long")){
							Long mult= (long)(((long)ope[0])*((long)ope[1]));
							return (T) mult;
						}else if(operand.equals("float")){
							Float mult=(float)(((float)ope[0])*((float)ope[1]));
							return (T) mult;
						}else if(operand.equals("double")){
							Double mult=(double)(((double)ope[0])*((double)ope[1]));
							return (T) mult;
						}
						System.out.println("What");
						System.exit(-1);
					case "/":
						if(operand.equals("integer")){
							Integer div= (int)(((int)ope[0])/((int)ope[1]));
							return (T) div;
						}else if(operand.equals("long")){
							Long div= (long)(((long)ope[0])/((long)ope[1]));
							return (T) div;
						}else if(operand.equals("float")){
							Float div=(float)(((float)ope[0])/((float)ope[1]));
							return (T) div;
						}else if(operand.equals("double")){
							Double div=(double)(((double)ope[0])/((double)ope[1]));
							return (T) div;
						}
						System.out.println("What");
						System.exit(-1);
					case "mod":
						if(operand.equals("integer")){
							Integer div= (int)(((int)ope[0])%((int)ope[1]));
							return (T) div;
						}else if(operand.equals("long")){
							Long div= (long)(((long)ope[0])%((long)ope[1]));
							return (T) div;
						}else if(operand.equals("float")){
							Float div=(float)(((float)ope[0])/((float)ope[1]));
							return (T) div;
						}else if(operand.equals("double")){
							Double div=(double)(((double)ope[0])/((double)ope[1]));
							return (T) div;
						}
						System.out.println("What");
						System.exit(-1);
						
				}
			}
		}
		return null;
	}
	
	
	public Object [] operand(Object num1, Object num2){
		String t1=TypeOf(num1);
		String t2=TypeOf(num2);
		
		if (t1.equals("double")||t2.equals("double")){
			if(t1.equals("double")){
				Double[] numbers=new Double [2];
				Double cnum1= (double) num1;
				numbers[0]=cnum1;
				if(t2.equals("double")){
					double cnum2= (double) num2;
					numbers[1]=cnum2;
					return numbers;
				}else if (t2.equals("float")){
					double cnum2= (double)(float) num2;
					numbers[1]=cnum2;
					return numbers;
				}else if (t2.equals("long")){
					double cnum2= (double)(long) num2;
					numbers[1]=cnum2;
					return numbers;
				}else{
					double cnum2= (double)(int) num2;
					numbers[1]=cnum2;
					return numbers;
				}
			}else if(t2.equals("double")){
				Double[] numbers=new Double [2];
				Double cnum2= (double) num1;
				numbers[1]=cnum2;
				if (t1.equals("float")){
					double cnum1= (double)(float) num1;
					numbers[0]=cnum1;
					return numbers;
				}else if (t1.equals("long")){
					double cnum1= (double)(long) num1;
					numbers[0]=cnum1;
					return numbers;
				}else{
					double cnum1= (double)(int) num1;
					numbers[0]=cnum1;
					return numbers;
				}	
			}
			
		}else if(t1.equals("float")||t2.equals("float")){
			if(t1.equals("float")){
				Float[] numbers=new Float [2];
				Float cnum1= (float) num1;
				numbers[0]=cnum1;
				if (t2.equals("float")){
					float cnum2= (float) num2;
					numbers[1]=cnum2;
					return numbers;
				}else if (t2.equals("long")){
					float cnum2= (float)(long) num2;
					numbers[1]=cnum2;
					return numbers;
				}else{
					float cnum2= (float)(int) num2;
					numbers[1]=cnum2;
					return numbers;
				}
			}else if(t2.equals("float")){
				Float[] numbers=new Float [2];
				Float cnum2= (float) num1;
				numbers[1]=cnum2;
				if (t1.equals("long")){
					float cnum1= (float)(long) num1;
					numbers[0]=cnum1;
					return numbers;
				}else{
					float cnum1= (float)(int) num1;
					numbers[0]=cnum1;
					return numbers;
				}	
			}
		}else if (t1.equals("long")||t2.equals("long")){
			if(t1.equals("long")){
				Long[] numbers = new Long [2];
				Long cnum1=(long) num1;
				numbers[0] = cnum1;
				if (t2.equals("long")){
					long cnum2= (long) num2;
					numbers[1] = cnum2;
					return numbers;
				}else{
					long cnum2 = (long)(int) num2;
					numbers[1]=cnum2;
					return numbers;
				}
			}else if (t2.equals("long")){
				Long[] numbers = new Long [2];
				Long cnum2=(long) num2;
				numbers[1] = cnum2;
				numbers[0]=(long)(int) num1;
				return numbers;
			}
		}else{
			Integer[] numbers = new Integer[2];
			numbers[0]=(int) num1;
			numbers[1]=(int) num2;
			return numbers;
		}
		System.exit(-1);
		return null;
	}
	
	public Object returnNumValue(){
		return null;
	}
	
	
	public String TypeOf (Object T){
		if(T instanceof String){
			return "string";
		}else if(T instanceof Integer){
			return "integer";
		}else if(T instanceof Double){
			return "double";
		}else if (T instanceof Float){
			return "float";
		}else{
			return "long";
		}
	}
	
	public String TypeOfOperands (Object[] T){
		if(T instanceof Integer[]){
			return "integer";
		}else if(T instanceof Double[]){
			return "double";
		}else if (T instanceof Float[]){
			return "float";
		}else{
			return "long";
		}
	}
	
	
	
	public String error_types(String found, String[] should){
		String Error="Error semantico: tipos de datos incompatibles. Se esperaba:";
		for (int i = 0; i < should.length; i++) {
			Error+=" "+should[0];
			if ((i+1)>should.length)
				Error+=",";
		}
		Error=(Error+";se encontro: "+found+".\n");
		return Error;
	}

}
