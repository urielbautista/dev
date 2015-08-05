package mx.umb.pattern.comportamiento.iterator;

public class IteratorMain {

	public static void main(String[] args) {
		 Libreria libreria = new Libreria();
		 LibroIterator libroIterator = libreria.iterator();
		 while (libroIterator.hasNext()) {
			 Libro libro = libroIterator.next();
			 System.out.println("Libro: " + libro.getNombre());
		 }
	}

}