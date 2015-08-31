package mx.umb.pattern.gof.estructural.facade.centralita;

public class CentralitaMain {

	public static void main(String[] args) {
		
		//El cliente, por lo tanto, tendría que realizar las siguientes acciones si quisiera realizar un cambio de marcha:
		System.out.println("********** Version basica **********");
		IAcelerador acelerador = new Acelerador();
		IEmbrague embrague = new Embrague();
		IPalancaCambios palancaCambios = new PalancaCambios();
		 
		acelerador.soltarAcelerador();
		embrague.presionarEmbrague();
		palancaCambios.puntoMuerto();
		palancaCambios.insertarVelocidad(3);
		embrague.soltarEmbrague();
		acelerador.presionarAcelerador();
		
		System.out.println("********** Version facade **********");
		//Realizamos la invocación a través de nuestro patrón Facade. El cliente debería implementar un código muchísimo más sencillo:
		IAcelerador aceleradorv2 = new Acelerador();
		IEmbrague embraguev2 = new Embrague();
		IPalancaCambios palancaCambiosv2 = new PalancaCambios();
		CentralitaFacade centralitaFacade = new CentralitaFacade(embraguev2, aceleradorv2, palancaCambiosv2);
		centralitaFacade.aumentarMarcha();
	}

}
