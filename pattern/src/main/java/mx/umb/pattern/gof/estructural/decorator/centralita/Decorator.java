package mx.umb.pattern.gof.estructural.decorator.centralita;

public abstract class Decorator extends Vehiculo {

	  // Declaramos el método como abstracto para que todos los decoradores lo
    // reimplementen.
	@Override
    public abstract String descripcion();

}
