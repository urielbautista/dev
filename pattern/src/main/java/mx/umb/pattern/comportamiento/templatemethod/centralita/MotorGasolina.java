package mx.umb.pattern.comportamiento.templatemethod.centralita;

public class MotorGasolina extends Motor {

	@Override
	protected void bajarPiston() {
		System.out.println("Inyectando aire y combustible en el motor");
	}

	@Override
	protected void consumirCombustible() {
		System.out.println("COMENZANDO FASE DE EXPLOSIÓN");
		System.out.println("Iniciando chispa en la bujía");
		System.out.println("La explosión provoca el movimiento del pistón");
 
        anguloCiguenal = sumarAngulo(anguloCiguenal, 180);
        anguloArbolLevas = sumarAngulo(anguloArbolLevas, 90);
 
        System.out.println("Angulo del ciguenal: " + anguloCiguenal);
        System.out.println("Angulo del arbol de levas: " + anguloArbolLevas + "\n"); 
	}

}