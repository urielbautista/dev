package mx.umb.pattern.gof.estructural.proxy.centralita;

public class CentralitaMain {

	public static void main(String[] args) {
		int codigoLlave = 532543463;
		int codigoSeguridad = -1038948470; 
		//int codigoSeguridad = 1038948470;
		
		CentralitaVehiculo centralita = new CentralitaVehiculo(codigoLlave, codigoSeguridad);
		 
		Llave llaveSimple = new LlaveReal(codigoLlave);
		llaveSimple.realizarContacto(centralita);
		 
		Llave proxy = new LlaveProxy(llaveSimple);
		proxy.realizarContacto(centralita);


	}

}
