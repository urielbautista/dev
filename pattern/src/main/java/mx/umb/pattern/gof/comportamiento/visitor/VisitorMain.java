package mx.umb.pattern.gof.comportamiento.visitor;

public class VisitorMain {

	public static void main(String[] args) {
		Fruit fruit = new Fruit();
		fruit.setPrecio(100);
		
		Book book = new Book();
		book.setPrecio(100);
		
		Iva iva= new Iva();
		
		System.out.println("Precio neto Fruit: "+ fruit.accept(iva));
		System.out.println("Precio neto Book: "+ book.accept(iva));
	}

}