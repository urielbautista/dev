package mx.umb.pattern.gof.estructural.adapter.centralita;

//Implementamos la interfaz que espera recibir nuestra clase cliente
public class AdapterInglesEuropeo implements IEnchufeIngles {
	// Declaramos una referencia de la clase o interfaz a la que queremos conectarnos
    private IEnchufeEuropeo enchufe;
 
    // El constructor del adaptador recibirá como parámetro el objeto al que se quiere
    // adaptar nuestro cliente.
    public AdapterInglesEuropeo(IEnchufeEuropeo enchufe){
        this.enchufe = enchufe;
    }
    
    // Invocamos los métodos de la interfaz servidora, transformando los datos para que pueda
    // manejarlos la clase cliente
	@Override
	public int[] flujo110V() {
		// Invocamos el método de la interfaz incompatible
        int[] voltajes220 = enchufe.flujo220V();
 
        // Realizamos la adaptacion
        int[] voltajes110 = new int[voltajes220.length];
 
        for (int i = 0; i < voltajes220.length; i++)
            voltajes110[i] = (int)(voltajes220[i] / 2);
 
        // Devolvemos el resultado adaptado, que es el que espera el cliente
        return voltajes110;
	}

	@Override
	public int getNumeroBornes() {
		return enchufe.getNumeroBornes() - 1;
	}

}
