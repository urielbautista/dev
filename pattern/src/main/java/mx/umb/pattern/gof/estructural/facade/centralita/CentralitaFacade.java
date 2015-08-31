package mx.umb.pattern.gof.estructural.facade.centralita;

public class CentralitaFacade {
	private IEmbrague embrague;
    private IAcelerador acelerador;
    private IPalancaCambios palancaCambios;
 
    public CentralitaFacade(IEmbrague embrague, IAcelerador acelerador, 
    		IPalancaCambios palancaCambios){
        this.embrague = embrague;
        this.acelerador = acelerador;
        this.palancaCambios = palancaCambios;
    }
 
    public void aumentarMarcha(){
        acelerador.soltarAcelerador();
        embrague.presionarEmbrague();
        palancaCambios.puntoMuerto();
        if (palancaCambios.getVelocidadActual() < 5){
            palancaCambios.insertarVelocidad(palancaCambios.getVelocidadActual() + 1);
        }
        embrague.soltarEmbrague();
        acelerador.presionarAcelerador();
    }
 
    public void reducirMarcha(){
    	acelerador.soltarAcelerador();
        embrague.presionarEmbrague();
        palancaCambios.puntoMuerto();
        if (palancaCambios.getVelocidadActual() > 1){
            palancaCambios.insertarVelocidad(palancaCambios.getVelocidadActual() - 1);
        }
        embrague.soltarEmbrague();
        acelerador.presionarAcelerador();
    }
    
}
