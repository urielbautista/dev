package mx.umb.pattern.gof.estructural.adapter.centralita;

import java.util.Random;

public class EnchufeEspanol implements IEnchufeEuropeo {

	// Devuelve un array con voltajes en distintos momentos
	@Override
	public int[] flujo220V() {
		 int[] arrayFlujo = new int[100];
	        Random r = new Random();
	        for (int i = 0; i < arrayFlujo.length; i++){
	            // Calculamos la fluctuacion del voltaje
	            int fluctuacion = r.nextInt(100) > 50 ? 1 : -1;    // Positiva o negativa
	            fluctuacion = fluctuacion * (r.nextInt(10) + 1);    // El valor fluctuara entre -0 y +10
	 
	            // Valor total entre 210 y 230V
	            arrayFlujo[i] = fluctuacion + 220;
	        }
	 
	        return arrayFlujo;
	}

    // Devuelve el numero de bornes del enchufe
	@Override
	public int getNumeroBornes() {
		return 2;
	}

}
