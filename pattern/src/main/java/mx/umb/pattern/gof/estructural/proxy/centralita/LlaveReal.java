package mx.umb.pattern.gof.estructural.proxy.centralita;

public class LlaveReal extends Llave {

	 // Constructor base: asigna el código de la llave a la llave
    public LlaveReal(int codigoLlave) {
        this.codigoLlave = codigoLlave;
    }
    
    // Realizar contacto: comprueba que el código de la llave sea correcto.
    // En caso de que lo sea, arranca el vehículo.
	@Override
	public void realizarContacto(CentralitaVehiculo centralita) {
		if (llaveCorrecta(centralita.getCodigoLlave())){
	           System.out.println("Contacto realizado");
		}else{
			System.out.println("Código de llave inválido");
		}

	}

	@Override
	public boolean llaveCorrecta(int codigoLlave) {
		 return codigoLlave == this.codigoLlave;
	}

}
