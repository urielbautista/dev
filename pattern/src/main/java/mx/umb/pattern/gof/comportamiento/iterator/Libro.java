package mx.umb.pattern.gof.comportamiento.iterator;

public class Libro {
    private String nombre;
    
    public Libro(String nombre) {
        this.nombre = nombre;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
