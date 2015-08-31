package mx.umb.pattern.gof.comportamiento.visitor;

public interface Visitable {
	double accept (Visitor visitor);
}
