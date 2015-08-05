package mx.umb.pattern.comportamiento.iterator;

public class LibreriaLibroIterator implements LibroIterator {
	private int index = 0;
	private Libro[] libros;
	 
	public LibreriaLibroIterator(Libro[] libros){
		this.libros=libros;
	}
	
	@Override
	public boolean hasNext() {
        if(index < libros.length) {
            return true;
        }
        return false;
	}

	@Override
	public Libro next() {
		return libros[ index++ ];
	}

	@Override
	public Libro current() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Libro first() {
		// TODO Auto-generated method stub
		return null;
	}

}
