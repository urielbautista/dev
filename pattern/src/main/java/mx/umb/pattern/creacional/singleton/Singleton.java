package mx.umb.pattern.creacional.singleton;

import java.util.Date;

public class Singleton {
	// Declaramos un atributo del mismo tipo de la clase con carácter estático
	private static Singleton instance = null;
	private Date creacion;
	
	// Constructor privado. Únicamente puede ser invocado desde el interior
    // de la propia clase
    private Singleton(){
    	creacion= new Date();
    }
    
    public static Singleton getInstance() {
        // Si el singleton no ha sido creado previamente, se instancia.
        // En caso contrario, se devolvera el que haya sido creado previamente
        if(instance == null) {
           instance = new Singleton();
        }
        
        // Se devuelve la instancia
        return instance;
     }
    
	public Date getCreacion() {
		return creacion;
	}

	public void setCreacion(Date creacion) {
		this.creacion = creacion;
	}
    
}