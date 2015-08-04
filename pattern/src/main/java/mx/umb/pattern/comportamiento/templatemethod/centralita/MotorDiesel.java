package mx.umb.pattern.comportamiento.templatemethod.centralita;

public class MotorDiesel extends Motor {
	private boolean turbo = false;
	 
    public MotorDiesel(boolean turbo){
        this.turbo = turbo;
    }

    @Override
    protected void  comprimirTurbo (){
        // Si el coche es turbo, ejecutará su propio código. En caso contrario, efectuará
        // la operación por defecto
        if (turbo)
            System.out.println("Comprimiendo aire en el turbo antes de la admisión");
        else
            super.comprimirTurbo();
    }
    
	@Override
	protected void bajarPiston() {
		System.out.println("Inyectando aire en el motor");
	}

	@Override
	protected void consumirCombustible() {
		System.out.println("COMENZANDO FASE DE COMBUSTIÓN");
		System.out.println("Inyectando combustible pulverizado en el motor");
		System.out.println("La presión provoca el movimiento del pistón");
 
        anguloCiguenal = sumarAngulo(anguloCiguenal, 180);
        anguloArbolLevas = sumarAngulo(anguloArbolLevas, 90);
 
        System.out.println("Angulo del ciguenal: " + anguloCiguenal);
        System.out.println("Angulo del arbol de levas: " + anguloArbolLevas + "\n");       
	}

}
