package mx.umb.pattern.gof.comportamiento.templatemethod.centralita;

public abstract class Motor {
	 // Estado de las válvulas
    private boolean valvulaAdmisionAbierta = false;
    private boolean valvulaEscapeAbierta = false;
 
    // Ángulos del cigueñal y del árbol de levas
    protected int anguloCiguenal = 0;
    protected int anguloArbolLevas = 0;
 
    // Método público que ejecutará el algoritmo completo
    public void realizarFaseMotor(){
    	comprimirTurbo();       // Hook (método opcional) Métodos de enganche o ganchos.
        admision();             // Parcialmente implementado en la clase base
        compresion();           // Implementado en la clase base
        consumirCombustible();  // Delegado en las clases hijas
        escape();               // Implementado en la clase base
    }
    
    protected void comprimirTurbo(){
       System.out.println("Turbo no presente");
    }
    
    // Primera Fase: Admisión
    protected void admision(){
        System.out.println("COMENZANDO FASE DE ADMISION");
 
        // Se abre la válvula de admisión y se cierra la válvula de escape
        valvulaAdmisionAbierta = true;
        valvulaEscapeAbierta = false;
 
        // Se baja el pistón. Esta operación será distinta en el motor diesel (que
        // inyectará aire) o gasolina (que inyectará una mezcla de aire y combustible)
        bajarPiston();
 
        anguloCiguenal = sumarAngulo(anguloCiguenal, 180);
        anguloArbolLevas = sumarAngulo(anguloArbolLevas, 90);
 
        System.out.println("Angulo del ciguenal: " + anguloCiguenal);
        System.out.println("Angulo del arbol de levas: " + anguloArbolLevas);
        System.out.println("Valvula de admision abierta: " + valvulaAdmisionAbierta);
        System.out.println("Valvula de escape abierta: " + valvulaEscapeAbierta + "\n");
    }
    
    // La bajada del pistón depende del motor concreto, por lo que deberá ser implementada
    // por la clase hija.
    protected abstract void bajarPiston();
     
    // Segunda Fase: Compresión
    protected void compresion(){
        System.out.println("COMENZANDO FASE DE COMPRESION");
 
        // Se cierra la válvula de admisión
        valvulaAdmisionAbierta = false;
 
        // Giros del cigueñal y del árbol de levas
        anguloCiguenal = sumarAngulo(anguloCiguenal, 360);
        anguloArbolLevas = sumarAngulo(anguloArbolLevas, 180);
 
        System.out.println("Angulo del ciguenal: " + anguloCiguenal);
        System.out.println("Angulo del arbol de levas: " + anguloArbolLevas);
        System.out.println("Valvula de admision abierta: " + valvulaAdmisionAbierta);
        System.out.println("Valvula de escape abierta: " + valvulaEscapeAbierta + "\n");
    }
 
    // Tercera Fase: Consumo del combustible. Dado que depende del motor concreto,
    // este método será abstracto y deberá ser implementado por la clase derivada.
    protected abstract void consumirCombustible();
 
    // Cuarta Fase: Escape
    protected void escape(){
    	System.out.println("COMENZANDO FASE DE ESCAPE");
 
        // Se abre la válvula de escape
        valvulaEscapeAbierta = true;
 
        // Giros del cigueñal y del árbol de levas
        anguloCiguenal = sumarAngulo(anguloCiguenal, 180);
        anguloArbolLevas = sumarAngulo(anguloArbolLevas, 90);
 
        System.out.println("Angulo del ciguenal: " + anguloCiguenal);
        System.out.println("Angulo del arbol de levas: " + anguloArbolLevas);
        System.out.println("Gases expulsados. Fin de ciclo");
    }
 
    // Método que mantendrá el ángulo entre 0 y 359 grados
    protected int sumarAngulo(int anguloActual, int cantidad){
        if (anguloActual + cantidad >= 360)
            return anguloActual + cantidad - 360;
        else
            return anguloActual + cantidad;
    }
    
}