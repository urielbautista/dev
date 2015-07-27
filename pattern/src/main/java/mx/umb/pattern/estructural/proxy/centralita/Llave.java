package mx.umb.pattern.estructural.proxy.centralita;

public abstract class  Llave {
	protected int codigoLlave;
	 
    // Propiedad de sólo lectura para obtener el código de la llave
    public int getCodigoLlave(){
        return this.codigoLlave;
    }
 
    // Métodos abstractos que implementarán el elemento real y el proxy
    public abstract void realizarContacto(CentralitaVehiculo centralita);
    public abstract boolean llaveCorrecta(int codigoLlave);
    
}
