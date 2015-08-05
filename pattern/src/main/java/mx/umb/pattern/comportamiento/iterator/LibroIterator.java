package mx.umb.pattern.comportamiento.iterator;

public interface LibroIterator {
    public boolean hasNext();
    public Libro next();
    public Libro current();
    public Libro first();
}
