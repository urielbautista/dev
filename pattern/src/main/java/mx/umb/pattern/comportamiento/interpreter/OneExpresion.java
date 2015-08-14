package mx.umb.pattern.comportamiento.interpreter;

public class OneExpresion extends Expresion {

	@Override
	String one() {
		return "I";
	}

	@Override
	String four() {
		return "IV";
	}

	@Override
	String five() {
		return "V";
	}

	@Override
	String nine() {
		return "IX";
	}

	@Override
	int multipler() {
		return 1;
	}

}
