package mx.umb.pattern.gof.comportamiento.iterator;

public interface LibroIterator {
    public boolean hasNext();
    public Libro next();
    public Libro current();
    public Libro first();
}
