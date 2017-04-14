package classes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.lang.model.type.DeclaredType;

import org.antlr.v4.parse.ANTLRParser.id_return;

import classes.MyLanguageParser.*;

public class MyVisitor <T> extends MyLanguageBaseVisitor<T> {
	
	public class CharVar <X, Y, Z>{
		public final X x; 
	    public final Y y;
	    public final Z z;
	    public CharVar(X x, Y y, Z z){ 
	        this.x = x; 
	        this.y = y;
	        this.z = z;
	    }
	    
	    @Override
	    public String toString() {
	        return "(" + x + "," + y + ","+ z + ")";
	    }

	    @Override
	    public boolean equals(Object other) {
	        if (other == this) {
	            return true;
	        }

	        if (!(other instanceof CharVar)){
	            return false;
	        }

	        CharVar<X,Y,Z> other_ = (CharVar<X,Y,Z>) other;

	        // this may cause NPE if nulls are valid values for x or y. The logic may be improved to handle nulls properly, if needed.
	        return other_.x.equals(this.x) && other_.y.equals(this.y) && other_.z.equals(this.z);
	    }

	    @Override
	    public int hashCode() {
	        final int prime = 31;
	        int result = 1;
	        result = prime * result + ((x == null) ? 0 : x.hashCode());
	        result = prime * result + ((y == null) ? 0 : y.hashCode());
	        result = prime * result + ((z == null) ? 0 : z.hashCode());
	        return result;
	    }
	}
		
	public class CharArr <W, X, Y, Z>{
		public final W w;
		public final X x; 
	    public final Y y;
	    public final Z z;
	    public CharArr(W w, X x, Y y, Z z){ 
	        this.w = w;
	    	this.x = x; 
	        this.y = y;
	        this.z = z;
	    }

	    @Override
	    public String toString() {
	        return "(" +w+ ","+ x + "," + y + ","+ z + ")";
	    }

	    @Override
	    public boolean equals(Object other) {
	        if (other == this) {
	            return true;
	        }

	        if (!(other instanceof CharVar)){
	            return false;
	        }

	        CharArr<W,X,Y,Z> other_ = (CharArr<W,X,Y,Z>) other;

	        // this may cause NPE if nulls are valid values for x or y. The logic may be improved to handle nulls properly, if needed.
	        return other_.w.equals(this.w) && other_.x.equals(this.x) && other_.y.equals(this.y) && other_.z.equals(this.z);
	    }

	    @Override
	    public int hashCode() {
	        final int prime = 31;
	        int result = 1;
	        result = prime * result + ((x == null) ? 0 : x.hashCode());
	        result = prime * result + ((y == null) ? 0 : y.hashCode());
	        return result;
	    }
	}
	
						 //Valor     Tipo  Local/Variable/Global   
	HashMap<String, CharVar<Object, String, String>> tableVar = new HashMap<>();
	
						 //Valores    Tipo     L/V/G  Posiciones 
	HashMap<String, CharArr<Object [], String, String, Integer[]>> tableArr = new HashMap<>();
	//HashMap<String, Object> variable = new HashMap<>();
	
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
	
	/*
	 * 
	 * 
	 * 
	 * Funciones para declaraciones
	 * 
	 * 
	 */
	
	@Override
	public T visitDecl(MyLanguageParser.DeclContext ctx) {
		if (ctx.dim()!=null){
			return visitDim(ctx.dim());
		}else{
			String type_var="variable";
			if(ctx.getStart().getText().equals("const")){
				type_var="const";
			}
			return visitSufdecl(ctx.sufdecl(), type_var);
		}
	}
	
	
	/*
	 * 
	 * 
	 * Con sufijos
	 * 
	 * 
	 */
	public T visitSufdecl(MyLanguageParser.SufdeclContext ctx, String type_var){
		Object res= visitExpr(ctx.expr());
		String tyr=TypeOf(res);
		int line= ctx.expr().getStart().getLine();
		int col= ctx.expr().getStart().getCharPositionInLine()+1;
		String[] shouldg={"double","integer","long","single"};

		if(ctx.idn().par().PIZQ()!=null){
			Object[] Variables= (Object[]) visitIdn(ctx.idn(), type_var);
			CharArr<Object[], String, String, Integer[]> changedVar;
			String Variable=Variables[0].toString();
			Integer Posicion=(Integer)Variables[1];
			
			String tyv= tableArr.get(Variable).x;
			String y= tableArr.get(Variable).y;
			Integer[] z= tableArr.get(Variable).z;
			Object[] w = tableArr.get(Variable).w;
			if (tyv.equals("string")){
				String[] should={"string"};
				if (tyr.equals("string")){
					w[Posicion]=res.toString();
					changedVar=new CharArr(w, tyv, y, z);
					tableArr.put(Variable.toString(), changedVar);
				}else{
					error_types(QB64Type(tyr), should, line, col);
				}
			}else if(tyv.equals("integer")){
				if (tyr.equals("integer")){
					w[Posicion]= (Integer) (int) res;
					changedVar=new CharArr(w, tyv, y, z);
					tableArr.put(Variable.toString(), changedVar);
				}else if (tyr.equals("string")){
					error_types(QB64Type(tyr), shouldg, line, col);
				}else{
					w[Posicion]=(Integer) casting("integer", QB64Type(tyr), res, line, col);
					changedVar=new CharArr(w, tyv, y, z);
					tableArr.put(Variable.toString(), changedVar);
				}
			}else if(tyv.equals("long")){
				if (tyr.equals("long")){
					w[Posicion]= (Long) (long) res;
					changedVar=new CharArr(w, tyv, y, z);
					tableArr.put(Variable.toString(), changedVar);
				}else if (tyr.equals("string")){
					error_types(QB64Type(tyr), shouldg, line, col);
				}else{
					w[Posicion]= (Long) casting("long", QB64Type(tyr), res, line, col);
					changedVar=new CharArr(w, tyv, y, z);
					tableArr.put(Variable.toString(), changedVar);
				}
			}else if(tyv.equals("single")){
				if (tyr.equals("float")){
					w[Posicion]= (Float) (float) res;
					changedVar=new CharArr(w, tyv, y, z);
					tableArr.put(Variable.toString(), changedVar);
				}else if (tyr.equals("string")){
					error_types(QB64Type(tyr), shouldg, line, col);
				}else{
					w[Posicion]=(Float) casting("single", QB64Type(tyr), res, line, col);
					changedVar=new CharArr(w, tyv, y, z);
					tableArr.put(Variable.toString(), changedVar);
				}
			}else if(tyv.equals("double")){
				if (tyr.equals("double")){
					w[Posicion]=(Double) (double) res;
					changedVar=new CharArr(w, tyv, y, z);
					tableArr.put(Variable.toString(), changedVar);
				}else if (tyr.equals("string")){
					error_types(QB64Type(tyr), shouldg, line, col);
				}else{
					w[Posicion]= (Double)(double) casting("double", QB64Type(tyr), res, line, col);
					changedVar=new CharArr(w, tyv, y, z);
					tableArr.put(Variable.toString(), changedVar);
				}

			}
			/*System.out.println("---------------------\n"+Variable);
			for (int i = 0; i < w.length; i++) {
				System.out.print(w[i].toString()+"");
			}*/
			return null;
			
			
			
			
			
			
			
			
			
		//Variables NO arreglos
		}else{
			Object Variable=visitIdn(ctx.idn(), type_var);
			String tyv=tableVar.get(Variable).y;
			CharVar<Object, String, String> changedVar;
			String z= tableVar.get(Variable).z;
			if (tyv.equals("string")){
				String[] should={"string"};
				if (tyr.equals("string")){
					String x=res.toString();
					changedVar=new CharVar(x, tyv, z);
					tableVar.put(Variable.toString(), changedVar);
				}else{
					error_types(QB64Type(tyr), should, line, col);
				}
			}else if(tyv.equals("integer")){
				if (tyr.equals("integer")){
					Integer x= (int) res;
					changedVar=new CharVar(x, tyv, z);
					tableVar.put(Variable.toString(), changedVar);
				}else if (tyr.equals("string")){
					error_types(QB64Type(tyr), shouldg, line, col);
				}else{
					Integer x=(Integer) casting("integer", QB64Type(tyr), res, line, col);
					changedVar=new CharVar(x, tyv, z);
					tableVar.put(Variable.toString(), changedVar);
				}
			}else if(tyv.equals("long")){
				if (tyr.equals("long")){
					Long x= (long) res;
					changedVar=new CharVar(x, tyv, z);
					tableVar.put(Variable.toString(), changedVar);
				}else if (tyr.equals("string")){
					error_types(QB64Type(tyr), shouldg, line, col);
				}else{
					Long x=(Long) casting("long", QB64Type(tyr), res, line, col);
					changedVar=new CharVar(x, tyv, z);
					tableVar.put(Variable.toString(), changedVar);
				}
			}else if(tyv.equals("single")){
				if (tyr.equals("float")){
					Float x= (float) res;
					changedVar=new CharVar(x, tyv, z);
					tableVar.put(Variable.toString(), changedVar);
				}else if (tyr.equals("string")){
					error_types(QB64Type(tyr), shouldg, line, col);
				}else{
					Float x=(Float) casting("single", QB64Type(tyr), res, line, col);
					changedVar=new CharVar(x, tyv, z);
					tableVar.put(Variable.toString(), changedVar);
				}
			}else if(tyv.equals("double")){
				if (tyr.equals("double")){
					Double x= (double) res;
					changedVar=new CharVar(x, tyv, z);
					tableVar.put(Variable.toString(), changedVar);
				}else if (tyr.equals("string")){
					error_types(QB64Type(tyr), shouldg, line, col);
				}else{
					Double x=(double) casting("double", QB64Type(tyr), res, line, col);
					changedVar=new CharVar(x, tyv, z);
					tableVar.put(Variable.toString(), changedVar);
				}
			}

			//System.out.println("--------------------------\n"+Variable);
			//System.out.println(tableVar.get(Variable).toString());
		}
		return null;
	}
	
	public T visitIdn(MyLanguageParser.IdnContext ctx, String type_var){
		String name=ctx.ID().getText();
		int line=ctx.ID().getSymbol().getLine();
		int col = ctx.ID().getSymbol().getCharPositionInLine()+1;
		String suffix="";
		String varClass="";
		if(ctx.sufix().SUFN()!=null){
			suffix=ctx.sufix().SUFN().getText();
			varClass=varClass(suffix);
		}else if(ctx.sufix().SUFS()!=null){
			suffix=ctx.sufix().SUFS().getText();
			varClass=varClass(suffix);
		}
		//Arreglos
		if (ctx.par().PIZQ()!=null){
			Integer[] arguments= (Integer[]) visitPar(ctx.par());
			if(arrExists(name, varClass)){
				check_ConstantArr(name, line, col, type_var);
				check_accurate_size(name, arguments, line, col);
				Integer[] real= tableArr.get(name).z;
				for (int i = 0; i < arguments.length; i++) {
					if(real[i]<arguments[i]){
						int line0= ctx.par().pos(i).getStart().getLine();
						int col0= ctx.par().pos(i).getStart().getCharPositionInLine()+1;
						error_tiempo_exe(arguments[i]-1, line0, col0);
					}
				}
				Object [] variables= new Object[2];
				variables[0]=name;
				variables[1]=posicion(arguments, real);
				return (T) variables;
			}else if (arrExists(name+suffix, varClass)){
				String variable=name+suffix;
				check_ConstantArr(variable, line, col, type_var);
				check_accurate_size(variable, arguments, line, col);
				Integer[] real= tableArr.get(name).z;
				for (int i = 0; i < arguments.length; i++) {
					if(real[i]>arguments[i]){
						int line0= ctx.par().pos(i).getStart().getLine();
						int col0= ctx.par().pos(i).getStart().getCharPositionInLine()+1;
						error_tiempo_exe(arguments[i], line, col);
					}
				}
				Object [] variables= new Object[2];
				variables[0]=name;
				variables[1]=posicion(arguments, real);
				return (T) variables;
			}else{
				CharArr<Object[], String, String, Integer[]> newVar;
				String variable;
				if (suffix=="")
					varClass="single";
				int size=arguments[0];
				for (int i = 1; i < arguments.length; i++) {
					size=(int)size*arguments[i];
				}
				Object [] vari= new Object[size];
				for (int i = 0; i < size; i++) {
					vari[i]=define(varClass, null);
				}
				//Object vari=define(varClass, null);
				if (suffix.equals("!") || suffix.equals("")){
					newVar=new CharArr(vari, varClass, type_var, arguments);
					variable=name;
					tableArr.put(variable, newVar);
					Object [] variables= new Object[2];
					variables[0]=variable;
					variables[1]=posicion(arguments, arguments);
					return (T) variables;
				}else{
					newVar=new CharArr(vari, varClass, type_var, arguments);
					variable=name+suffix;
					tableArr.put(variable, newVar);
					Object [] variables= new Object[2];
					variables[0]=variable;
					variables[1]=posicion(arguments, arguments);
					return (T) variables;
				}
			}

			
			
			
			
		//Variables
		}else{
			//Me verifica si está modificando.
			if(varExists(name, varClass)){
				check_ConstantVar(name, line, col, type_var);
				String variable=name;
				return (T) variable;
			}else if (varExists(name+suffix, varClass)){
				check_ConstantVar(name+suffix, line, col, type_var);
				String variable=name+suffix;
				return (T) variable;
			//Entonces me está es declarando
			}else{
				CharVar<Object, String, String> newVar;
				String variable;
				if (suffix=="")
					varClass="single";
				Object vari=define(varClass, null);
				if (suffix.equals("!") || suffix.equals("")){
					newVar=new CharVar(vari, varClass, type_var);
					variable=name;
					tableVar.put(variable, newVar);
					return (T) variable;
				}else{
					newVar=new CharVar(vari, varClass, type_var);
					variable=name+suffix;
					tableVar.put(variable, newVar);
					return (T) variable;
				}
			}
		}
		
	}
	public boolean arrExists(String var, String varClass){
		if (tableArr.containsKey(var)){
			String reserved=tableArr.get(var).x;
			if (varClass.equals("")){
				return true;
			}else if (varClass.equals(reserved)){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
	public boolean varExists(String var, String varClass){
		if (tableVar.containsKey(var)){
			String reserved=tableVar.get(var).y;
			if (varClass.equals("")){
				return true;
			}else if (varClass.equals(reserved)){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
	
	public Integer posicion(Integer [] arguments, Integer[] real){
		int posi=0;
		for (int i=(arguments.length-1); i>=0; i--){
			int pos=arguments[i]-1;
			
			for (int j=i+1; j<arguments.length; j++){
				pos=pos*real[j];
			}
			posi+=pos;
		}
		return posi;
	}
	public void check_ConstantArr(String name, int line, int col, String type_var){
		if(type_var.equals("const")){
			error_red_var(name, line, col);
		}
		if(tableArr.containsKey(name)){
			String local=tableArr.get(name).y;
			if(local.equals("const"))
				error_constant(name, line, col);
		}else{
			System.err.print("How arr");
			System.exit(-1);
		}
	}
	
	public void check_ConstantVar(String name, int line, int col, String type_var){
		if(type_var.equals("const")){
			error_red_var(name, line, col);
		}
		if(tableVar.containsKey(name)){
			String local=tableVar.get(name).z;
			if(local.equals("const"))
				error_constant(name, line, col);
		}else{
			System.err.print("How");
			System.exit(-1);
		}
	}
	
	public void check_accurate_size(String name, Object [] arguments, int line, int col){
		Object[] arre_var=tableArr.get(name).z;
		if(arguments.length!=arre_var.length){
			error_red_arr(name, line, col);
		}
	}
	
	
	public String varClass(String suffix){
		if (suffix.equals("%")){
			return "integer";
		}else if (suffix.equals("#")){
			return "double";
		}else if (suffix.equals("!")){
			return "single";
		}else if (suffix.equals("&")){
			return "long";
		}else if (suffix.equals("$")){
			return "string";
		}
		System.err.print("Sufijo no soportado");
		System.exit(-1);
		return null;
	}
	
	
	/*
	 * 
	 * 
	 * Con DIM
	 * 
	 * 
	 */
	@Override
	public T visitDim(MyLanguageParser.DimContext ctx){
		String[] myTypeArray = new String[2];
		String typeVar="variable";
		if(ctx.shared().getStart().getText().equals("shared")){
			typeVar="global";
		}
		myTypeArray[0]=typeVar;
		String valType= new String(ctx.TYPE().getText());
		myTypeArray[1]=valType;
		
		List<MyLanguageParser.IdimContext> idims = ctx.idim();
	    for (MyLanguageParser.IdimContext i : idims)
	        visitIdim(i, myTypeArray);
		return null;
	}
	
	@Override
	public T visitPar(MyLanguageParser.ParContext ctx){
		
		List<MyLanguageParser.PosContext> arguments = ctx.pos();
		Integer [] arg = new Integer[arguments.size()];
		int count=0;
		for (MyLanguageParser.PosContext i : arguments){
			arg[count]= ((Integer) visitPos(i))+1;
			count++;
			
		}
		return (T) arg;
	}
	
	@Override
	public T visitPos(MyLanguageParser.PosContext ctx){
		Object v = visitExpr(ctx.expr());
		String toa=TypeOf(v);
		int line= ctx.expr().getStart().getLine();
		int col= ctx.expr().getStart().getCharPositionInLine();
		if (toa.equals("long")){
			Long uv= (Long) v;
			Integer end=(int)(long) uv;
			if (end < 0){
				error_tiempo_exe(end, line, col);
			}
			return (T) end;
		}else if (toa.equals("integer")){
			Integer uv= (Integer) v;
			Integer end=(int) uv;
			if (end < 0){
				error_tiempo_exe(end, line, col);
			}
			return (T) end;
		}else{
			String [] should= {"integer","long"};
			error_types(QB64Type(toa), should, line, col);
		}
		System.err.print("Error declarando arreglos. ¿Qué hiciste mal?");
		System.exit(-1);
		return null;
	}


	
	public T visitIdim(MyLanguageParser.IdimContext ctx, String[]typeVar) {
		String name = ctx.ID().getText();
		int line = ctx.ID().getSymbol().getLine();
		int col = ctx.ID().getSymbol().getCharPositionInLine()+1;

		if (ctx.par().PIZQ()!=null){
			Integer [] arguments= (Integer[]) visitPar(ctx.par());
			CharArr<Object[], String, String, Integer[]> variable;
			int size=arguments[0];
			for (int i = 1; i < arguments.length; i++) {
				size=(int)size*arguments[i];
			}
			check_Error_array(name,line,col);
			if(typeVar[1].equals("integer")){
				Integer [] vari = new Integer[size];
				for (int i=0; i<size; i++){
					vari[i]=(int)define(typeVar[1],null);
				}
				variable= new CharArr(vari,typeVar[1], typeVar[0], arguments);
				tableArr.put(name, variable);
				//tableArr.put(name+'%', variable);
			}else if(typeVar[1].equals("double")){
				Double [] vari = new Double[size];
				for (int i=0; i<size; i++){
					vari[i]=(double)define(typeVar[1],null);
				}
				variable= new CharArr(vari,typeVar[1], typeVar[0], arguments);
				tableArr.put(name, variable);
				//tableArr.put(name+'#', variable);
			}else if (typeVar[1].equals("single")){
				Float [] vari = new Float[size];
				for (int i=0; i<size; i++){
					vari[i]=(float)define(typeVar[1],null);
				}
				variable= new CharArr(vari,typeVar[1], typeVar[0], arguments);
				tableArr.put(name, variable);
				//tableArr.put(name+'!', variable);
			}else if (typeVar[1].equals("long")){
				Long [] vari = new Long[size];
				for (int i=0; i<size; i++){
					vari[i]=(long)define(typeVar[1],null);
				}
				variable= new CharArr(vari,typeVar[1], typeVar[0], arguments);
				tableArr.put(name, variable);
				//tableArr.put(name+'&', variable);
			}else if (typeVar[1].equals("string")){
				String [] vari = new String[size];
				for (int i=0; i<size; i++){
					vari[i]=define(typeVar[1],null).toString();
				}
				variable= new CharArr(vari,typeVar[1], typeVar[0], arguments);
				tableArr.put(name, variable);
				//tableArr.put(name+'$', variable);
			}else{
				System.err.print("Ehm... Está asignando un tipo que no debería");
				System.exit(-1);
			}
		}else{
			/*
			 * Declara Variables
			 */
			CharVar <Object, String, String> variable;
			Object vari=define(typeVar[1],null);
			check_Error_var(name, typeVar[1], line, col);
			if(typeVar[1].equals("integer")){
				Integer v= (int)vari;
				variable= new CharVar(v,typeVar[1], typeVar[0]);
				tableVar.put(name, variable);
				//tableVar.put(name+'%', variable);
			}else if(typeVar[1].equals("double")){
				Double v= (double) vari;
				variable= new CharVar(v,typeVar[1], typeVar[0]);
				tableVar.put(name, variable);
				//tableVar.put(name+'#', variable);
			}else if (typeVar[1].equals("single")){
				Float v= (float)vari;
				variable= new CharVar(v,typeVar[1], typeVar[0]);
				tableVar.put(name, variable);
				//tableVar.put(name+'!', variable);
			}else if (typeVar[1].equals("long")){
				Long v= (long)vari;
				variable= new CharVar(v,typeVar[1], typeVar[0]);
				tableVar.put(name, variable);
				//tableVar.put(name+'&', variable);
			}else if (typeVar[1].equals("string")){
				String v= vari.toString();
				variable= new CharVar(v,typeVar[1], typeVar[0]);
				tableVar.put(name, variable);
				//tableVar.put(name+'$', variable);
			}else{
				System.err.print("Ehm... Está asignando un tipo que no debería");
				System.exit(-1);
			}
		}
		/*System.out.println("-----------------------------");
		for (String string : tableVar.keySet()) {
			System.out.println("--Key---");
			System.out.println(string);
			System.out.println(tableVar.get(string).toString());
		}*/

		return null;
	}
	

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
					return (float)0.0;
				}else{
					return (Float) obj;
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
		System.err.print("Nope, ninguno de estos casos");
		System.exit(-1);
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
			printTo+=visitExpr(ctx.expr()).toString()+" ";
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
		return visitExpr(ctx.expr());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * 
	 * Methods for expressions
	 * 
	 */
	@Override
	public T visitValue(MyLanguageParser.ValueContext ctx){
		if (ctx.valuev()!=null){
			Object v=visitValuev(ctx.valuev());
			String operand= TypeOf(v);
			if(operand.equals("integer")){
				Integer and = (int) v;
				return (T) and;
			}else if(operand.equals("long")){
				Long and = (long) v;
				return (T) and;
			}else if(operand.equals("float")){
				Float and = (float) v;
				return (T) and;
			}else if(operand.equals("double")){
				Double and = (double) v;
				return (T) and;
			}else if(operand.equals("string")){
				String and = v.toString();
				return (T) and;
			}
		}
		System.out.println("Nigga, esto no debe pasar");
		System.exit(-1);
		return null;
	}
	
	@Override
	public T visitValuev(MyLanguageParser.ValuevContext ctx){
		if (ctx.INTEGER()!=null){
			Integer ans = new Integer(ctx.INTEGER().getText());
			return (T) ans;
		}else if(ctx.LONG()!=null){
			Long ans = new Long(ctx.LONG().getText());
			return (T) ans;
		}else if(ctx.DOUBLE()!=null){
			Double ans = new Double(ctx.DOUBLE().getText());
			return (T) ans;
		}else if(ctx.SINGLE()!=null){
			Float ans = new Float(ctx.SINGLE().getText());
			return (T) ans;
		}else if(ctx.STRING()!=null){
			String ans = new String(ctx.STRING().getText());
			ans= ans.substring(1, ans.length()-1);
			return (T) ans;
		}
		System.err.println("Error en los valores. Algo salió mal");
		System.exit(-1);
		return null;
		
	}
	
	@Override
	public T visitExpr(MyLanguageParser.ExprContext ctx) {
		
		if(ctx.value()!=null){
			Object v=visitValue(ctx.value());;
			String operand= TypeOf(v);
			if(operand.equals("integer")){
				Integer and = (int) v;
				return (T) and;
			}else if(operand.equals("long")){
				Long and = (long) v;
				return (T) and;
			}else if(operand.equals("float")){
				Float and = (float) v;
				return (T) and;
			}else if(operand.equals("double")){
				Double and = (double) v;
				return (T) and;
			}else if(operand.equals("string")){
				String and = v.toString();
				return (T) and;
			}
		}
		int line0=ctx.expr(0).getStart().getLine();
		int col0= ctx.expr(0).getStart().getCharPositionInLine()+1;
		// ()
		if (ctx.PIZQ()!=null && ctx.PDER()!=null){
			return visitExpr(ctx.expr(0));
			
		// not y -	
		}else if (ctx.neg()!=null){
			Object ne=ctx.neg().getText().toString();
			Object arch=visitExpr(ctx.expr(0));
			String ty=TypeOf(arch);
			if (ty.equals("string")){
				String [] should={"double", "integer", "long", "single"};
				String Error=error_types("string", should, line0, col0);
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
			
			
		/*
		 * 
		 * Operadores binarios
		 * 	
		*/	
		// ^		
		}else{ 
		int line1=ctx.expr(1).getStart().getLine();
		int col1= ctx.expr(1).getStart().getCharPositionInLine()+1;
		Object i=visitExpr(ctx.expr(0));
		Object j=visitExpr(ctx.expr(1));	
		String ti=TypeOf(i);
		String tj=TypeOf(j);
		Object [] ope = new Object [2];
		String operand;
		Integer ans;
		
		if(ctx.POT()!=null){
			String op=ctx.POT().getText();
			if (ti.equals("string")||tj.equals("string")){
				String [] should={"double", "integer", "long", "single"};
				if (ti.equals("string"))
					error_types("string", should, line0, col0);
				else if(tj.equals("string"))
					error_types("string", should, line1, col1);

			}else{
				ope = operand(i, j);
				operand= TypeOfOperands(ope);
				if(operand.equals("integer")){
					Integer potencia= (int)Math.pow(((int)ope[0]),((int)ope[1]));
					return (T) potencia;
				}else if(operand.equals("long")){
					Long potencia= (long) Math.pow(((long)ope[0]),((long)ope[1]));
					return (T) potencia;
				}else if(operand.equals("float")){
					Float potencia=(float) Math.pow(((float)ope[0]),((float)ope[1]));
					return (T) potencia;
				}else{
					Double potencia=(double) Math.pow(((double)ope[0]),((double)ope[1]));
					return (T) potencia;
				}
			}
		//Mult
		}else if(ctx.MULT()!=null){
			String op=ctx.MULT().getText();
			if (ti.equals("string")||tj.equals("string")){
				if (op.equals("mod")){
					String [] should={"integer", "long"};
					if (ti.equals("string"))
						error_types("string", should, line0, col0);
					else if(tj.equals("string"))
						error_types("string", should, line1, col1);
				}else{
					String [] should={"double", "integer", "long", "single"};
					if (ti.equals("string"))
						error_types("string", should, line0, col0);
					else if(tj.equals("string"))
						error_types("string", should, line1, col1);
				}
			}else{
				ope = operand(i, j);
				operand= TypeOfOperands(ope);
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
						String [] should={"integer", "long"};
						if (ti.equals("float")){
							error_types("single", should, line0, col0);
						}else if (ti.equals("double")){
							error_types("double", should, line0, col0);
						}else if (tj.equals("float")){
							error_types("single", should, line1, col1);
						}else if (tj.equals("double")){
							error_types("double", should, line1, col1);
						}
						if(operand.equals("integer")){
							Integer div= (int)(((int)ope[0])%((int)ope[1]));
							return (T) div;
						}else if(operand.equals("long")){
							Long div= (long)(((long)ope[0])%((long)ope[1]));
							return (T) div;
						}
						System.out.println("What mod");
						System.exit(-1);
						
				}
			}
		
			
		//Add
		}else if(ctx.addi()!=null){
			String op=ctx.addi().getText();

			switch(op){
				case "+":
					if (ti.equals("string") && tj.equals("string")){
						String ij=i.toString()+j.toString();
						return (T)ij;
					}else if (ti.equals("string")){
						String[] u={"string"};
						error_types(QB64Type(tj), u, line1, col1);
					}else if (tj.equals("string")){
						String [] should={"double", "integer", "long", "single"};
						error_types(QB64Type(tj), should, line0, col0);
					}
					ope = operand(i, j);
					operand= TypeOfOperands(ope);
					
					if(operand.equals("integer")){
						Integer sum= (int)(((int)ope[0])+((int)ope[1]));
						return (T) sum;
					}else if(operand.equals("long")){
						Long sum= (long)(((long)ope[0])+((long)ope[1]));
						return (T) sum;
					}else if(operand.equals("float")){
						Float sum=(float)(((float)ope[0])+((float)ope[1]));
						return (T) sum;
					}else if(operand.equals("double")){
						Double sum=(double)(((double)ope[0])+((double)ope[1]));
						return (T) sum;
					}
				
					System.out.println("What");
					System.exit(-1);
					break;
				case "-":
					if (ti.equals("string")||tj.equals("string")){
						String [] should={"double", "integer", "long", "single"};
						if (ti.equals("string"))
							error_types("string", should, line0, col0);
						else if(tj.equals("string"))
							error_types("string", should, line1, col1);
					}
					ope = operand(i, j);
					operand= TypeOfOperands(ope);
					
					if(operand.equals("integer")){
						Integer sub= (int)(((int)ope[0])-((int)ope[1]));
						return (T) sub;
					}else if(operand.equals("long")){
						Long sub= (long)(((long)ope[0])-((long)ope[1]));
						return (T) sub;
					}else if(operand.equals("float")){
						Float sub=(float)(((float)ope[0])-((float)ope[1]));
						return (T) sub;
					}else if(operand.equals("double")){
						Double sub=(double)(((double)ope[0])-((double)ope[1]));
						return (T) sub;
					}
			}
			
		//Relational
		}else if(ctx.REL()!=null){
			//a.comparedTo(b)
			//a>b=-1	
			String op=ctx.REL().getText();

			switch(op){
			case ">":
				//Para Strings
				if (ti.equals("string") && tj.equals("string")){
					
					int res=i.toString().compareTo(j.toString());
					if (res==1)
						ans=-1;
					else
						ans=0;
					return (T) ans;
				}else if (ti.equals("string")){
					String[] u={"string"};
					error_types(QB64Type(tj), u, line1, col1);
				}else if (tj.equals("string")){
					String [] should={"double", "integer", "long", "single"};
					error_types(QB64Type(tj), should, line0, col0);
				}
				
				ope = operand(i, j);
				operand= TypeOfOperands(ope);
				
				if(operand.equals("integer")){
					boolean sub= (((int)ope[0])>((int)ope[1]));
					Integer res= boolQB64(sub);
					return (T) res;
				}else if(operand.equals("long")){
					boolean sub= (((long)ope[0])>((long)ope[1]));
					Integer res= boolQB64(sub);
					return (T) res;
				}else if(operand.equals("float")){
					boolean sub=(((float)ope[0])>((float)ope[1]));
					Integer res= boolQB64(sub);
					return (T) res;
				}else if(operand.equals("double")){
					boolean sub=(((double)ope[0])>((double)ope[1]));
					Integer res= boolQB64(sub);
					return (T) res;
				}
				
				System.out.println("What");
				System.exit(-1);
				break;
			
			
			
			case ">=":
				//Para Strings
				if (ti.equals("string") && tj.equals("string")){
					
					int res=i.toString().compareTo(j.toString());
					if (res>=0)
						ans=-1;
					else
						ans=0;
					return (T) ans;
				}else if (ti.equals("string")){
					String[] u={"string"};
					error_types(QB64Type(tj), u, line1, col1);
				}else if (tj.equals("string")){
					String [] should={"double", "integer", "long", "single"};
					error_types(QB64Type(tj), should, line0, col0);
				}
				
				

				ope = operand(i, j);
				operand= TypeOfOperands(ope);
				
				if(operand.equals("integer")){
					boolean sub= (((int)ope[0])>=((int)ope[1]));
					Integer res= boolQB64(sub);
					return (T) res;
				}else if(operand.equals("long")){
					boolean sub= (((long)ope[0])>=((long)ope[1]));
					Integer res= boolQB64(sub);
					return (T) res;
				}else if(operand.equals("float")){
					boolean sub=(((float)ope[0])>=((float)ope[1]));
					Integer res= boolQB64(sub);
					return (T) res;
				}else if(operand.equals("double")){
					boolean sub=(((double)ope[0])>=((double)ope[1]));
					Integer res= boolQB64(sub);
					return (T) res;
				}
				
				System.out.println("What");
				System.exit(-1);
				break;
				
				
			case "<":
				//Para Strings
				if (ti.equals("string") && tj.equals("string")){
					
					int res=i.toString().compareTo(j.toString());
					if (res==-1)
						ans=-1;
					else
						ans=0;
					return (T) ans;
				}else if (ti.equals("string")){
					String[] u={"string"};
					error_types(QB64Type(tj), u, line1, col1);
				}else if (tj.equals("string")){
					String [] should={"double", "integer", "long", "single"};
					error_types(QB64Type(tj), should, line0, col0);
				}
				
				
				ope = operand(i, j);
				operand= TypeOfOperands(ope);
				
				if(operand.equals("integer")){
					boolean sub= (((int)ope[0])<((int)ope[1]));
					Integer res= boolQB64(sub);
					return (T) res;
				}else if(operand.equals("long")){
					boolean sub= (((long)ope[0])<((long)ope[1]));
					Integer res= boolQB64(sub);
					return (T) res;
				}else if(operand.equals("float")){
					boolean sub=(((float)ope[0])<((float)ope[1]));
					Integer res= boolQB64(sub);
					return (T) res;
				}else if(operand.equals("double")){
					boolean sub=(((double)ope[0])<((double)ope[1]));
					Integer res= boolQB64(sub);
					return (T) res;
				}
				
				System.out.println("What");
				System.exit(-1);
				break;
			case "<=":
				//Para Strings
				if (ti.equals("string") && tj.equals("string")){
					
					int res=i.toString().compareTo(j.toString());
					if (res<=0)
						ans=-1;
					else
						ans=0;
					return (T) ans;
				}else if (ti.equals("string")){
					String[] u={"string"};
					error_types(QB64Type(tj), u, line1, col1);
				}else if (tj.equals("string")){
					String [] should={"double", "integer", "long", "single"};
					error_types(QB64Type(tj), should, line0, col0);
				}
				
				
				ope = operand(i, j);
				operand= TypeOfOperands(ope);
				
				if(operand.equals("integer")){
					boolean sub= (((int)ope[0])<=((int)ope[1]));
					Integer res= boolQB64(sub);
					return (T) res;
				}else if(operand.equals("long")){
					boolean sub= (((long)ope[0])<=((long)ope[1]));
					Integer res= boolQB64(sub);
					return (T) res;
				}else if(operand.equals("float")){
					boolean sub=(((float)ope[0])<=((float)ope[1]));
					Integer res= boolQB64(sub);
					return (T) res;
				}else if(operand.equals("double")){
					boolean sub=(((double)ope[0])<=((double)ope[1]));
					Integer res= boolQB64(sub);
					return (T) res;
				}
				
				System.out.println("What");
				System.exit(-1);
				break;
			}
			
			
			
			
		///= and <>
		}else if (ctx.equdi()!=null){
			String op=ctx.equdi().getText();
			switch(op){
				case "=":
					//Para Strings
					if (ti.equals("string") && tj.equals("string")){

						boolean res=(i.toString()).equals(j.toString());
						ans= boolQB64(res);
						return (T) ans;
					}else if (ti.equals("string")){
						String[] u={"string"};
						error_types(QB64Type(tj), u, line1, col1);
					}else if (tj.equals("string")){
						String [] should={"double", "integer", "long", "single"};
						error_types(QB64Type(tj), should, line0, col0);
					}

					ope = operand(i, j);
					operand= TypeOfOperands(ope);
					
					if(operand.equals("integer")){
						boolean sub= (((int)ope[0])==((int)ope[1]));
						Integer res= boolQB64(sub);
						return (T) res;
					}else if(operand.equals("long")){
						boolean sub= (((long)ope[0])==((long)ope[1]));
						Integer res= boolQB64(sub);
						return (T) res;
					}else if(operand.equals("float")){
						boolean sub=(((float)ope[0])==((float)ope[1]));
						Integer res= boolQB64(sub);
						return (T) res;
					}else if(operand.equals("double")){
						boolean sub=(((double)ope[0])==((double)ope[1]));
						Integer res= boolQB64(sub);
						return (T) res;
					}
					
					System.out.println("What");
					System.exit(-1);
					break;
				case "<>":
					if (ti.equals("string") && tj.equals("string")){
						boolean res=(i.toString()).equals(j.toString());
						ans= boolQB64(!res);
						return (T) ans;
					}else if (ti.equals("string")){
						String[] u={"string"};
						error_types(QB64Type(tj), u, line1, col1);
					}else if (tj.equals("string")){
						String [] should={"double", "integer", "long", "single"};
						error_types(QB64Type(tj), should, line0, col0);
					}
					

					ope = operand(i, j);
					operand= TypeOfOperands(ope);
					
					if(operand.equals("integer")){
						boolean sub= (((int)ope[0])!=((int)ope[1]));
						Integer res= boolQB64(sub);
						return (T) res;
					}else if(operand.equals("long")){
						boolean sub= (((long)ope[0])!=((long)ope[1]));
						Integer res= boolQB64(sub);
						return (T) res;
					}else if(operand.equals("float")){
						boolean sub=(((float)ope[0])!=((float)ope[1]));
						Integer res= boolQB64(sub);
						return (T) res;
					}else if(operand.equals("double")){
						boolean sub=(((double)ope[0])!=((double)ope[1]));
						Integer res= boolQB64(sub);
						return (T) res;
					}
					
					System.out.println("What");
					System.exit(-1);
					break;
			}
		
		///and
		}else if (ctx.AND()!=null){
			String [] should={"double", "integer", "long", "single"};
			if (ti.equals("string")){
				error_types("string", should, line0, col0);
			}else if (tj.equals("string")){
				error_types("string", should, line1, col1);				
			}
			
			ope = operand(i, j);
			operand= TypeOfOperands(ope);
			
			if(operand.equals("integer")){
				int sub= (((int)ope[0])&((int)ope[1]));
				Integer and=sub;
				return (T) and;
			}else if(operand.equals("long")){
				long sub= (((long)ope[0])&((long)ope[1]));
				Long and=sub;
				return (T) and;
			}else if(operand.equals("float")){
				int sub=((int)((float)ope[0])&((int)(float)ope[1]));
				Integer and=sub;
				return (T) and;
			}else if(operand.equals("double")){
				long sub=(((long)(double)ope[0])&((long)(double)ope[1]));
				Long and=sub;
				return (T) and;
			}else{
				System.out.println("What");
				System.exit(-1);
			}
			
			
			
		//XOR y OR
		}else if(ctx.OR()!=null){
			String [] should={"double", "integer", "long", "single"};
			if (ti.equals("string")){
				error_types("string", should, line0, col0);
			}else if (tj.equals("string")){
				error_types("string", should, line1, col1);				
			}
			String op=ctx.OR().getText();
			ope = operand(i, j);
			operand= TypeOfOperands(ope);
			switch(op){
				case("or"):
					if(operand.equals("integer")){
						int sub= (((int)ope[0])|((int)ope[1]));
						Integer and=sub;
						return (T) and;
					}else if(operand.equals("long")){
						long sub= (((long)ope[0])|((long)ope[1]));
						Long and=sub;
						return (T) and;
					}else if(operand.equals("float")){
						int sub=((int)((float)ope[0])|((int)(float)ope[1]));
						Integer and=sub;
						return (T) and;
					}else if(operand.equals("double")){
						long sub=(((long)(double)ope[0])|((long)(double)ope[1]));
						Long and=sub;
						return (T) and;
					}else{
						System.out.println("What");
						System.exit(-1);
					}
				case("xor"):
					if(operand.equals("integer")){
						int sub= (((int)ope[0])^((int)ope[1]));
						Integer and=sub;
						return (T) and;
					}else if(operand.equals("long")){
						long sub= (((long)ope[0])^((long)ope[1]));
						Long and=sub;
						return (T) and;
					}else if(operand.equals("float")){
						int sub=((int)((float)ope[0])^((int)(float)ope[1]));
						Integer and=sub;
						return (T) and;
					}else if(operand.equals("double")){
						long sub=(((long)(double)ope[0])^((long)(double)ope[1]));
						Long and=sub;
						return (T) and;
					}else{
						System.out.println("What");
						System.exit(-1);
					}
			}
	
		/*
		 * 
		 * 
		 * Valores
		 * 
		 */
		
		}	
		}
		return null;
	}
	
	public String QB64Type(String type){
		String T=type;
		if (T.equals("float")){
			T="single";
		}
		return T;
	}
	
	public int boolQB64(boolean result){
		if (result)
			return -1;
		else
			return 0;
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
				Float cnum2= (float) num2;
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
		System.err.print("Error en Operand");
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
	
	
	
	
	
	
	
	
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * Errores
	 * 
	 * 
	 * 	
	 */
	public String error_types(String found, String[] should, int line, int col){
		String Error="Error semantico: tipos de datos incompatibles. Se esperaba:";
		for (int i = 0; i < should.length; i++) {
			Error+=" "+should[i];
			if ((i+1)<should.length)
				Error+=",";
		}
		Error=(Error+"; se encontro: "+found+".\n");
		System.err.printf("<%d:%d> "+Error, line, col);
		System.exit(-1);
		return Error;
	}
	
	
	public Object casting(String typeVar, String typeRes, Object res, int line, int col){
		if (typeVar.equals("integer")){
			Integer resu;
			if (typeRes.equals("long")){
				resu=(int)(long) res;
				if (Math.abs(resu)>32767){
					resu=-25536;
				}
				return resu;
			}else if (typeRes.equals("double")){
				resu=(int)(double)res;
				if (Math.abs(resu)>32767){
					resu=-25536;
				}
				return resu;
			}else if (typeRes.equals("single")){
				resu=(int)(float) res;
				if (Math.abs(resu)>32767){
					resu=-25536;
				}
				return resu;
			}else{
				error_casting();
			}
		}else if(typeVar.equals("long")){
			Long resu;
			if (typeRes.equals("integer")){
				resu=(long)(int) res;
				return resu;
			}else if (typeRes.equals("double")){
				resu=(long)(double)res;
				return resu;
			}else if (typeRes.equals("single")){
				resu=(long)(float) res;
				return resu;
			}else{
				error_casting();
			}
		}else if(typeVar.equals("single")){
			Float resu;
			if (typeRes.equals("integer")){
				resu=(float)(int) res;
				return resu;
			}else if (typeRes.equals("double")){
				double tempRes=(double)res;
				Double d=tempRes;
				String decimal=d.toString();
				List<String> doublenum = Arrays.asList(decimal.split("."));
				String decimalPart=doublenum.get(1);
				if (decimalPart.length()>5){
					String singlepart = decimal.substring(0,5);
					String number= doublenum.get(0)+'.'+singlepart;
					Double tmp= Double.parseDouble(number);
					resu=(float)(double) tmp;
				}else{
					resu=(float) tempRes;
				}
				return resu;
			}else if (typeRes.equals("long")){
				resu=(float)(long) res;
				return resu;
			}else{
				error_casting();
			}
		}else if(typeVar.equals("double")){
			Double resu;
			if (typeRes.equals("integer")){
				resu=(double)(int) res;
				return resu;
			}else if (typeRes.equals("long")){
				resu=(double)(long)res;
				return resu;
			}else if (typeRes.equals("single")){
				resu=(double)(float) res;
				return resu;
			}else{
				error_casting();
			}
		}
		error_casting();
		return null;
	}
	
	public void error_casting(){
		System.err.print("Está haciendo mal el casting");
		System.exit(-1);
	}

	
	public void error_tiempo_exe(int pos, int line, int col){
		System.err.printf("<%d:%d> Error en tiempo de ejecución: Se accedio a una posicion no valida del arreglo: "+pos,line,col);
		System.exit(-1);
	}
	
	public void check_Error_var(String name, String type, int line, int col){
		if (tableVar.containsKey(name)){
			error_red_var(name, line, col);

		}
	}
	
	public void check_Error_array(String name, int line, int col){
		if (tableArr.containsKey(name)){
			error_red_arr( name,  line,  col);
		}
	}
	
	public void error_red_var(String name, int line, int col){
		System.err.printf("\n<%d:%d> Error semantico: '"+name+"' ya ha sido declarado.",line,col);
		System.exit(-1);
	}
	
	public void error_red_arr(String name, int line, int col){
		System.err.printf("\n<%d:%d> Error semantico: El arreglo '"+name+"' ya ha sido declarado.",line,col);
		System.exit(-1);
	}
	public void error_constant(String name, int line, int col){
		System.err.printf("<%d:%d> Error semantico: '"+name+"' no puede ser modificado.", line, col);
		System.exit(-1);
	}
	

}
