package mx.umb.pattern.estructural.proxy.centralita;

public class CentralitaVehiculo {
	private int codigoLlave;
    private int codigoSeguridad;
    
    public CentralitaVehiculo (int codigoLlave ,  int codigoSeguridad){
    	  this.codigoLlave = codigoLlave;
          this.codigoSeguridad = codigoSeguridad;
    }

	public int getCodigoLlave() {
		return codigoLlave;
	}

	public void setCodigoLlave(int codigoLlave) {
		this.codigoLlave = codigoLlave;
	}

	public int getCodigoSeguridad() {
		return codigoSeguridad;
	}

	public void setCodigoSeguridad(int codigoSeguridad) {
		this.codigoSeguridad = codigoSeguridad;
	}
}
