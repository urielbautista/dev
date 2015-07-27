package mx.umb.pattern.estructural.proxy.centralita;

public class LlaveProxy extends Llave {
	// Referencia a la llave original
    private Llave llaveOriginal;
    
    // Constructor en el que se inyectará el objeto real
    public LlaveProxy(Llave llave){
        llaveOriginal = llave;
    }
    
    // Este método realizará el control de acceso sobre el método original.
    // Realizará una comprobación previa comparando el código de seguridad y, si este es
    // correcto, invocará el método del objeto real.
    
	@Override
	public void realizarContacto(CentralitaVehiculo centralita) {
        // Realizamos una comprobación adicional de seguridad. En caso de no cumplirse, se
        // aborta la operación. Esta operación podría ser la ejecución de un algoritmo para
        // comprobar la autenticidad del código de la llave, una comprobación de nombre de
        // usuario y contraseña... o cualquier otra comprobación que queramos realizar.
        if (centralita.getCodigoSeguridad() > llaveOriginal.getCodigoLlave()){
        	System.out.println("Código de seguridad incorrecto. Abortanto arranque");
            return;
        }
 
        if (llaveCorrecta(centralita.getCodigoLlave())){
        	 System.out.println("Contacto realizado");
        }else{
        	System.out.println("Código de llave inválido");
        }
        	 
	}

	@Override
	public boolean llaveCorrecta(int codigoLlave) {
		 return llaveOriginal.llaveCorrecta(codigoLlave);
	}

}
