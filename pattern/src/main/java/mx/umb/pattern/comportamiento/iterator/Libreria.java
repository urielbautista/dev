package mx.umb.pattern.comportamiento.iterator;

public class Libreria implements LibroColeccion {
	private Libro[] libros;
	 
    public Libreria() {
        libros = new Libro[3];
        libros[0] = new Libro("Java 7");
        libros[1] = new Libro("Zend Framework 2");
        libros[2] = new Libro("Node JS");
    }
    
	@Override
	public LibroIterator iterator() {
		return new LibreriaLibroIterator(libros);
	}

}
