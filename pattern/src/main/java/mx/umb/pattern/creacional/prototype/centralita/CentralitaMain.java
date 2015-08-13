package mx.umb.pattern.creacional.prototype.centralita;

public class CentralitaMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		//vemos que el segundo coche tiene un color distinto: 
		//se trata de una instancia diferente, por lo que una vez que se ha producido la clonación, 
		//estos mantienen un estado independiente.
		System.out.println("********** Version basica **********");
		Vehiculo v = new Vehiculo();
		 
		v.setMarca("Peugeot");
		v.setModelo("306");
		v.setColor( "Negro");
		 
		v.setTipoCarroceria(new Carroceria());
		v.getTipoCarroceria().setMaterial("Acero");
		v.getTipoCarroceria().setHabitaculoReforzado(true);
		v.getTipoCarroceria().setTipoCarroceria("Monovolumen");
		 
		v.setTipoRueda(new Rueda());
		v.getTipoRueda().setNeumatico("Bridgestone");
		v.getTipoRueda().setLlanta("Aluminio");
		v.getTipoRueda().setDiametro(17);
		 
		Vehiculo v2 = (Vehiculo) v.clone();
		v2.setColor("Rojo");
		
		System.out.println(v.vehiculoInfo());
		System.out.println("--------------------------------------");
		System.out.println(v2.vehiculoInfo());	 
		System.out.println();

		//veremos que, en esta ocasión, pese a que hemos modificado el objeto del segundo elemento, 
		//el objeto del primero también ha sido modificado:
		System.out.println("********** Version dos **********");
		Vehiculo v3 = new Vehiculo();
		v3.setMarca("Peugeot");
		v3.setModelo("306");
		v3.setColor( "Negro");
		 
		v3.setTipoCarroceria(new Carroceria());
		v3.getTipoCarroceria().setMaterial("Acero");
		v3.getTipoCarroceria().setHabitaculoReforzado(true);
		v3.getTipoCarroceria().setTipoCarroceria("Monovolumen");
		 
		v3.setTipoRueda(new Rueda());
		v3.getTipoRueda().setNeumatico("Bridgestone");
		v3.getTipoRueda().setLlanta("Aluminio");
		v3.getTipoRueda().setDiametro(17);
		 
		Vehiculo v4 = (Vehiculo) v3.clone();
		v4.setColor("Rojo");
		v4.getTipoRueda().setDiametro(15);
		v4.getTipoRueda().setNeumatico("Michelin");
		v4.getTipoRueda().setLlanta("Aleación");
		
		System.out.println(v3.vehiculoInfo());
		System.out.println("--------------------------------------");
		System.out.println(v4.vehiculoInfo());	 
		System.out.println();
		

	}

}
