package mx.umb.pattern.estructural.decorator.centralita;

public abstract class Vehiculo {
	// Atributo común a todos los objetos que heredarán de esta clase
    protected String descripcion = "Vehículo genérico";
 
    // Método no abstracto que devolverá el contenido de la descripción
    // Se declara como virtual para que pueda sustituirse en las clases derivadas
    public String descripcion()   {
        return descripcion;
    }
 
    // Métodos abstractos
    public abstract int velocidadMaxima();
    public abstract double consumo();
}
