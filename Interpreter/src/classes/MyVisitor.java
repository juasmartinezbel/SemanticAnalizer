package classes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

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
	
	public class CharFun <X, Y, Z>{
		public final X x; 
	    public final Y y;
	    public final Z z;
	    public CharFun(X x, Y y, Z z){ 
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

	        if (!(other instanceof CharFun)){
	            return false;
	        }

	        CharFun<X,Y,Z> other_ = (CharFun<X,Y,Z>) other;

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
	
	public class CharSub <X, Y>{
		public final X x; 
	    public final Y y;
	    public CharSub(X x, Y y){ 
	        this.x = x; 
	        this.y = y;
	    }
	    
	    @Override
	    public String toString() {
	        return "(" + x + "," + y + ")";
	    }

	    @Override
	    public boolean equals(Object other) {
	        if (other == this) {
	            return true;
	        }

	        if (!(other instanceof CharSub)){
	            return false;
	        }

	        CharSub<X,Y> other_ = (CharSub<X,Y>) other;

	        // this may cause NPE if nulls are valid values for x or y. The logic may be improved to handle nulls properly, if needed.
	        return other_.x.equals(this.x) && other_.y.equals(this.y);
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
							 //Tipo  //N_Arg   //Tipo argumentos
	HashMap<String, CharFun<String, String[], String[]>> tableFun = new HashMap<>();
						
	HashMap<String, CharSub<String[], String[]>> tableSub = new HashMap<>(); 
	
	public String[] firstDeclarations; 
	public MyLanguageParser.Qb64Context root;
	
 	@Override
	public T visitQb64 (MyLanguageParser.Qb64Context ctx) {
	    root=ctx;
 		List<MyLanguageParser.InstrContext> instruction = ctx.instr();
	    
	    List<MyLanguageParser.FunctionsubContext> functionSub = ctx.functionsub();
	    firstDeclarations=new String[functionSub.size()];
	    
	    int count=0;
	    for (MyLanguageParser.FunctionsubContext f : functionSub){
	        setFirs(f, count);
	        count++;
	    }
	    for (MyLanguageParser.FunctionsubContext f : functionSub){
	    	visitToSave(f);
	    }
	    for (MyLanguageParser.InstrContext i : instruction)
	        visit(i);

	    return null;
	}
	
	public T getFunction(MyLanguageParser.Qb64Context ctx){
		return null;
	}
 	

	public void setFirs(MyLanguageParser.FunctionsubContext ctx, int Count){
		if(ctx.fun()!=null){	
			String name=ctx.fun().funidn().ID().getText();
			firstDeclarations[Count]=name;
		}else{
			String name=ctx.sub().subidn().ID().getText();
			firstDeclarations[Count]=name;
		}
	}
	
 	public void visitToSave(MyLanguageParser.FunctionsubContext ctx){
		int count=0;
 		if(ctx.fun()!=null){
 			
			String name=ctx.fun().funidn().ID().getText();
			String suffix= ctx.fun().funidn().sufix().getText();
			String classVar;
			if (suffix.equals("")){
				classVar="single";
			}else{
				classVar=varClass(suffix);
			}
			int line= ctx.fun().funidn().ID().getSymbol().getLine();
			int col= ctx.fun().funidn().ID().getSymbol().getCharPositionInLine()+1;
			if(tableFun.containsKey(name) || tableSub.containsKey(name)){
				error_red_var(name, line, col);
			}
			//System.out.println("Fun: "+name);
			
			String[] arguments;
			String[] argumentsN;
			if (ctx.fun().funidn().parfu().PIZQ()!=null){
			    List<MyLanguageParser.ArgContext> argu = ctx.fun().funidn().parfu().arg();
			    arguments=new String [argu.size()];
			    argumentsN=new String [argu.size()];
			    for (MyLanguageParser.ArgContext f : argu){
			    	String [] argument=parfu(f);
			    	arguments[count]=argument[0];
			    	argumentsN[count]=argument[1].toLowerCase();
			    	//System.out.println(argument);
			    	count++;
			    }
			}else{
				arguments = new String[0];
				argumentsN= new String[0];
			}
			Object d=define(classVar, null);
			CharFun<String, String[], String[]> newFun;
			newFun= new CharFun(classVar, argumentsN, arguments);
			tableFun.put(name, newFun);
			CharVar<Object, String, String> newVar;
			
			newVar= new CharVar(d, classVar, "global");
			tableVar.put(name, newVar);

			name=name+suffix;
			newFun= new CharFun(classVar, argumentsN, arguments);
			tableFun.put(name, newFun);
		}else if (ctx.sub()!=null){
			String name=ctx.sub().subidn().ID().getText();
			int line= ctx.sub().subidn().ID().getSymbol().getLine();
			int col= ctx.sub().subidn().ID().getSymbol().getCharPositionInLine()+1;
			if(tableFun.containsKey(name) || tableSub.containsKey(name)){
				error_red_var(name, line, col);
			}
			//System.out.println("Sub: "+name);
			String[] arguments;
			String[] argumentsN;
			if (ctx.sub().subidn().parfu().PIZQ()!=null){
			    List<MyLanguageParser.ArgContext> argu = ctx.sub().subidn().parfu().arg();
			    arguments=new String [argu.size()];
			    argumentsN=new String [argu.size()];
			    for (MyLanguageParser.ArgContext f : argu){
			    	String [] argument=parfu(f);
			    	arguments[count]=argument[0];
			    	argumentsN[count]=argument[1].toLowerCase();
			    	//System.out.println(argument);
			    	count++;
			    }
			}else{
				arguments = new String[0];
				argumentsN = new String[0];
			}
			CharSub<String[], String[]> newSu;
			newSu= new CharSub(arguments, argumentsN);
			tableSub.put(name, newSu);
		}
	}
 	
 	public String[] parfu(MyLanguageParser.ArgContext ctx){
 		String argname= ctx.ID().getText().toLowerCase();
 		int line=ctx.ID().getSymbol().getLine();
 		int col=ctx.ID().getSymbol().getCharPositionInLine()+1;
 		if (ctx.sufix()!=null){
 			String suffix=ctx.sufix().getText();
 			String suffix2=suffix;
 			if (suffix.equals("")){
 				suffix2="!";
 			}
 			String varClass= varClass(suffix2).toLowerCase();
 			String [] FA={varClass, argname+suffix};
 			if(Arrays.asList(firstDeclarations).contains(argname+suffix)){
 				error_red_var(argname, line, col);
 			}
 			return FA;
 		}else{
 			String varClass= ctx.argpa().TYPE().toString().toLowerCase();
 			if (varClass.equals("")){
 				varClass="single";
 			}
 			String [] FA={varClass.toLowerCase()+"[]", argname};
 			if(Arrays.asList(firstDeclarations).contains(argname)){
 				error_red_var(argname, line, col);
 			}
 			return FA;
 		}
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
			if(ctx.getStart().getText().equalsIgnoreCase("const")){
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

		String[] shouldg={"double","integer","long","single"};
		
		if(ctx.idn().par().PIZQ()!=null){
			Object[] Variables= (Object[]) visitIdn(ctx.idn(), type_var);
			Object res= visitExpr(ctx.expr());
			String tyr=TypeOf(res);
			int line= ctx.expr().getStart().getLine();
			int col= ctx.expr().getStart().getCharPositionInLine()+1;
			CharArr<Object[], String, String, Integer[]> changedVar;
			String Variable=Variables[0].toString().toLowerCase();
			Integer Posicion=(Integer)Variables[1];
			
			String tyv= tableArr.get(Variable).x;
			String y= tableArr.get(Variable).y;
			Integer[] z= tableArr.get(Variable).z;
			Object[] w = tableArr.get(Variable).w;
			if (tyv.equalsIgnoreCase("string")){
				String[] should={"string"};
				if (tyr.equalsIgnoreCase("string")){
					w[Posicion]=res.toString();
					changedVar=new CharArr(w, tyv, y, z);
					tableArr.put(Variable.toString().toLowerCase(), changedVar);
				}else{
					error_types(QB64Type(tyr), should, line, col);
				}
			}else if(tyv.equalsIgnoreCase("integer")){
				if (tyr.equalsIgnoreCase("integer")){
					w[Posicion]= (Integer) (int) res;
					changedVar=new CharArr(w, tyv, y, z);
					tableArr.put(Variable.toString().toLowerCase(), changedVar);
				}else if (tyr.equalsIgnoreCase("string")){
					error_types(QB64Type(tyr), shouldg, line, col);
				}else{
					w[Posicion]=(Integer) casting("integer", QB64Type(tyr), res, line, col);
					changedVar=new CharArr(w, tyv, y, z);
					tableArr.put(Variable.toString().toLowerCase(),changedVar);
				}
			}else if(tyv.equalsIgnoreCase("long")){
				if (tyr.equalsIgnoreCase("long")){
					w[Posicion]= (Long) (long) res;
					changedVar=new CharArr(w, tyv, y, z);
					tableArr.put(Variable.toString().toLowerCase(), changedVar);
				}else if (tyr.equalsIgnoreCase("string")){
					error_types(QB64Type(tyr), shouldg, line, col);
				}else{
					w[Posicion]= (Long) casting("long", QB64Type(tyr), res, line, col);
					changedVar=new CharArr(w, tyv, y, z);
					tableArr.put(Variable.toString().toString().toLowerCase(), changedVar);
				}
			}else if(tyv.equalsIgnoreCase("single")){
				if (tyr.equalsIgnoreCase("float")){
					w[Posicion]= (Float) (float) res;
					changedVar=new CharArr(w, tyv, y, z);
					tableArr.put(Variable.toString().toLowerCase(), changedVar);
				}else if (tyr.equalsIgnoreCase("string")){
					error_types(QB64Type(tyr), shouldg, line, col);
				}else{
					w[Posicion]=(Float) casting("single", QB64Type(tyr), res, line, col);
					changedVar=new CharArr(w, tyv, y, z);
					tableArr.put(Variable.toString().toString().toLowerCase(), changedVar);
				}
			}else if(tyv.equalsIgnoreCase("double")){
				if (tyr.equalsIgnoreCase("double")){
					w[Posicion]=(Double) (double) res;
					changedVar=new CharArr(w, tyv, y, z);
					tableArr.put(Variable.toString().toString().toLowerCase(), changedVar);
				}else if (tyr.equalsIgnoreCase("string")){
					error_types(QB64Type(tyr), shouldg, line, col);
				}else{
					w[Posicion]= (Double)(double) casting("double", QB64Type(tyr), res, line, col);
					changedVar=new CharArr(w, tyv, y, z);
					tableArr.put(Variable.toString().toString().toLowerCase(), changedVar);
				}

			}
			/*System.out.println("\n---------------------\n"+Variable);
			for (int i = 0; i < w.length; i++) {
				System.out.print(w[i].toString()+", ");
			}
			System.out.println("\n"+Posicion);*/
			return null;
			
			
			
			
			
			
			
			
			
		//Variables NO arreglos
		}else{
			Object Variable=visitIdn(ctx.idn(), type_var).toString().toLowerCase();
			String tyv=tableVar.get(Variable).y;
			CharVar<Object, String, String> changedVar;
			String z= tableVar.get(Variable).z;
			Object res= visitExpr(ctx.expr());
			
			String tyr=TypeOf(res);
			int line= ctx.expr().getStart().getLine();
			int col= ctx.expr().getStart().getCharPositionInLine()+1;
			if (tyv.equalsIgnoreCase("string")){
				String[] should={"string"};
				if (tyr.equalsIgnoreCase("string")){
					String x=res.toString();
					changedVar=new CharVar(x, tyv, z);
					tableVar.put(Variable.toString().toString().toLowerCase(), changedVar);
				}else{
					error_types(QB64Type(tyr), should, line, col);
				}
			}else if(tyv.equalsIgnoreCase("integer")){
				if (tyr.equalsIgnoreCase("integer")){
					Integer x= (int) res;
					changedVar=new CharVar(x, tyv, z);
					tableVar.put(Variable.toString().toString().toLowerCase(), changedVar);
				}else if (tyr.equalsIgnoreCase("string")){
					error_types(QB64Type(tyr), shouldg, line, col);
				}else{
					Integer x=(Integer) casting("integer", QB64Type(tyr), res, line, col);
					changedVar=new CharVar(x, tyv, z);
					tableVar.put(Variable.toString().toString().toLowerCase(), changedVar);
				}
			}else if(tyv.equalsIgnoreCase("long")){
				if (tyr.equalsIgnoreCase("long")){
					Long x= (long) res;
					changedVar=new CharVar(x, tyv, z);
					tableVar.put(Variable.toString().toString().toLowerCase(), changedVar);
				}else if (tyr.equalsIgnoreCase("string")){
					error_types(QB64Type(tyr), shouldg, line, col);
				}else{
					Long x=(Long) casting("long", QB64Type(tyr), res, line, col);
					changedVar=new CharVar(x, tyv, z);
					tableVar.put(Variable.toString().toString().toLowerCase(), changedVar);
				}
			}else if(tyv.equalsIgnoreCase("single")){
				if (tyr.equalsIgnoreCase("float")){
					Float x= (float) res;
					changedVar=new CharVar(x, tyv, z);
					tableVar.put(Variable.toString().toString().toLowerCase(), changedVar);
				}else if (tyr.equalsIgnoreCase("string")){
					error_types(QB64Type(tyr), shouldg, line, col);
				}else{
					Float x=(Float) casting("single", QB64Type(tyr), res, line, col);
					changedVar=new CharVar(x, tyv, z);
					tableVar.put(Variable.toString().toString().toLowerCase(), changedVar);
				}
			}else if(tyv.equalsIgnoreCase("double")){
				if (tyr.equalsIgnoreCase("double")){
					Double x= (double) res;
		
					changedVar=new CharVar(x, tyv, z);
					tableVar.put(Variable.toString().toString().toLowerCase(), changedVar);
				}else if (tyr.equalsIgnoreCase("string")){
					error_types(QB64Type(tyr), shouldg, line, col);
				}else{
					Double x=(double) casting("double", QB64Type(tyr), res, line, col);
					changedVar=new CharVar(x, tyv, z);
					tableVar.put(Variable.toString().toString().toLowerCase(), changedVar);
				}
			}

			//System.out.println("--------------------------\n"+Variable);
			//System.out.println(tableVar.get(Variable).toString());
		}
		return null;
	}
	
	public T visitIdn(MyLanguageParser.IdnContext ctx, String type_var){
		String name=ctx.ID().getText();

		
		name=name.toLowerCase();
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
		
		subExists(name+suffix, type_var, col, line);
		Object[] toR=new Object[2];
		if (!inFunction){
			if (ctx.par().PIZQ()==null){
				if(funExists(name, type_var, col, line)){
					toR[0]=visitFuc(ctx, name);
					
					return (T)toR[0];
				}else if(suffix.equals("$")){
					if(funExists(name+suffix, type_var, col, line)){
						toR[0]=visitFuc(ctx, name+suffix);
						return (T)toR[0];
					}
				}
				
			}
			if(funExists(name, type_var, col, line)){
				toR[0]=visitFuc(ctx, name);
				toR[1]= (-1);
				return (T)toR;
			}else if(suffix.equals("$")){
				if(funExists(name+suffix, type_var, col, line)){
					toR[0]=visitFuc(ctx, name+suffix);
					toR[1]= (-1);
					return (T)toR;
				}
			}
			
		}else{
			if (!type_var.equals("")){
				if((name+suffix).equalsIgnoreCase(CurrentFunction.peek())){
						return (T) (name+suffix);
				}else if(suffix.equalsIgnoreCase("")){
					if((name+suffix).equalsIgnoreCase(CurrentFunction.peek()))
						return (T) (name+suffix);
				}
				
			}else{
				if (ctx.par().PIZQ()==null){
					if(funExists(name, type_var, col, line)){
						toR[0]=visitFuc(ctx, name);
						return (T)toR[0];
					}else if(suffix.equals("$")){
						if(funExists(name+suffix, type_var, col, line)){
							toR[0]=visitFuc(ctx, name+suffix);
							return (T)toR[0];
						}
					}
					
				}
				if(funExists(name, type_var, col, line)){
					toR[0]=visitFuc(ctx, name);
					toR[1]= (-1);
					return (T)toR;
				}else if(suffix.equals("$")){
					if(funExists(name+suffix, type_var, col, line)){
						toR[0]=visitFuc(ctx, name+suffix);
						toR[1]= (-1);
						return (T)toR;
					}
				}
				
			}
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
				Integer[] real= tableArr.get(variable).z;
				for (int i = 0; i < arguments.length; i++) {
					if(real[i]<arguments[i]){
						int line0= ctx.par().pos(i).getStart().getLine();
						int col0= ctx.par().pos(i).getStart().getCharPositionInLine()+1;
						error_tiempo_exe(arguments[i], line, col);
					}
				}
				Object [] variables= new Object[2];
				variables[0]=variable;
				variables[1]=posicion(arguments, real);
				return (T) variables;
			}else{
				
				if (type_var.equalsIgnoreCase("")){
					type_var="variable";
				}
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
				if (suffix.equalsIgnoreCase("!") || suffix.equalsIgnoreCase("")){
					newVar=new CharArr(vari, varClass, type_var, arguments);
					
					variable=name;
					if (arrExists(name, ""))
						variable=name+'!';
					tableArr.put(variable.toString().toLowerCase(), newVar);
					Object [] variables= new Object[2];
					variables[0]=variable;
					variables[1]=posicion(arguments, arguments);
					return (T) variables;
				}else{
					newVar=new CharArr(vari, varClass, type_var, arguments);
					variable=name+suffix;
					tableArr.put(variable.toString().toLowerCase(), newVar);
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
				if (type_var.equalsIgnoreCase("")){
					type_var="variable";
				}
				CharVar<Object, String, String> newVar;
				String variable;
				if (suffix=="")
					varClass="single";
				Object vari=define(varClass, null);
				if (suffix.equalsIgnoreCase("!") || suffix.equalsIgnoreCase("")){
					newVar=new CharVar(vari, varClass, type_var);
					variable=name;
					if (varExists(name, ""))
						variable=name+'!';
					tableVar.put(variable.toString().toLowerCase(), newVar);
					return (T) variable;
				}else{
					newVar=new CharVar(vari, varClass, type_var);
					variable=name+suffix;
					tableVar.put(variable.toString().toLowerCase(), newVar);
					return (T) variable;
				}
			}
		}
		
	}
	
	public boolean arrExists(String var, String varClass){
		if (tableArr.containsKey(var)){
			
			String reserved=tableArr.get(var).x;
			
			if (varClass.equalsIgnoreCase("")){
				return true;
			}else if (varClass.equalsIgnoreCase(reserved)){
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
			if (varClass.equalsIgnoreCase("")){
				return true;
			}else if (varClass.equalsIgnoreCase(reserved)){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
	
	
	public boolean funExists(String name, String var_type, int col, int line){
		if (var_type.equalsIgnoreCase("")){
			if (tableFun.containsKey(name)){
				return true;
			}else{
				return false;
			}
		}else{
			if (tableFun.containsKey(name)){
				error_red_var(name, line, col);
				return true;
			}else{
				return false;
			}
		}	
	}
	
	
	public boolean subExists(String name, String var_type, int col, int line){
		if (tableSub.containsKey(name)){
			if(var_type.equalsIgnoreCase("")){
				err_proc(name, col, line);
			}else{
				error_red_var(name, line, col);
			}
			return true;
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
		if (type_var.equalsIgnoreCase("")){
			return;
		}
		if(type_var.equalsIgnoreCase("const")){
			error_red_var(name, line, col);
		}
		if(tableArr.containsKey(name)){
			String local=tableArr.get(name).y;
			if(local.equalsIgnoreCase("const"))
				error_constant(name, line, col);
		}else{
			System.err.print("How arr");
			System.exit(-1);
		}
	}
	
	public void check_ConstantVar(String name, int line, int col, String type_var){
		if (type_var.equalsIgnoreCase("")){
			return;
		}
		if(type_var.equalsIgnoreCase("const")){
			error_red_var(name, line, col);
		}
		if(tableVar.containsKey(name)){
			String local=tableVar.get(name).z;
			if(local.equalsIgnoreCase("const"))
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
		if (suffix.equalsIgnoreCase("%")){
			return "integer";
		}else if (suffix.equalsIgnoreCase("#")){
			return "double";
		}else if (suffix.equalsIgnoreCase("!")){
			return "single";
		}else if (suffix.equalsIgnoreCase("&")){
			return "long";
		}else if (suffix.equalsIgnoreCase("$")){
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
		if(ctx.shared().getStart().getText().equalsIgnoreCase("shared")){
			typeVar="global";
		}
		myTypeArray[0]=typeVar;
		String valType= new String(ctx.TYPE().getText());
		valType=valType.toLowerCase();
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
		int col= ctx.expr().getStart().getCharPositionInLine()+1;
		if (toa.equalsIgnoreCase("long")){
			Long uv= (Long) v;
			Integer end=(int)(long) uv;
			if (end < 0){
				error_tiempo_exe(end, line, col);
			}
			return (T) end;
		}else if (toa.equalsIgnoreCase("integer")){
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
		
		if(Arrays.asList(firstDeclarations).contains(name.toLowerCase())){
			error_red_var(name, line, col);
		}
		
		if (ctx.par().PIZQ()!=null){
			Integer [] arguments= (Integer[]) visitPar(ctx.par());
			CharArr<Object[], String, String, Integer[]> variable;
			int size=arguments[0];
			for (int i = 1; i < arguments.length; i++) {
				size=(int)size*arguments[i];
			}
			check_Error_array(name,line,col);
			if(typeVar[1].equalsIgnoreCase("integer")){
				Integer [] vari = new Integer[size];
				for (int i=0; i<size; i++){
					vari[i]=(int)define(typeVar[1],null);
				}
				variable= new CharArr(vari,typeVar[1], typeVar[0], arguments);
				tableArr.put(name.toString().toLowerCase(), variable);
				//tableArr.put(name+'%', variable);
			}else if(typeVar[1].equalsIgnoreCase("double")){
				Double [] vari = new Double[size];
				for (int i=0; i<size; i++){
					vari[i]=(double)define(typeVar[1],null);
				}
				variable= new CharArr(vari,typeVar[1], typeVar[0], arguments);
				tableArr.put(name.toString().toLowerCase(), variable);
				//tableArr.put(name+'#', variable);
			}else if (typeVar[1].equalsIgnoreCase("single")){
				Float [] vari = new Float[size];
				for (int i=0; i<size; i++){
					vari[i]=(float)define(typeVar[1],null);
				}
				variable= new CharArr(vari,typeVar[1], typeVar[0], arguments);
				tableArr.put(name.toString().toLowerCase(), variable);
				//tableArr.put(name+'!', variable);
			}else if (typeVar[1].equalsIgnoreCase("long")){
				Long [] vari = new Long[size];
				for (int i=0; i<size; i++){
					vari[i]=(long)define(typeVar[1],null);
				}
				variable= new CharArr(vari,typeVar[1], typeVar[0], arguments);
				tableArr.put(name.toString().toLowerCase(), variable);
				//tableArr.put(name+'&', variable);
			}else if (typeVar[1].equalsIgnoreCase("string")){
				String [] vari = new String[size];
				for (int i=0; i<size; i++){
					vari[i]=define(typeVar[1],null).toString();
				}
				variable= new CharArr(vari,typeVar[1], typeVar[0], arguments);
				tableArr.put(name.toString().toLowerCase(), variable);
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
			if(typeVar[1].equalsIgnoreCase("integer")){
				Integer v= (int)vari;
				variable= new CharVar(v,typeVar[1], typeVar[0]);
				tableVar.put(name.toString().toLowerCase(), variable);
				//tableVar.put(name+'%', variable);
			}else if(typeVar[1].equalsIgnoreCase("double")){
				Double v= (double) vari;
				variable= new CharVar(v,typeVar[1], typeVar[0]);
				tableVar.put(name.toString().toLowerCase(), variable);
				//tableVar.put(name+'#', variable);
			}else if (typeVar[1].equalsIgnoreCase("single")){
				Float v= (float)vari;
				variable= new CharVar(v,typeVar[1], typeVar[0]);
				tableVar.put(name.toString().toLowerCase(), variable);
				//tableVar.put(name+'!', variable);
			}else if (typeVar[1].equalsIgnoreCase("long")){
				Long v= (long)vari;
				variable= new CharVar(v,typeVar[1], typeVar[0]);
				tableVar.put(name.toString().toLowerCase(), variable);
				//tableVar.put(name+'&', variable);
			}else if (typeVar[1].equalsIgnoreCase("string")){
				String v= vari.toString();
				variable= new CharVar(v,typeVar[1], typeVar[0]);
				tableVar.put(name.toString().toLowerCase(), variable);
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
		type=type.toLowerCase();
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
			case "float":
				if (obj==null){
					return (float)0.0;
				}else{
					return (Float) obj;
				}
			case "long":
				if (obj==null){
					return (long) 0;
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
			Object expr=visitExpr(ctx.expr());
			if (!(expr instanceof String)){
				Double u= Double.parseDouble(expr.toString());
				Integer v= (int)(double) u;
				double uv = (double)(int)v;
				if (String.valueOf(uv).equals(u.toString())){
					expr=(Object) (int) v;
				}else{
					expr=(Object) u;
				}
			}
			printTo+=expr.toString()+" ";
		}
		
	    List<MyLanguageParser.ToprintContext> ToPrint = ctx.toprint();
	    //List<MyLanguageParser.FunctionsubContext> functionSub = ctx.functionsub();

	    //for (MyLanguageParser.FunctionsubContext f : functionSub)
	    //    visit(f);

	    for (MyLanguageParser.ToprintContext i : ToPrint){
	    	Object expr=visitToprint(i);
			if (!(expr instanceof String)){
				Double u= Double.parseDouble(expr.toString());
				Integer v= (int)(double) u;
				double uv = (double)(int)v;
				if (String.valueOf(uv).equals(u.toString())){
					expr=(Object) (int) v;
				}else{
					expr=(Object) u;
				}
			}
	    	printTo+=expr.toString()+" ";
	    }
		return (T) printTo.substring(0, printTo.length()-1);
	}
	
	@Override
	public T visitToprint(MyLanguageParser.ToprintContext ctx){
		return visitExpr(ctx.expr());
	}
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * 
	 * Input method
	 * 
	 * 
	 */
	@Override 
	public T visitInput(MyLanguageParser.InputContext ctx){
		return visitInpara(ctx.inpara());
		
	}
	
	@Override
	public T visitInpara(MyLanguageParser.InparaContext ctx) { 
		if(ctx.STRING()!=null){
			String mess=ctx.STRING().toString();
			System.out.println(mess.substring(1, mess.length()-1));
		}
	    List<MyLanguageParser.IdnContext> ids = ctx.idn();
	    int count=0;
	    for (MyLanguageParser.IdnContext i : ids){
			Scanner reader = new Scanner(System.in);
			Object n=reader.nextLine();
			idInput(ctx, n, count);
			count++;
	    }
		return null;
	}

	public void idInput(MyLanguageParser.InparaContext ctx, Object re, int count){
		String tyr;
		Object res=isNumeric(re.toString());
		res=Double.parseDouble(re.toString());
		tyr=TypeOf(res);

		String type_var="";
		int line= ctx.idn(count).getStart().getLine();
		int col= ctx.idn(count).getStart().getCharPositionInLine()+1;
		String[] shouldg={"double","integer","long","single"};
		
		
		
		if(ctx.idn(count).par().PIZQ()!=null){
			Object[] Variables= (Object[]) visitIdn(ctx.idn(count), type_var);
			CharArr<Object[], String, String, Integer[]> changedVar;
			String Variable=Variables[0].toString();
			Integer Posicion=(Integer)Variables[1];
			
			String tyv= tableArr.get(Variable).x;
			String y= tableArr.get(Variable).y;
			Integer[] z= tableArr.get(Variable).z;
			Object[] w = tableArr.get(Variable).w;
			if (tyv.equalsIgnoreCase("string")){
				w[Posicion]=re.toString();
				changedVar=new CharArr(w, tyv, y, z);
				tableArr.put(Variable.toString().toLowerCase(), changedVar);
			}else if(tyv.equalsIgnoreCase("integer")){
				if (tyr.equalsIgnoreCase("integer")){
					w[Posicion]= (Integer) (int) res;
					changedVar=new CharArr(w, tyv, y, z);
					tableArr.put(Variable.toString().toLowerCase(), changedVar);
				}else if (tyr.equalsIgnoreCase("string")){
					error_types(QB64Type(tyr), shouldg, line, col);
				}else{
					w[Posicion]=(Integer) casting("integer", QB64Type(tyr), res, line, col);
					changedVar=new CharArr(w, tyv, y, z);
					tableArr.put(Variable.toString().toLowerCase(), changedVar);
				}
			}else if(tyv.equalsIgnoreCase("long")){
				if (tyr.equalsIgnoreCase("long")){
					w[Posicion]= (Long) (long) res;
					changedVar=new CharArr(w, tyv, y, z);
					tableArr.put(Variable.toString().toLowerCase(), changedVar);
				}else if (tyr.equalsIgnoreCase("string")){
					error_types(QB64Type(tyr), shouldg, line, col);
				}else{
					w[Posicion]= (Long) casting("long", QB64Type(tyr), res, line, col);
					changedVar=new CharArr(w, tyv, y, z);
					tableArr.put(Variable.toString().toLowerCase(), changedVar);
				}
			}else if(tyv.equalsIgnoreCase("single")){
				if (tyr.equalsIgnoreCase("float")){
					w[Posicion]= (Float) (float) res;
					changedVar=new CharArr(w, tyv, y, z);
					tableArr.put(Variable.toString().toLowerCase(), changedVar);
				}else if (tyr.equalsIgnoreCase("string")){
					error_types(QB64Type(tyr), shouldg, line, col);
				}else{
					w[Posicion]=(Float) casting("single", QB64Type(tyr), res, line, col);
					changedVar=new CharArr(w, tyv, y, z);
					tableArr.put(Variable.toString().toLowerCase(), changedVar);
				}
			}else if(tyv.equalsIgnoreCase("double")){
				if (tyr.equalsIgnoreCase("double")){
					w[Posicion]=(Double) (double) res;
					changedVar=new CharArr(w, tyv, y, z);
					tableArr.put(Variable.toString().toLowerCase(), changedVar);
				}else if (tyr.equalsIgnoreCase("string")){
					error_types(QB64Type(tyr), shouldg, line, col);
				}else{
					w[Posicion]= (Double)(double) casting("double", QB64Type(tyr), res, line, col);
					changedVar=new CharArr(w, tyv, y, z);
					tableArr.put(Variable.toString().toLowerCase(), changedVar);
				}

			}
			//System.out.println("\n---------------------\n"+Variable);
			//for (int i = 0; i < w.length; i++) {
			//	System.out.print(w[i].toString()+", ");
			//}
			
			
			
			
			
			
			
			
			
		//Variables NO arreglos
		}else{
			Object Variable=visitIdn(ctx.idn(count), type_var);
			String tyv=tableVar.get(Variable).y;
			CharVar<Object, String, String> changedVar;
			String z= tableVar.get(Variable).z;
			if (tyv.equalsIgnoreCase("string")){
				String x=re.toString();
				changedVar=new CharVar(x, tyv, z);
				tableVar.put(Variable.toString().toLowerCase(), changedVar);
			}else if(tyv.equalsIgnoreCase("integer")){
				if (tyr.equalsIgnoreCase("integer")){
					Integer x= (int) res;
					changedVar=new CharVar(x, tyv, z);
					tableVar.put(Variable.toString().toLowerCase(), changedVar);
				}else if (tyr.equalsIgnoreCase("string")){
					error_types(QB64Type(tyr), shouldg, line, col);
				}else{
					Integer x=(Integer) casting("integer", QB64Type(tyr), res, line, col);
					changedVar=new CharVar(x, tyv, z);
					tableVar.put(Variable.toString().toLowerCase(), changedVar);
				}
			}else if(tyv.equalsIgnoreCase("long")){
				if (tyr.equalsIgnoreCase("long")){
					Long x= (long) res;
					changedVar=new CharVar(x, tyv, z);
					tableVar.put(Variable.toString().toLowerCase(), changedVar);
				}else if (tyr.equalsIgnoreCase("string")){
					error_types(QB64Type(tyr), shouldg, line, col);
				}else{
					Long x=(Long) casting("long", QB64Type(tyr), res, line, col);
					changedVar=new CharVar(x, tyv, z);
					tableVar.put(Variable.toString().toLowerCase(), changedVar);
				}
			}else if(tyv.equalsIgnoreCase("single")){
				if (tyr.equalsIgnoreCase("float")){
					Float x= (float) res;
					changedVar=new CharVar(x, tyv, z);
					tableVar.put(Variable.toString().toLowerCase(), changedVar);
				}else if (tyr.equalsIgnoreCase("string")){
					error_types(QB64Type(tyr), shouldg, line, col);
				}else{
					Float x=(Float) casting("single", QB64Type(tyr), res, line, col);
					changedVar=new CharVar(x, tyv, z);
					tableVar.put(Variable.toString().toLowerCase(), changedVar);
				}
			}else if(tyv.equalsIgnoreCase("double")){
				if (tyr.equalsIgnoreCase("double")){
					Double x= (double) res;
					changedVar=new CharVar(x, tyv, z);
					tableVar.put(Variable.toString().toLowerCase(), changedVar);
				}else if (tyr.equalsIgnoreCase("string")){
					error_types(QB64Type(tyr), shouldg, line, col);
				}else{
					Double x=(double) casting("double", QB64Type(tyr), res, line, col);
					changedVar=new CharVar(x, tyv, z);
					tableVar.put(Variable.toString().toString().toLowerCase(), changedVar);
				}
			}

			//System.out.println("--------------------------\n"+Variable);
			//System.out.println(tableVar.get(Variable).toString());
		}
	}
	
	public Object isNumeric(String str)  
	{  
	  try  
	  {  
	    double d = Double.parseDouble(str); 
	    
	  }  
	  catch(NumberFormatException nfe)  
	  {  
	    return (String) str;
	  }  
	  double d = Double.parseDouble(str);
	  return (Double) d*1.0;  
	}
	
	
	
	
	

	
	
	
	
	/*
	 * 
	 * While method
	 * 
	 * 
	 */
	@Override
	public T visitWhilec(MyLanguageParser.WhilecContext ctx){
		Object dow=visitExpr(ctx.expr());
		int line=ctx.expr().getStart().getLine();
		int col=ctx.expr().getStart().getCharPositionInLine()+1;
		String tydow=TypeOf(dow);
		if (!tydow.equalsIgnoreCase("integer")){
			if (tydow.equalsIgnoreCase("long")){
				dow=(long)dow;
			}else{
				String [] should={"integer"};
				error_types(QB64Type(tydow), should, line, col);
			}
		}

		do{
		    List<MyLanguageParser.InstrContext> instruction = ctx.instr();
		    for (MyLanguageParser.InstrContext i : instruction){
		        visitInstr(i);
		    }
		    dow=visitExpr(ctx.expr());
		
		    
			tydow=TypeOf(dow);
			if (!tydow.equalsIgnoreCase("integer")){
				if (tydow.equalsIgnoreCase("long")){
					dow=(long)dow;
				}else{
					String [] should={"integer"};
					error_types(QB64Type(tydow), should, line, col);
				}
			}
		}while (((int)dow)!=0);
				
		return null;
	}
	
	
	/*
	 * 
	 * Do method
	 * 
	 * 
	 */	
	
	@Override
	public T visitDoc(MyLanguageParser.DocContext ctx) {
		String theDo=(ctx.tdoc().getStart().getText());
		int loop;
		if (theDo.equalsIgnoreCase("while")){
			loop=0;
		}else{
			loop=-1;
		}
		
		
		
		Object dow=visitExpr(ctx.tdoc().expr());
		int line=ctx.tdoc().expr().getStart().getLine();
		int col=ctx.tdoc().expr().getStart().getCharPositionInLine()+1;
		String tydow=TypeOf(dow);
		if (!tydow.equalsIgnoreCase("integer")){
			if (tydow.equalsIgnoreCase("long")){
				dow=(long)dow;
			}else{
				String [] should={"integer"};
				error_types(QB64Type(tydow), should, line, col);
			}
		}

		do{
		    List<MyLanguageParser.InstrContext> instruction = ctx.instr();
		    for (MyLanguageParser.InstrContext i : instruction){
		        visitInstr(i);
		    }
		    dow=visitExpr(ctx.tdoc().expr());
		
		    
			tydow=TypeOf(dow);
			if (!tydow.equalsIgnoreCase("integer")){
				if (tydow.equalsIgnoreCase("long")){
					dow=(long)dow;
				}else{
					String [] should={"integer"};
					error_types(QB64Type(tydow), should, line, col);
				}
			}
		}while (((int)dow)!=loop);
				
		return null;
	}
	
	/*
	 * 
	 * For method
	 * 
	 * 
	 */	
	
	@Override 
	public T visitForc(MyLanguageParser.ForcContext ctx) {
		String step=ctx.step().getStart().getText();
		String i=visitForexpr(ctx.forexpr()).toString();
		Object vali=(Number)(tableVar.get(i).x);
		String typei=tableVar.get(i).y;
		String z=tableVar.get(i).z;
		//System.out.println(tableVar.get(i).toString());
		Object to=visitExpr(ctx.tofor().tothis().expr());
		String typeTo=TypeOf(to);
		int line0=ctx.tofor().tothis().expr().getStart().getLine();
		int col0=ctx.tofor().tothis().expr().getStart().getCharPositionInLine()+1;
		
		
		
	    
	    int line1=-1;
	    int col1=-1;
	    Object stepex=(Integer) 1;
		if(step.equalsIgnoreCase("step")){
			stepex=visitExpr(ctx.step().tothis().expr());
			line1=ctx.step().tothis().expr().getStart().getLine();
			col1=ctx.step().tothis().expr().getStart().getCharPositionInLine()+1;
		}
		String typeStep=TypeOf(stepex);
		
		List<MyLanguageParser.InstrContext> instruction = ctx.instr();
		if (typei.equalsIgnoreCase("integer")){
			int tod=(Integer) casting("integer",  QB64Type(typeTo), to, line0, col0);
			int std=(Integer)casting("integer", QB64Type(typeStep), stepex, line1, col1);
			int j= (int) vali; // j=j+tod;
			CharVar<Object, String, String> newVar;		 
			do {
			    for (MyLanguageParser.InstrContext ins : instruction){
			        visitInstr(ins);
			    }
			    newVar=new CharVar(j+std, "integer", z);
			    tableVar.put(i.toString().toLowerCase(), newVar);
			    vali=(Number)(tableVar.get(i).x);
			    j= (int) vali;
			}while(j <= tod);
		}else if (typei.equalsIgnoreCase("long")){
			long tod=(Long) casting("long",  QB64Type(typeTo), to, line0, col0);
			long std=(Long)casting("long", QB64Type(typeStep), stepex, line1, col1);
			long j= (long) vali; // j=j+tod;
			CharVar<Object, String, String> newVar;		 
			do {
			    for (MyLanguageParser.InstrContext ins : instruction){
			        visitInstr(ins);
			    }
			    newVar=new CharVar(j+std, "long", z);
			    tableVar.put(i.toString().toLowerCase(), newVar);
			    vali=(Number)(tableVar.get(i).x);
			    j= (long) vali;
			}while(j <= tod); 
		}else if (typei.equalsIgnoreCase("single")){
			float tod=(Float) casting("single",  QB64Type(typeTo), to, line0, col0);
			float std=(Float)casting("single", QB64Type(typeStep), stepex, line1, col1);
			float j= (float) vali; // j=j+tod;
			CharVar<Object, String, String> newVar;		 
			do {
			    for (MyLanguageParser.InstrContext ins : instruction){
			        visitInstr(ins);
			    }
			    newVar=new CharVar(j+std, "single", z);
			    tableVar.put(i.toString().toLowerCase(), newVar);
			    vali=(Number)(tableVar.get(i).x);
			    j= (float) vali;
			}while(j <= tod); 
		}else if (typei.equalsIgnoreCase("double")){
			double tod=(Double) casting("double",  QB64Type(typeTo), to, line0, col0);
			double std=(Double)casting("double", QB64Type(typeStep), stepex, line1, col1);
			double j= (double) vali; // j=j+tod;
			CharVar<Object, String, String> newVar;		 
			do {
			    for (MyLanguageParser.InstrContext ins : instruction){
			        visitInstr(ins);
			    }
			    newVar=new CharVar(j+std, "double", z);
			    tableVar.put(i.toString().toLowerCase(), newVar);
			    vali=(Number)(tableVar.get(i).x);
			    j= (double) vali;
			}while(j <= tod); 
		}else{
			System.err.print("Error en esta vaina del for");
			System.exit(-1);
		}
		
		return null;
	}
	
	@Override
	public T visitForexpr(MyLanguageParser.ForexprContext ctx) {
		String name=ctx.ID().getText();
		int line=ctx.ID().getSymbol().getLine();
		int col=ctx.ID().getSymbol().getCharPositionInLine()+1;
		
		String suffix=ctx.forsuf().getText();
		Object res=(Object) visitTothis(ctx.tothis());
		String typeRes=TypeOf(res);
		int line0=ctx.tothis().getStart().getLine();
		int col0=ctx.ID().getSymbol().getCharPositionInLine()+1;
		
		String type_var="variable";
		String varClass="";
		if(!suffix.equalsIgnoreCase("")){
			varClass=varClass(suffix);
		}
		String variable="";
		
		if(varExists(name, varClass)){
			check_ConstantVar(name, line, col, type_var);
			variable=name;
		}else if (varExists(name+suffix, varClass)){
			check_ConstantVar(name+suffix, line, col, type_var);
			variable=name+suffix;
		}else{
			if (type_var.equalsIgnoreCase("")){
				type_var="variable";
			}
			CharVar<Object, String, String> newVar;
			if (suffix=="")
				varClass="single";
			Object vari=define(varClass, null);
			if (suffix.equalsIgnoreCase("!") || suffix.equalsIgnoreCase("")){
				newVar=new CharVar(vari, varClass, type_var);
				variable=name;
				tableVar.put(variable.toString().toLowerCase(), newVar);
			}else{
				newVar=new CharVar(vari, varClass, type_var);
				variable=name+suffix;
				tableVar.put(variable.toString().toLowerCase(), newVar);
			}
		}
		if(variable.equalsIgnoreCase("")){
			System.err.print("FOR NOOOOO");
			System.exit(-1);
		}
		CharVar<Object, String, String> newVar;
		String y=tableVar.get(variable).y;
		
		if(y.equalsIgnoreCase("integer")){
			Integer vari= (Integer) casting(y, QB64Type(typeRes), res, line0, col0);
			newVar=new CharVar(vari, y, type_var);
			tableVar.put(variable.toString().toLowerCase(), newVar);
		}else if(y.equalsIgnoreCase("double")){
			Double vari= (Double) casting(y, QB64Type(typeRes), res, line0, col0);
			newVar=new CharVar(vari, y, type_var);
			tableVar.put(variable.toString().toLowerCase(), newVar);
		}else if(y.equalsIgnoreCase("single")){
			Float vari= (Float) casting(y, QB64Type(typeRes), res, line0, col0);
			newVar=new CharVar(vari, y, type_var);
			tableVar.put(variable.toString().toLowerCase(), newVar);
		}else if(y.equalsIgnoreCase("long")){
			Long vari= (Long) casting(y, QB64Type(typeRes), res, line0, col0);
			newVar=new CharVar(vari, y, type_var);
			tableVar.put(variable.toString().toLowerCase(), newVar);
		}
		
		return (T)variable;
	}
	
	@Override
	public T visitTothis(MyLanguageParser.TothisContext ctx){
		Object expr=visitExpr(ctx.expr());
		int line=ctx.expr().getStart().getLine();
		int col=ctx.expr().getStart().getLine();
		if (expr instanceof String){
			String should[]={"double", "integer", "long", "single"};
			error_types("string", should, line, col);
		}
		return (T) expr;
	}
	
	
	
	
	
	
	
	
	/*
	 * 
	 * If method
	 * 
	 * 
	 */
	/*
	 * 
	 * If method
	 * 
	 * 
	 */	
	@Override 
	public T visitIfc(MyLanguageParser.IfcContext ctx) {
		Object dow=visitExpr(ctx.expr());
		int line=ctx.expr().getStart().getLine();
		int col=ctx.expr().getStart().getCharPositionInLine()+1;
		String tydow=TypeOf(dow);
		if (!tydow.equalsIgnoreCase("integer")){
			if (tydow.equalsIgnoreCase("long")){
				dow=(long)dow;
			}else if(tydow.equals("double")){
				dow=(long)(double)dow;
			}else if(tydow.equals("single")||tydow.equals("float")){
				dow=(int)(float)dow;
			}else{
				String [] should={"double","integer","long","single"};
				error_types(QB64Type(tydow), should, line, col);
			}
		}
		List<MyLanguageParser.InstrContext> instruction = ctx.instr();
	    
	    
		if(((int)dow)!=0){
			for (MyLanguageParser.InstrContext ins : instruction){
		        visitInstr(ins);
		    }
		}else{
			visitIfter(ctx.ifter());
		}
		
		return null;
	}


	@Override 
	public T visitIfter(MyLanguageParser.IfterContext ctx) { 
		String choice=ctx.getStart().getText();
		if(choice.equalsIgnoreCase("else")){
			List<MyLanguageParser.InstrContext> instruction = ctx.instr();
			for (MyLanguageParser.InstrContext ins : instruction){
		        visitInstr(ins);
		    }
		}else if(choice.equalsIgnoreCase("elseif")){
			Object dow=visitExpr(ctx.expr());
			int line=ctx.expr().getStart().getLine();
			int col=ctx.expr().getStart().getCharPositionInLine()+1;
			String tydow=TypeOf(dow);
			if (!tydow.equalsIgnoreCase("integer")){
				if (tydow.equalsIgnoreCase("long")){
					dow=(long)dow;
				}else if(tydow.equals("double")){
					dow=(long)(double)dow;
				}else if(tydow.equals("single")||tydow.equals("float")){
					dow=(int)(float)dow;
				}else{
					String [] should={"double","integer","long","single"};
					error_types(QB64Type(tydow), should, line, col);
				}
			}
			List<MyLanguageParser.InstrContext> instruction = ctx.instr();
		    
		    
			if(((int)dow)!=0){
				for (MyLanguageParser.InstrContext ins : instruction){
			        visitInstr(ins);
			    }
			}else{
				visitIfter(ctx.ifter());
			}
			
		}
		return null;
	}
	
	
	
	 
	/*
	 * 
	 * 
	 * 
	 * Select Case
	 * 
	 * 
	 * 
	 */
	@Override 
	public T visitSelectc(MyLanguageParser.SelectcContext ctx){
		String variable="";
		Object value="";
		if(ctx.idn().par().PIZQ()!=null){
			Object [] variables=(Object[]) visitIdn(ctx.idn(), "");
			variable= variables[0].toString();
			Object [] var= tableArr.get(variable).w;
			value=var[(int)variables[1]];
			
		}else{
			variable=visitIdn(ctx.idn(), "").toString();
			value= tableVar.get(variable).x;
		}
		boolean found=false;
		List<MyLanguageParser.CasesContext> cases = ctx.cases();
		for (MyLanguageParser.CasesContext c : cases){
	        if (visitCases(c, value)){
	        	List<MyLanguageParser.InstrContext> casesi = c.instr();
				for (MyLanguageParser.InstrContext d : casesi){
			        visitInstr(d);
			    }
	        	found=true;
	        	break;
	        }
	    }
		
		if (!found){
			if((ctx.caselse().getStart().getText()).equalsIgnoreCase("case")){
				List<MyLanguageParser.InstrContext> casesi = ctx.caselse().instr();
				for (MyLanguageParser.InstrContext c : casesi){
			        visitInstr(c);
			    }
				
			}
		}
		
		return null;
	}
	
	public boolean visitCases(MyLanguageParser.CasesContext ctx, Object value){
		String tyv=TypeOf(value);
		Object casev=visitValuev(ctx.valuev());
		String tyc=TypeOf(casev);
		int line = ctx.valuev().getStart().getLine();
		int col = ctx.valuev().getStart().getCharPositionInLine()+1;
		String[] should={"double", "integer", "long", "single"};
		if(tyc.equalsIgnoreCase("string")){
			if(tyv.equalsIgnoreCase("string")){
				String comp = casev.toString();
				return (comp.equals(value.toString()));
			}else{
				error_types("string", should, line, col);
			}
		}
		
		if(tyv.equalsIgnoreCase("integer")){
			Integer comp= (Integer) casting(QB64Type(tyv), QB64Type(tyc), casev, line, col);
			Integer val= (Integer) value;
			return (comp.equals(value));
		}else if(tyv.equalsIgnoreCase("string")){
			if(tyc.equalsIgnoreCase("string")){
				String comp= casev.toString();
				String val= value.toString();
				return (comp.equals(value));
			}else{
				String[] shouldg={"string"};
				error_types(QB64Type(tyv), shouldg, line, col);
			}
		}else if(tyv.equalsIgnoreCase("double")){
			Double comp= (Double) casting(QB64Type(tyv), QB64Type(tyc), casev, line, col);
			Double val= (Double) value;
			return (comp.equals(value));
		}else if(tyv.equalsIgnoreCase("single")){
			Float comp= (Float) casting(QB64Type(tyv), QB64Type(tyc), casev, line, col);
			Float val= (Float) value;
			return (comp.equals(value));
		}else if(tyv.equalsIgnoreCase("long")){
			Long comp= (Long) casting(QB64Type(tyv), QB64Type(tyc), casev, line, col);
			Long val= (Long) value;
			return (comp.equals(value));
		}else{
			System.err.println("Error de datos");
			System.exit(-1);
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*--------------------------------------------------------------------
	 *--------------------------------------------------------------------
	 *--------------------------------------------------------------------
	 *--------------------------------------------------------------------
	 *--------------------------------------------------------------------
	 *--------------------------------------------------------------------
	 *--------------------------------------------------------------------
	 *--------------------------------------------------------------------
	 *--------------------------------------------------------------------
	 *-------------------------------------------------------------------- 
	 * Methods for Functions
	 *--------------------------------------------------------------------
	 *--------------------------------------------------------------------
	 *--------------------------------------------------------------------
	 *--------------------------------------------------------------------
	 *--------------------------------------------------------------------
	 *--------------------------------------------------------------------
	 *--------------------------------------------------------------------
	 *--------------------------------------------------------------------
	 *--------------------------------------------------------------------
	 *--------------------------------------------------------------------
	 */
	@Override 
	public T visitCall(MyLanguageParser.CallContext ctx) {
		String name= ctx.ID().getText();
		int linename= ctx.ID().getSymbol().getLine();
		int colname=ctx.ID().getSymbol().getCharPositionInLine()+1;
		if(!tableSub.containsKey(name)){
			err_sub_n(name, linename, colname);
		}
		String[] argumentsN= tableSub.get(name).y;
		String[] arguments= tableSub.get(name).x;
		
		List<MyLanguageParser.ExprContext> args = ctx.expr();
	    
	    if (args.size()!=arguments.length){
	    	err_sub_args(name, linename, colname);
	    }
	    int count=0;
	    HashMap<String, CharVar<Object, String, String>> tmpVar = new HashMap<>(tableVar);
	    
	    //System.out.println(tmpVar.toString());
	    //System.out.println(tableVar.toString());
	    HashMap<String, CharArr<Object [], String, String, Integer[]>> tmpArr = new HashMap<>(tableArr);	
	    
	    HashMap<String, CharVar<Object, String, String>> subVar = new HashMap<>();
	    HashMap<String, CharArr<Object [], String, String, Integer[]>> subArr = new HashMap<>();	

	    for (MyLanguageParser.ExprContext a : args){
	    	int line=a.getStart().getLine();
	    	int col=a.getStart().getCharPositionInLine()+1;
	    	String should = arguments[count];
	    	String [] Should= argsFun(should);
	    	if(a.value()!=null){
		    	if(a.value().idnp()!=null){
			    	if(a.value().idnp().ids()!=null){
			    		String res=a.value().idnp().ids().ID().getText();
			    		if (!Should[0].equals("arreglo")){
			    			error_types("arreglo", Should, line, col);
			    		}
			    		Should = argsFun(should.substring(0, should.length()-2));
			    		String type= tableArr.get(res).x;
		
			    		if (!Arrays.asList(Should).contains(type)){
			    			error_types(type, Should, line, col);
			    		}
			    		CharArr<Object[], String, String, Integer[]> newArr;
			    		newArr=new CharArr(tableArr.get(res).w, should.substring(0, should.length()-2), "variable", tableArr.get(res).z);
			    		subArr.put(argumentsN[count], newArr);
			    	}else{
			    		
			    		Object res = visitExpr(a);
			    		String type= QB64Type(TypeOf(res));
			    		if(!Arrays.asList(Should).contains(type)){
			    			error_types(type, Should, line, col);
			    		}
			    		CharVar<Object, String, String> newVar;
			    		newVar=new CharVar(res, should, "variable");
			    		subVar.put(argumentsN[count], newVar);
			    	}
		    	}else{
		    		Object res = visitExpr(a);
		    		//System.out.println(res);
		    		String type= QB64Type(TypeOf(res));
		    		if(!Arrays.asList(Should).contains(type)){
		    			error_types(type, Should, line, col);
		    		}
		    		CharVar<Object, String, String> newVar;
		    		newVar=new CharVar(res, should, "variable");
		    		subVar.put(argumentsN[count], newVar);
		    	}
	    	}else{
	    		Object res = visitExpr(a);
	    		//System.out.println(res);
	    		String type= QB64Type(TypeOf(res));
	    		if(!Arrays.asList(Should).contains(type)){
	    			error_types(type, Should, line, col);
	    		}
	    		CharVar<Object, String, String> newVar;
	    		newVar=new CharVar(res, should, "variable");
	    		subVar.put(argumentsN[count], newVar);
	    	}
	    	count++;
	    }
	    for (String variable : tableVar.keySet()) {
	    	CharVar<Object, String, String> Var;
    		Var=tableVar.get(variable);
    		//System.out.println(variable);
    		if (Var.z.equalsIgnoreCase("global")){
    			if (!Arrays.asList(argumentsN).contains(variable)){
    				subVar.put(variable, Var);
    			}
    		}
    		
		}
	    
	    for (String variable : tableArr.keySet()) {
	    	CharArr<Object [], String, String, Integer[]> Var;
    		Var=tableArr.get(variable);
    		//System.out.println(variable);
    		if (Var.y.equalsIgnoreCase("global")){
    			if (!Arrays.asList(argumentsN).contains(variable)){
    				subArr.put(variable, Var);
    			}
    		}
		}
	    
	    tableVar.clear();
	    tableVar=new HashMap<>(subVar);
	    tableArr.clear();
	    tableArr=new HashMap<>(subArr);
	    //System.out.println(tmpVar.toString());
	    //System.out.println(tableVar.toString());
		
	    getSub(root, name);
	    
	    
	    for (String variable : tableVar.keySet()) {
	    	CharVar<Object, String, String> Var;
    		Var=tableVar.get(variable);
    		//System.out.println(variable);
    		if (Var.z.equalsIgnoreCase("global")){
    			if (!Arrays.asList(argumentsN).contains(variable)){
    				tmpVar.put(variable, Var);
    			}
    		}
    		
		}
	    
	    for (String variable : tableArr.keySet()) {
	    	CharArr<Object [], String, String, Integer[]> Var;
    		Var=tableArr.get(variable);
    		//System.out.println(variable);
    		if (Var.y.equalsIgnoreCase("global")){
    			tmpArr.put(variable, Var);
    		}
		}
		
	    tableVar.clear();
	    tableVar=new HashMap<>(tmpVar);
	    tableArr.clear();
	    tableArr=new HashMap<>(tmpArr);
		
	    return null;
	}
	

	
	public String [] argsFun (String should){
    	if (should.charAt(should.length()-1)==']'){
    		String [] Should ={"arreglo"};
    		return Should;
    	}else if (should.equalsIgnoreCase("integer")||should.equalsIgnoreCase("single")||
    			should.equalsIgnoreCase("long")||should.equalsIgnoreCase("double")){
    		String [] Should ={"integer", "double", "long", "single"};
    		return Should;
    	}else{
    		String [] Should={"string"};
    		return Should;
    	}
	}
	
	
	
	public T getSub(MyLanguageParser.Qb64Context ctx, String ID){
		List<MyLanguageParser.FunctionsubContext> functionSub = ctx.functionsub();
		for (String variable : tableVar.keySet()) {
			String Type=tableVar.get(variable).y;
			Object f= tableVar.get(variable).x;
			String realType=TypeOf(f);
			if(tableVar.get(variable).z.toString().equals("variable")){
	    		if (Type.equals("integer")){
	    			
	    			Integer F=(Integer) casting("integer", QB64Type(realType), f, -1, -1);
	    			CharVar<Object, String, String> newVar;
	        		newVar=new CharVar(F, Type, "variable");
	        		tableVar.put(variable, newVar);
	    		}else if(Type.equals("double")) {
	    			Double F=(Double) casting("double", QB64Type(realType), f, -1, -1);
	    			CharVar<Object, String, String> newVar;
	        		newVar=new CharVar(F, Type, "variable");
	        		tableVar.put(variable, newVar);
	    		}else if (Type.equals("single")){
	    			Float F=(Float) casting("float", QB64Type(realType), f, -1, -1);
	    			CharVar<Object, String, String> newVar;
	        		newVar=new CharVar(F, Type, "variable");
	        		tableVar.put(variable, newVar);
	    		}else if (Type.equals("long")){
	    			Long F=(Long) casting("long", QB64Type(realType), f, -1, -1);
	    			CharVar<Object, String, String> newVar;
	        		newVar=new CharVar(F, Type, "variable");
	        		tableVar.put(variable, newVar);
	    		}else{
	    			String F= f.toString();
	    			CharVar<Object, String, String> newVar;
	        		newVar=new CharVar(F, Type, "variable");
	        		tableVar.put(variable, newVar);
	    		}
			}
		}
		
		
	    for (MyLanguageParser.FunctionsubContext f : functionSub){
	        if(f.sub()!=null){
	        	String sub=f.sub().subidn().ID().getText();
	        	if (sub.equalsIgnoreCase(ID)){
	        		List<MyLanguageParser.InstrContext> ins = f.sub().instr();
	        		for (MyLanguageParser.InstrContext i : ins)
	        			visitInstr(i);
	        		break;
		        }
	        }
	    }
	    return null;
	}
	
	
	public T visitFuc(MyLanguageParser.IdnContext ctx, String name) {
		int linename= ctx.ID().getSymbol().getLine();
		int colname=ctx.ID().getSymbol().getCharPositionInLine()+1;
		String[] argumentsN= tableFun.get(name).y;
		String[] arguments= tableFun.get(name).z;
		
		List<MyLanguageParser.PosContext> args = ctx.par().pos();
	    if (args.size()!=arguments.length){
	    	err_fun_args(name, linename, colname);
	    }
	    

	    int count=0;
	    HashMap<String, CharVar<Object, String, String>> tmpVar = new HashMap<>(tableVar);
	    
	    //System.out.println(tmpVar.toString());
	    //System.out.println(tableVar.toString());
	    HashMap<String, CharArr<Object [], String, String, Integer[]>> tmpArr = new HashMap<>(tableArr);	
	    
	    HashMap<String, CharVar<Object, String, String>> subVar = new HashMap<>();
	    HashMap<String, CharArr<Object [], String, String, Integer[]>> subArr = new HashMap<>();	

	    for (MyLanguageParser.PosContext a : args){
	    	int line=a.getStart().getLine();
	    	int col=a.getStart().getCharPositionInLine()+1;
	    	String should = arguments[count];
	    	String [] Should= argsFun(should);
	    	if(a.expr().value()!=null){
		    	if(a.expr().value().idnp()!=null){
		    		if(a.expr().value().idnp().ids()!=null){
			    		String res=a.expr().value().idnp().ids().ID().getText();
			    		if (!Should[0].equals("arreglo")){
			    			error_types("arreglo", Should, line, col);
			    		}
			    		Should = argsFun(should.substring(0, should.length()-2));
			    		String type= tableArr.get(res).x;
		
			    		if (!Arrays.asList(Should).contains(type)){
			    			error_types(type, Should, line, col);
			    		}
			    		CharArr<Object[], String, String, Integer[]> newArr;
			    		newArr=new CharArr(tableArr.get(res).w, should.substring(0, should.length()-2), "variable", tableArr.get(res).z);
			    		subArr.put(argumentsN[count], newArr);
			    	}else{
			    		
			    		Object res = visitPosFuc(a);
			    		//System.out.println(res);
			    		String type= QB64Type(TypeOf(res));
			    		if(!Arrays.asList(Should).contains(type)){
			    			error_types(type, Should, line, col);
			    		}
			    		CharVar<Object, String, String> newVar;
			    		
			    		newVar=new CharVar(res, should, "variable");
			    		subVar.put(argumentsN[count], newVar);
			    		
			    	}
		    	
		    	}else{
		    		Object res = visitExpr(a.expr());
		    		//System.out.println(res);
		    		String type= QB64Type(TypeOf(res));
		    		if(!Arrays.asList(Should).contains(type)){
		    			error_types(type, Should, line, col);
		    		}
		    		CharVar<Object, String, String> newVar;
		    		newVar=new CharVar(res, should, "variable");
		    		subVar.put(argumentsN[count], newVar);
		    	}
	    	}else{
	    		Object res = visitExpr(a.expr());
	    		//System.out.println(res);
	    		String type= QB64Type(TypeOf(res));
	    		if(!Arrays.asList(Should).contains(type)){
	    			error_types(type, Should, line, col);
	    		}
	    		CharVar<Object, String, String> newVar;
	    		newVar=new CharVar(res, should, "variable");
	    		subVar.put(argumentsN[count], newVar);
	    	}
	    	count++;
	    }
	    for (String variable : tableVar.keySet()) {
	    	CharVar<Object, String, String> Var;
    		Var=tableVar.get(variable);
    		//System.out.println(variable);
    		if (Var.z.equalsIgnoreCase("global")){
    			if (!Arrays.asList(argumentsN).contains(variable)){
    				subVar.put(variable, Var);
    			}
    		}
    		
		}
	    
	    for (String variable : tableArr.keySet()) {
	    	CharArr<Object [], String, String, Integer[]> Var;
    		Var=tableArr.get(variable);
    		//System.out.println(variable);
    		if (Var.y.equalsIgnoreCase("global")){
    			if (!Arrays.asList(argumentsN).contains(variable)){
    				subArr.put(variable, Var);
    			}
    		}
		}
	    
	    tableVar.clear();
	    tableVar=new HashMap<>(subVar);
	    tableArr.clear();
	    tableArr=new HashMap<>(subArr);
	    //System.out.println(tmpVar.toString());
	    //System.out.println(tableVar.toString());
	    getFun(root, name);
	    
	    for (String variable : tableVar.keySet()) {
	    	CharVar<Object, String, String> Var;
    		Var=tableVar.get(variable);
    		//System.out.println(variable);
    		if (Var.z.equalsIgnoreCase("global")){
    			if (!Arrays.asList(argumentsN).contains(variable)){
    				tmpVar.put(variable, Var);
    			}
    		}
    		
		}
	    
	    for (String variable : tableArr.keySet()) {
	    	CharArr<Object [], String, String, Integer[]> Var;
    		Var=tableArr.get(variable);
    		//System.out.println(variable);
    		if (Var.y.equalsIgnoreCase("global")){
    			tmpArr.put(variable, Var);
    		}
		}
		
	    tableVar.clear();
	    tableVar=new HashMap<>(tmpVar);
	    tableArr.clear();
	    tableArr=new HashMap<>(tmpArr);
	    
	    return (T) name;
	}
	
	
	public boolean inFunction=false;
	Stack<String> CurrentFunction = new Stack();

	public T getFun(MyLanguageParser.Qb64Context ctx, String ID){
		for (String variable : tableVar.keySet()) {
			String Type=tableVar.get(variable).y;
			Object f= tableVar.get(variable).x;
			String realType=TypeOf(f);
			//System.out.println(Type);
			if(tableVar.get(variable).z.toString().equals("variable")){
	    		if (Type.equals("integer")){
	    			Integer F=(Integer) casting("integer", QB64Type(realType), f, -1, -1);
	    			CharVar<Object, String, String> newVar;
	        		newVar=new CharVar(F, Type, "variable");
	        		tableVar.put(variable, newVar);
	    		}else if(Type.equals("double")) {
	    			Double F=(Double) casting("double", QB64Type(realType), f, -1, -1);
	    			CharVar<Object, String, String> newVar;
	        		newVar=new CharVar(F, Type, "variable");
	        		tableVar.put(variable, newVar);
	    		}else if (Type.equals("single")){
	    			Float F=(Float) casting("float", QB64Type(realType), f, -1, -1);
	    			CharVar<Object, String, String> newVar;
	        		newVar=new CharVar(F, Type, "variable");
	        		tableVar.put(variable, newVar);
	    		}else if (Type.equals("long")){
	    			Long F=(Long) casting("long", QB64Type(realType), f, -1, -1);
	    			CharVar<Object, String, String> newVar;
	        		newVar=new CharVar(F, Type, "variable");
	        		tableVar.put(variable, newVar);
	    		}else{
	    			String F= f.toString();
	    			CharVar<Object, String, String> newVar;
	        		newVar=new CharVar(F, Type, "variable");
	        		tableVar.put(variable, newVar);
	    		}
			}
		}
		
		List<MyLanguageParser.FunctionsubContext> functionSub = ctx.functionsub();
		inFunction=true;
		CurrentFunction.push(ID);
	    for (MyLanguageParser.FunctionsubContext f : functionSub){
	        if(f.fun()!=null){
	        	String sub=f.fun().funidn().ID().getText();
	        	if (sub.equalsIgnoreCase(ID)){
	        		List<MyLanguageParser.InstrContext> ins = f.fun().instr();
	        		for (MyLanguageParser.InstrContext i : ins){
	        			visitInstr(i);
	        		}
	        		break;
	        		

		        }
	        }
	    }
	    CurrentFunction.pop();
	    inFunction=false;
	    return null;
	}
	
	public T visitPosFuc(MyLanguageParser.PosContext ctx){
		Object v = visitExpr(ctx.expr());
		String toa=TypeOf(v);
		int line= ctx.expr().getStart().getLine();
		int col= ctx.expr().getStart().getCharPositionInLine()+1;
		return (T) v;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*--------------------------------------------------------------------
	 *--------------------------------------------------------------------
	 *--------------------------------------------------------------------
	 *--------------------------------------------------------------------
	 *--------------------------------------------------------------------
	 *--------------------------------------------------------------------
	 *--------------------------------------------------------------------
	 *--------------------------------------------------------------------
	 *--------------------------------------------------------------------
	 *-------------------------------------------------------------------- 
	 * Methods for expressions
	 *--------------------------------------------------------------------
	 *--------------------------------------------------------------------
	 *--------------------------------------------------------------------
	 *--------------------------------------------------------------------
	 *--------------------------------------------------------------------
	 *--------------------------------------------------------------------
	 *--------------------------------------------------------------------
	 *--------------------------------------------------------------------
	 *--------------------------------------------------------------------
	 *--------------------------------------------------------------------
	 */
	public char[] suffixArr={'!', '$', '#', '$', '%'};
	@Override
	public T visitIdnp(MyLanguageParser.IdnpContext ctx) {
		if(ctx.idn()!=null){
			if(ctx.idn().par().PIZQ()!=null){
				Object[] Variables= (Object[]) visitIdn(ctx.idn(), "");
				if (((int)Variables[1])<0){
					Object Variable=Variables[0];
					return (T) tableVar.get(Variable).x;
				}
				CharArr<Object[], String, String, Integer[]> changedVar;
				String Variable=Variables[0].toString();
				Integer Posicion=(Integer)Variables[1];
				
				Object[] w = tableArr.get(Variable).w;
				return (T) w[Posicion];
			}else{
				Object Variable=visitIdn(ctx.idn(), "");
				return (T) tableVar.get(Variable).x;
			}
		}else{
			String name=ctx.ids().ID().getText();
			return (T)tableArr.get(name).w;
		}
	}
	
	@Override
	public T visitValue(MyLanguageParser.ValueContext ctx){
		if (ctx.valuev()!=null){
			Object v=visitValuev(ctx.valuev());
			String operand= TypeOf(v);
			if(operand.equalsIgnoreCase("integer")){
				Integer and = (int) v;
				return (T) and;
			}else if(operand.equalsIgnoreCase("long")){
				Long and = (long) v;
				return (T) and;
			}else if(operand.equalsIgnoreCase("float")){
				Float and = (float) v;
				return (T) and;
			}else if(operand.equalsIgnoreCase("double")){
				Double and = (double) v;
				return (T) and;
			}else if(operand.equalsIgnoreCase("string")){
				String and = v.toString();
				return (T) and;
			}
		}else{
			return visitIdnp(ctx.idnp());
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
		//System.out.println("Asu oe "+visitValue(ctx.value()).toString());
		if(ctx.value()!=null){
			Object v=visitValue(ctx.value());
			String operand= TypeOf(v);
			if(operand.equalsIgnoreCase("integer")){
				Integer and = (int) v;
				return (T) and;
			}else if(operand.equalsIgnoreCase("long")){
				Long and = (long) v;
				return (T) and;
			}else if(operand.equalsIgnoreCase("float")){
				Float and = (float) v;
				return (T) and;
			}else if(operand.equalsIgnoreCase("double")){
				Double and = (double) v;
				return (T) and;
			}else if(operand.equalsIgnoreCase("string")){
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
			if (ty.equalsIgnoreCase("string")){
				String [] should={"double", "integer", "long", "single"};
				String Error=error_types("string", should, line0, col0);
			}else{	
				if (ne.toString().equalsIgnoreCase("not")){
					if(ty.equalsIgnoreCase("integer") || ty.equalsIgnoreCase("float")){
						if (ty.equalsIgnoreCase("float")){
							int notArch=(int)(float)arch;
							Integer notU = ~notArch;
							return (T) notU;
						}else{
							int notArch= (int) arch;
							Integer notU = ~notArch;
							return (T) notU;
						}

						
					}else if (ty.equalsIgnoreCase("double") || ty.equalsIgnoreCase("long")){
						if (ty.equalsIgnoreCase("double")){
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
					if(ty.equalsIgnoreCase("double")){
						double notArch= (double) arch;
						Double notU = -notArch;
						return (T) notU;
					}else if (ty.equalsIgnoreCase("long")){
						long notArch= (long) arch;
						Long notU = -notArch;
						return (T) notU;
					}else if (ty.equalsIgnoreCase("integer")){
						int notArch= (int) arch;
						Integer notU = -notArch;
						return (T) notU;
					}else if (ty.equalsIgnoreCase("float")){
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
			if (ti.equalsIgnoreCase("string")||tj.equalsIgnoreCase("string")){
				String [] should={"double", "integer", "long", "single"};
				if (ti.equalsIgnoreCase("string"))
					error_types("string", should, line0, col0);
				else if(tj.equalsIgnoreCase("string"))
					error_types("string", should, line1, col1);

			}else{
				ope = operand(i, j);
				operand= TypeOfOperands(ope);
				if(operand.equalsIgnoreCase("integer")){
					Integer potencia= (int)Math.pow(((int)ope[0]),((int)ope[1]));
					return (T) potencia;
				}else if(operand.equalsIgnoreCase("long")){
					Long potencia= (long) Math.pow(((long)ope[0]),((long)ope[1]));
					return (T) potencia;
				}else if(operand.equalsIgnoreCase("float")){
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
			op=op.toLowerCase();
			if (ti.equalsIgnoreCase("string")||tj.equalsIgnoreCase("string")){
				if (op.equalsIgnoreCase("mod")){
					String [] should={"integer", "long"};
					if (ti.equalsIgnoreCase("string"))
						error_types("string", should, line0, col0);
					else if(tj.equalsIgnoreCase("string"))
						error_types("string", should, line1, col1);
				}else{
					String [] should={"double", "integer", "long", "single"};
					if (ti.equalsIgnoreCase("string"))
						error_types("string", should, line0, col0);
					else if(tj.equalsIgnoreCase("string"))
						error_types("string", should, line1, col1);
				}
			}else{
				ope = operand(i, j);
				operand= TypeOfOperands(ope);
				switch(op){
					case "*":
						if(operand.equalsIgnoreCase("integer")){
							Integer mult= (int)(((int)ope[0])*((int)ope[1]));
							return (T) mult;
						}else if(operand.equalsIgnoreCase("long")){
							Long mult= (long)(((long)ope[0])*((long)ope[1]));
							return (T) mult;
						}else if(operand.equalsIgnoreCase("float")){
							Float mult=(float)(((float)ope[0])*((float)ope[1]));
							return (T) mult;
						}else if(operand.equalsIgnoreCase("double")){
							Double mult=(double)(((double)ope[0])*((double)ope[1]));
							return (T) mult;
						}
						System.out.println("What");
						System.exit(-1);
					case "/":
						if(operand.equalsIgnoreCase("integer")){
							Integer div= (int)(((int)ope[0])/((int)ope[1]));
							return (T) div;
						}else if(operand.equalsIgnoreCase("long")){
							Long div= (long)(((long)ope[0])/((long)ope[1]));
							return (T) div;
						}else if(operand.equalsIgnoreCase("float")){
							Float div=(float)(((float)ope[0])/((float)ope[1]));
							return (T) div;
						}else if(operand.equalsIgnoreCase("double")){
							Double div=(double)(((double)ope[0])/((double)ope[1]));
							return (T) div;
						}
						System.out.println("What");
						System.exit(-1);
						
					case "mod":
						String [] should={"integer", "long"};
						if (ti.equalsIgnoreCase("float")){
							error_types("single", should, line0, col0);
						}else if (ti.equalsIgnoreCase("double")){
							error_types("double", should, line0, col0);
						}else if (tj.equalsIgnoreCase("float")){
							error_types("single", should, line1, col1);
						}else if (tj.equalsIgnoreCase("double")){
							error_types("double", should, line1, col1);
						}
						if(operand.equalsIgnoreCase("integer")){
							Integer div= (int)(((int)ope[0])%((int)ope[1]));
							return (T) div;
						}else if(operand.equalsIgnoreCase("long")){
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
					if (ti.equalsIgnoreCase("string") && tj.equalsIgnoreCase("string")){
						String ij=i.toString()+j.toString();
						return (T)ij;
					}else if (ti.equalsIgnoreCase("string")){
						String[] u={"string"};
						error_types(QB64Type(tj), u, line1, col1);
					}else if (tj.equalsIgnoreCase("string")){
						String [] should={"double", "integer", "long", "single"};
						error_types(QB64Type(tj), should, line0, col0);
					}
					ope = operand(i, j);
					operand= TypeOfOperands(ope);
					
					if(operand.equalsIgnoreCase("integer")){
						Integer sum= (int)(((int)ope[0])+((int)ope[1]));
						return (T) sum;
					}else if(operand.equalsIgnoreCase("long")){
						Long sum= (long)(((long)ope[0])+((long)ope[1]));
						return (T) sum;
					}else if(operand.equalsIgnoreCase("float")){
						Float sum=(float)(((float)ope[0])+((float)ope[1]));
						return (T) sum;
					}else if(operand.equalsIgnoreCase("double")){
						Double sum=(double)(((double)ope[0])+((double)ope[1]));
						return (T) sum;
					}
				
					System.out.println("What");
					System.exit(-1);
					break;
				case "-":
					if (ti.equalsIgnoreCase("string")||tj.equalsIgnoreCase("string")){
						String [] should={"double", "integer", "long", "single"};
						if (ti.equalsIgnoreCase("string"))
							error_types("string", should, line0, col0);
						else if(tj.equalsIgnoreCase("string"))
							error_types("string", should, line1, col1);
					}
					ope = operand(i, j);
					operand= TypeOfOperands(ope);
					
					if(operand.equalsIgnoreCase("integer")){
						Integer sub= (int)(((int)ope[0])-((int)ope[1]));
						return (T) sub;
					}else if(operand.equalsIgnoreCase("long")){
						Long sub= (long)(((long)ope[0])-((long)ope[1]));
						return (T) sub;
					}else if(operand.equalsIgnoreCase("float")){
						Float sub=(float)(((float)ope[0])-((float)ope[1]));
						return (T) sub;
					}else if(operand.equalsIgnoreCase("double")){
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
				if (ti.equalsIgnoreCase("string") && tj.equalsIgnoreCase("string")){
					
					int res=i.toString().compareTo(j.toString());
					if (res==1)
						ans=-1;
					else
						ans=0;
					return (T) ans;
				}else if (ti.equalsIgnoreCase("string")){
					String[] u={"string"};
					error_types(QB64Type(tj), u, line1, col1);
				}else if (tj.equalsIgnoreCase("string")){
					String [] should={"double", "integer", "long", "single"};
					error_types(QB64Type(tj), should, line0, col0);
				}
				
				ope = operand(i, j);
				operand= TypeOfOperands(ope);
				
				if(operand.equalsIgnoreCase("integer")){
					boolean sub= (((int)ope[0])>((int)ope[1]));
					Integer res= boolQB64(sub);
					return (T) res;
				}else if(operand.equalsIgnoreCase("long")){
					boolean sub= (((long)ope[0])>((long)ope[1]));
					Integer res= boolQB64(sub);
					return (T) res;
				}else if(operand.equalsIgnoreCase("float")){
					boolean sub=(((float)ope[0])>((float)ope[1]));
					Integer res= boolQB64(sub);
					return (T) res;
				}else if(operand.equalsIgnoreCase("double")){
					boolean sub=(((double)ope[0])>((double)ope[1]));
					Integer res= boolQB64(sub);
					return (T) res;
				}
				
				System.out.println("What");
				System.exit(-1);
				break;
			
			
			
			case ">=":
				//Para Strings
				if (ti.equalsIgnoreCase("string") && tj.equalsIgnoreCase("string")){
					
					int res=i.toString().compareTo(j.toString());
					if (res>=0)
						ans=-1;
					else
						ans=0;
					return (T) ans;
				}else if (ti.equalsIgnoreCase("string")){
					String[] u={"string"};
					error_types(QB64Type(tj), u, line1, col1);
				}else if (tj.equalsIgnoreCase("string")){
					String [] should={"double", "integer", "long", "single"};
					error_types(QB64Type(tj), should, line0, col0);
				}
				
				

				ope = operand(i, j);
				operand= TypeOfOperands(ope);
				
				if(operand.equalsIgnoreCase("integer")){
					boolean sub= (((int)ope[0])>=((int)ope[1]));
					Integer res= boolQB64(sub);
					return (T) res;
				}else if(operand.equalsIgnoreCase("long")){
					boolean sub= (((long)ope[0])>=((long)ope[1]));
					Integer res= boolQB64(sub);
					return (T) res;
				}else if(operand.equalsIgnoreCase("float")){
					boolean sub=(((float)ope[0])>=((float)ope[1]));
					Integer res= boolQB64(sub);
					return (T) res;
				}else if(operand.equalsIgnoreCase("double")){
					boolean sub=(((double)ope[0])>=((double)ope[1]));
					Integer res= boolQB64(sub);
					return (T) res;
				}
				
				System.out.println("What");
				System.exit(-1);
				break;
				
				
			case "<":
				//Para Strings
				if (ti.equalsIgnoreCase("string") && tj.equalsIgnoreCase("string")){
					
					int res=i.toString().compareTo(j.toString());
					if (res==-1)
						ans=-1;
					else
						ans=0;
					return (T) ans;
				}else if (ti.equalsIgnoreCase("string")){
					String[] u={"string"};
					error_types(QB64Type(tj), u, line1, col1);
				}else if (tj.equalsIgnoreCase("string")){
					String [] should={"double", "integer", "long", "single"};
					error_types(QB64Type(tj), should, line0, col0);
				}
				
				
				ope = operand(i, j);
				operand= TypeOfOperands(ope);
				
				if(operand.equalsIgnoreCase("integer")){
					boolean sub= (((int)ope[0])<((int)ope[1]));
					Integer res= boolQB64(sub);
					return (T) res;
				}else if(operand.equalsIgnoreCase("long")){
					boolean sub= (((long)ope[0])<((long)ope[1]));
					Integer res= boolQB64(sub);
					return (T) res;
				}else if(operand.equalsIgnoreCase("float")){
					boolean sub=(((float)ope[0])<((float)ope[1]));
					Integer res= boolQB64(sub);
					return (T) res;
				}else if(operand.equalsIgnoreCase("double")){
					boolean sub=(((double)ope[0])<((double)ope[1]));
					Integer res= boolQB64(sub);
					return (T) res;
				}
				
				System.out.println("What");
				System.exit(-1);
				break;
			case "<=":
				//Para Strings
				if (ti.equalsIgnoreCase("string") && tj.equalsIgnoreCase("string")){
					
					int res=i.toString().compareTo(j.toString());
					if (res<=0)
						ans=-1;
					else
						ans=0;
					return (T) ans;
				}else if (ti.equalsIgnoreCase("string")){
					String[] u={"string"};
					error_types(QB64Type(tj), u, line1, col1);
				}else if (tj.equalsIgnoreCase("string")){
					String [] should={"double", "integer", "long", "single"};
					error_types(QB64Type(tj), should, line0, col0);
				}
				
				
				ope = operand(i, j);
				operand= TypeOfOperands(ope);
				
				if(operand.equalsIgnoreCase("integer")){
					boolean sub= (((int)ope[0])<=((int)ope[1]));
					Integer res= boolQB64(sub);
					return (T) res;
				}else if(operand.equalsIgnoreCase("long")){
					boolean sub= (((long)ope[0])<=((long)ope[1]));
					Integer res= boolQB64(sub);
					return (T) res;
				}else if(operand.equalsIgnoreCase("float")){
					boolean sub=(((float)ope[0])<=((float)ope[1]));
					Integer res= boolQB64(sub);
					return (T) res;
				}else if(operand.equalsIgnoreCase("double")){
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
					if (ti.equalsIgnoreCase("string") && tj.equalsIgnoreCase("string")){

						boolean res=(i.toString()).equals(j.toString());
						ans= boolQB64(res);
						return (T) ans;
					}else if (ti.equalsIgnoreCase("string")){
						String[] u={"string"};
						error_types(QB64Type(tj), u, line1, col1);
					}else if (tj.equalsIgnoreCase("string")){
						String [] should={"double", "integer", "long", "single"};
						error_types(QB64Type(tj), should, line0, col0);
					}

					ope = operand(i, j);
					operand= TypeOfOperands(ope);
					
					if(operand.equalsIgnoreCase("integer")){
						boolean sub= (((int)ope[0])==((int)ope[1]));
						Integer res= boolQB64(sub);
						return (T) res;
					}else if(operand.equalsIgnoreCase("long")){
						boolean sub= (((long)ope[0])==((long)ope[1]));
						Integer res= boolQB64(sub);
						return (T) res;
					}else if(operand.equalsIgnoreCase("float")){
						boolean sub=(((float)ope[0])==((float)ope[1]));
						Integer res= boolQB64(sub);
						return (T) res;
					}else if(operand.equalsIgnoreCase("double")){
						boolean sub=(((double)ope[0])==((double)ope[1]));
						Integer res= boolQB64(sub);
						return (T) res;
					}
					
					System.out.println("What");
					System.exit(-1);
					break;
				case "<>":
					if (ti.equalsIgnoreCase("string") && tj.equalsIgnoreCase("string")){
						boolean res=(i.toString()).equals(j.toString());
						ans= boolQB64(!res);
						return (T) ans;
					}else if (ti.equalsIgnoreCase("string")){
						String[] u={"string"};
						error_types(QB64Type(tj), u, line1, col1);
					}else if (tj.equalsIgnoreCase("string")){
						String [] should={"double", "integer", "long", "single"};
						error_types(QB64Type(tj), should, line0, col0);
					}
					

					ope = operand(i, j);
					operand= TypeOfOperands(ope);
					
					if(operand.equalsIgnoreCase("integer")){
						boolean sub= (((int)ope[0])!=((int)ope[1]));
						Integer res= boolQB64(sub);
						return (T) res;
					}else if(operand.equalsIgnoreCase("long")){
						boolean sub= (((long)ope[0])!=((long)ope[1]));
						Integer res= boolQB64(sub);
						return (T) res;
					}else if(operand.equalsIgnoreCase("float")){
						boolean sub=(((float)ope[0])!=((float)ope[1]));
						Integer res= boolQB64(sub);
						return (T) res;
					}else if(operand.equalsIgnoreCase("double")){
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
			if (ti.equalsIgnoreCase("string")){
				error_types("string", should, line0, col0);
			}else if (tj.equalsIgnoreCase("string")){
				error_types("string", should, line1, col1);				
			}
			
			ope = operand(i, j);
			operand= TypeOfOperands(ope);
			
			if(operand.equalsIgnoreCase("integer")){
				int sub= (((int)ope[0])&((int)ope[1]));
				Integer and=sub;
				return (T) and;
			}else if(operand.equalsIgnoreCase("long")){
				long sub= (((long)ope[0])&((long)ope[1]));
				Long and=sub;
				return (T) and;
			}else if(operand.equalsIgnoreCase("float")){
				int sub=((int)((float)ope[0])&((int)(float)ope[1]));
				Integer and=sub;
				return (T) and;
			}else if(operand.equalsIgnoreCase("double")){
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
			if (ti.equalsIgnoreCase("string")){
				error_types("string", should, line0, col0);
			}else if (tj.equalsIgnoreCase("string")){
				error_types("string", should, line1, col1);				
			}
			String op=ctx.OR().getText();
			op=op.toLowerCase();
			ope = operand(i, j);
			operand= TypeOfOperands(ope);
			switch(op){
				case("or"):
					if(operand.equalsIgnoreCase("integer")){
						int sub= (((int)ope[0])|((int)ope[1]));
						Integer and=sub;
						return (T) and;
					}else if(operand.equalsIgnoreCase("long")){
						long sub= (((long)ope[0])|((long)ope[1]));
						Long and=sub;
						return (T) and;
					}else if(operand.equalsIgnoreCase("float")){
						int sub=((int)((float)ope[0])|((int)(float)ope[1]));
						Integer and=sub;
						return (T) and;
					}else if(operand.equalsIgnoreCase("double")){
						long sub=(((long)(double)ope[0])|((long)(double)ope[1]));
						Long and=sub;
						return (T) and;
					}else{
						System.out.println("What");
						System.exit(-1);
					}
				case("xor"):
					if(operand.equalsIgnoreCase("integer")){
						int sub= (((int)ope[0])^((int)ope[1]));
						Integer and=sub;
						return (T) and;
					}else if(operand.equalsIgnoreCase("long")){
						long sub= (((long)ope[0])^((long)ope[1]));
						Long and=sub;
						return (T) and;
					}else if(operand.equalsIgnoreCase("float")){
						int sub=((int)((float)ope[0])^((int)(float)ope[1]));
						Integer and=sub;
						return (T) and;
					}else if(operand.equalsIgnoreCase("double")){
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
		if (T.equalsIgnoreCase("float")){
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
		
		if (t1.equalsIgnoreCase("double")||t2.equalsIgnoreCase("double")){
			if(t1.equalsIgnoreCase("double")){
				Double[] numbers=new Double [2];
				Double cnum1= (double) num1;
				numbers[0]=cnum1;
				if(t2.equalsIgnoreCase("double")){
					double cnum2= (double) num2;
					numbers[1]=cnum2;
					return numbers;
				}else if (t2.equalsIgnoreCase("float")){
					double cnum2= (double)(float) num2;
					numbers[1]=cnum2;
					return numbers;
				}else if (t2.equalsIgnoreCase("long")){
					double cnum2= (double)(long) num2;
					numbers[1]=cnum2;
					return numbers;
				}else{
					double cnum2= (double)(int) num2;
					numbers[1]=cnum2;
					return numbers;
				}
			}else if(t2.equalsIgnoreCase("double")){
				Double[] numbers=new Double [2];
				Double cnum2= (double) num1;
				numbers[1]=cnum2;
				if (t1.equalsIgnoreCase("float")){
					double cnum1= (double)(float) num1;
					numbers[0]=cnum1;
					return numbers;
				}else if (t1.equalsIgnoreCase("long")){
					double cnum1= (double)(long) num1;
					numbers[0]=cnum1;
					return numbers;
				}else{
					double cnum1= (double)(int) num1;
					numbers[0]=cnum1;
					return numbers;
				}	
			}
			
		}else if(t1.equalsIgnoreCase("float")||t2.equalsIgnoreCase("float")){
			if(t1.equalsIgnoreCase("float")){
				Float[] numbers=new Float [2];
				Float cnum1= (float) num1;
				numbers[0]=cnum1;
				if (t2.equalsIgnoreCase("float")){
					float cnum2= (float) num2;
					numbers[1]=cnum2;
					return numbers;
				}else if (t2.equalsIgnoreCase("long")){
					float cnum2= (float)(long) num2;
					numbers[1]=cnum2;
					return numbers;
				}else{
					float cnum2= (float)(int) num2;
					numbers[1]=cnum2;
					return numbers;
				}
			}else if(t2.equalsIgnoreCase("float")){
				Float[] numbers=new Float [2];
				Float cnum2= (float) num2;
				numbers[1]=cnum2;
				if (t1.equalsIgnoreCase("long")){
					float cnum1= (float)(long) num1;
					numbers[0]=cnum1;
					return numbers;
				}else{
					float cnum1= (float)(int) num1;
					numbers[0]=cnum1;
					return numbers;
				}	
			}
		}else if (t1.equalsIgnoreCase("long")||t2.equalsIgnoreCase("long")){
			if(t1.equalsIgnoreCase("long")){
				Long[] numbers = new Long [2];
				Long cnum1=(long) num1;
				numbers[0] = cnum1;
				if (t2.equalsIgnoreCase("long")){
					long cnum2= (long) num2;
					numbers[1] = cnum2;
					return numbers;
				}else{
					long cnum2 = (long)(int) num2;
					numbers[1]=cnum2;
					return numbers;
				}
			}else if (t2.equalsIgnoreCase("long")){
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
		if (typeVar.equalsIgnoreCase("integer")){
			Integer resu=0;
			if (typeRes.equalsIgnoreCase("long")){
				resu=(int)(long) res;
				if (Math.abs(resu)>32767){
					resu=-25536;
				}
				return resu;
			}else if (typeRes.equalsIgnoreCase("double")){
				resu=(int)(double)res;
				if (Math.abs(resu)>32767){
					resu=-25536;
				}
				return resu;
			}else if (typeRes.equalsIgnoreCase("single")||typeRes.equalsIgnoreCase("float")){
				resu=(int)(float) res;
				if (Math.abs(resu)>32767){
					resu=-25536;
				}
				return resu;
			}else if(typeVar.equalsIgnoreCase(typeRes)){
				resu=(int) res;
				return resu;
			}else{
				error_casting();
			}
		}else if(typeVar.equalsIgnoreCase("long")){
			Long resu;
			if (typeRes.equalsIgnoreCase("integer")){
				resu=(long)(int) res;
				return resu;
			}else if (typeRes.equalsIgnoreCase("double")){
				resu=(long)(double)res;
				return resu;
			}else if (typeRes.equalsIgnoreCase("single")||typeRes.equalsIgnoreCase("float")){
				resu=(long)(float) res;
				return resu;
			}else if(typeVar.equalsIgnoreCase(typeRes)){
				resu=(long) res;
				return resu;
			}else{
				error_casting();
			}
		}else if(typeVar.equalsIgnoreCase("single")||typeVar.equalsIgnoreCase("float")){
			Float resu;
			if (typeRes.equalsIgnoreCase("integer")){
				resu=(float)(int) res;
				return resu;
			}else if (typeRes.equalsIgnoreCase("double")){
				double tempRes=(double)res;
				Double d=tempRes;
				String decimal=d.toString();
				String [] doublenum = decimal.split(".",-1);
				String decimalPart=doublenum[1];
				if (decimalPart.length()>5){
					String singlepart = decimal.substring(0,5);
					String number= doublenum[0]+'.'+singlepart;
					Double tmp= Double.parseDouble(number);
					resu=(float)(double) tmp;
				}else{
					resu=(float) tempRes;
				}
				return resu;
			}else if (typeRes.equalsIgnoreCase("long")){
				resu=(float)(long) res;
				return resu;
			}else if(typeVar.equalsIgnoreCase(typeRes)||typeRes.equalsIgnoreCase("float")||typeRes.equalsIgnoreCase("single")){
				resu=(float) res;
				return resu;
			}else{
				error_casting();
			}
		}else if(typeVar.equalsIgnoreCase("double")){
			Double resu;
			if (typeRes.equalsIgnoreCase("integer")){
				resu=(double)(int) res;
				return resu;
			}else if (typeRes.equalsIgnoreCase("long")){
				resu=(double)(long)res;
				return resu;
			}else if (typeRes.equalsIgnoreCase("single")||typeRes.equalsIgnoreCase("float")){
				String m=res.toString();
				resu=Double.parseDouble(m);
				return resu;
			}else if(typeVar.equalsIgnoreCase(typeRes)){
				resu=(double) res;
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
		System.err.println("<"+String.valueOf(line)+","+String.valueOf(col)+"> Error en tiempo de ejecución: Se accedio a una posicion no valida del arreglo: "+pos);
		System.exit(-1);
	}
	
	public void check_Error_var(String name, String type, int line, int col){
		if (tableVar.containsKey(name)){
			if(!tableVar.get(name).y.toString().equalsIgnoreCase(type)){
				error_red_var(name, line, col);
			}
			
		}
	}
	
	public void check_Error_array(String name, int line, int col){
		if (tableArr.containsKey(name)){
			error_red_arr( name,  line,  col);
		}
	}
	
	public void error_red_var(String name, int line, int col){
		System.err.println("<"+String.valueOf(line)+","+String.valueOf(col)+"> Error semantico: '"+name+"' ya ha sido declarado.");
		System.exit(-1);
	}
	
	public void error_red_arr(String name, int line, int col){
		System.err.println("<"+String.valueOf(line)+","+String.valueOf(col)+"> Error semantico: El arreglo '"+name+"' ya ha sido declarado.");
		System.exit(-1);
	}
	public void error_constant(String name, int line, int col){
		String err= "Error semantico: "+name+" no puede ser modificado.";
		System.err.println("<"+String.valueOf(line)+","+String.valueOf(col)+">"+err);
		System.exit(-1);
	}
	public void err_proc(String name, int col, int line){
		String err= "Error semantico: '"+name+"' es un procedimiento, no tiene valor de retorno.";
		System.err.println("<"+String.valueOf(line)+","+String.valueOf(col)+">"+err);
		System.exit(-1);
	}
	
	public void err_sub_n(String name, int line, int col){
		String err= "Error semantico: el procedimiento '"+name+"' no ha sido declarado.";
		System.err.println("<"+String.valueOf(line)+","+String.valueOf(col)+">"+err);
		System.exit(-1);
	}
	
	public void err_sub_args(String name, int line, int col){
		
		String err= "Error semantico: numero incorrecto de parametros al llamar el procedimiento '"+name+"'";
		System.err.println("<"+String.valueOf(line)+","+String.valueOf(col)+">"+err);
		System.exit(-1);
	}
	
	public void err_fun_args(String name, int line, int col){
		
		String err= "Error semantico: numero incorrecto de parametros al llamar la funcion '"+name+"'";
		System.err.println("<"+String.valueOf(line)+","+String.valueOf(col)+">"+err);
		System.exit(-1);
	}
	
}
