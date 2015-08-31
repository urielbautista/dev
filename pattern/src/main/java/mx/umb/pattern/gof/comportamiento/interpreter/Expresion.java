package mx.umb.pattern.gof.comportamiento.interpreter;

public abstract class Expresion {
	abstract String one();
	abstract String four();
	abstract String five();
	abstract String nine();
	abstract int multipler();
	
	void interpret(Context context){
		if (context.input.startsWith(nine())){
			context.output+=(9*multipler());
			context.input= context.input.substring(2);
		}else if (context.input.startsWith(four())){
			context.output+=(4*multipler());
			context.input= context.input.substring(2);
		}else if (context.input.startsWith(five())){
			context.output+=(5*multipler());
			context.input= context.input.substring(1);
		}
		
		while (context.input.startsWith(one())){
			context.output+=(1*multipler());
			context.input= context.input.substring(1);
		}
	}

}