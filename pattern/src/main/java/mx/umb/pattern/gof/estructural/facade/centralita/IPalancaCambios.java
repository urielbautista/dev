package mx.umb.pattern.gof.estructural.facade.centralita;

public interface IPalancaCambios {
	void insertarVelocidad(int velocidad);
    void puntoMuerto();
    int getVelocidadActual();
}
