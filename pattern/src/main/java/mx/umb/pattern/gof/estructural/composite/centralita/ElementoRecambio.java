package mx.umb.pattern.gof.estructural.composite.centralita;

public class ElementoRecambio extends ComponenteRecambio {
    // Atributos propios del nodo hoja.
    private String nombre;
    private String descripcion;
    private double precio;
 
    // Constructor
    public ElementoRecambio(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }
 
    // Sobrecargamos únicamente los métodos propios de los nodos hoja, destinados
    // a devolver la información y a asignarla
 
    // NOMBRE
    @Override
    public String getNombre(){
        return nombre;
    }
 
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    // DESCRIPCION
    @Override
    public String getDescripcion(){
        return descripcion;
    }
 
    @Override
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
 
    // PRECIO
    @Override
    public double getPrecio(){
        return precio;
    }
    
    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }
 
    // Los métodos add, remove y getElemento no se sobrecargarán, ya que
    // el nodo hoja no estará compuesto por más elementos que él mismo.
    // Por tanto, si se invocan estos métodos, se llamará el método padre
    // que lanzará una excepción de tipo NotSupportedException
    
}