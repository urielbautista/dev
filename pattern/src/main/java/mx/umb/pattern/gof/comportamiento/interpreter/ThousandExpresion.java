package mx.umb.pattern.gof.comportamiento.interpreter;

public class ThousandExpresion extends Expresion {

	@Override
	String one() {
		return "M";
	}

	@Override
	String four() {
		return " ";
	}

	@Override
	String five() {
		return " ";
	}

	@Override
	String nine() {
		return " ";
	}

	@Override
	int multipler() {
		return 1000;
	}

}
