package mx.umb.pattern.gof.estructural.composite.centralita;

public abstract class ComponenteRecambio {

   // #region Métodos comunes a objetos compuestos y hojas
    public String getNombre() {
        throw new UnsupportedOperationException(this.getClass().getName() + "getNombre()");
    }
 
    public void setNombre(String nombre){
        throw new UnsupportedOperationException(this.getClass().getName() + "setNombre()");
    }
 
    public String getDescripcion(){
        throw new UnsupportedOperationException(this.getClass().getName() + "getDescripcion()");
    }
 
    public void setDescripcion(String descripcion){
        throw new UnsupportedOperationException(this.getClass().getName() + "setDescripcion()");
    }
 
    public double getPrecio() {
        throw new UnsupportedOperationException(this.getClass().getName() + "getPrecio()");
    }
 
    public void setPrecio(double precio){
        throw new UnsupportedOperationException(this.getClass().getName() + "setPrecio()");
    }
 
    //#region Métodos exclusivos de los objetos compuestos
    public void add(ComponenteRecambio componente){
        throw new UnsupportedOperationException(this.getClass().getName() + "add()");
    }
 
    public void remove(ComponenteRecambio componente){
        throw new UnsupportedOperationException(this.getClass().getName() + "remove()");
    }
 
    public ComponenteRecambio getElemento(int indice){
        throw new UnsupportedOperationException(this.getClass().getName() + "getElemento()");
    }
    
}