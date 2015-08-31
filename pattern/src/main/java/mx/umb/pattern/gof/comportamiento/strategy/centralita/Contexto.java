package mx.umb.pattern.gof.comportamiento.strategy.centralita;

public class Contexto {
	// Referencia a la interfaz
    private ITipoConduccion tipoConduccion;
    
    
    // Métodos de servicio (invocan los métodos implementados por las estrategias)
    public String obtenerDescripcion() {
        return tipoConduccion.obtenerDescripcion();
    }
 
    public int incrementarVelocidad(float combustible){
        return tipoConduccion.obtenerIncrementoVelocidad(combustible);
    }
 
    public int incrementarPotencia(float combustible){
        return tipoConduccion.obtenerPotencia(combustible);
    }
    
	public ITipoConduccion getTipoConduccion() {
		return tipoConduccion;
	}

	public void setTipoConduccion(ITipoConduccion tipoConduccion) {
		this.tipoConduccion = tipoConduccion;
	}
    
}
