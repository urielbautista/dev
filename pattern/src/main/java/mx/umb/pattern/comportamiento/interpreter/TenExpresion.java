package mx.umb.pattern.comportamiento.interpreter;

public class TenExpresion extends Expresion {

	@Override
	String one() {
		return "X";
	}

	@Override
	String four() {
		return "XL";
	}

	@Override
	String five() {
		return "L";
	}

	@Override
	String nine() {
		return "XC";
	}

	@Override
	int multipler() {
		return 10;
	}

}
