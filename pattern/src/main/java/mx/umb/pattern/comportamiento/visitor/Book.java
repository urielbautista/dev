package mx.umb.pattern.comportamiento.visitor;

public class Book implements Visitable {
	private double precio;
	
	@Override
	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
