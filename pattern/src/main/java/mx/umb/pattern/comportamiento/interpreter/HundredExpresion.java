package mx.umb.pattern.comportamiento.interpreter;

public class HundredExpresion extends Expresion {

	@Override
	String one() {
		return "C";
	}

	@Override
	String four() {
		return "CD";
	}

	@Override
	String five() {
		return "D";
	}

	@Override
	String nine() {
		return "CM";
	}

	@Override
	int multipler() {
		return 100;
	}

}
