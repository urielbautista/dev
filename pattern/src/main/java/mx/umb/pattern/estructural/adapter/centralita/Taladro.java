package mx.umb.pattern.estructural.adapter.centralita;

public class Taladro {
	 // Enchufe del taladro
    private IEnchufeIngles enchufe;
 
    // Constructor a traves del cual se inyecta el enchufe
    public Taladro(IEnchufeIngles enchufeTaladro){
        this.enchufe = enchufeTaladro;
    }
 
    public void encender(){
        // Obtenemos la alimentación a través de la interfaz.
        // Recordemos que nuestro enchufe requiere una alimentacion de 110V
        int[] voltaje100ms = enchufe.flujo110V();
 
        // Mostramos por pantalla el resultado.
        for (int i = 0; i < voltaje100ms.length; i++)
            System.out.println("El taladro esta funcionando con voltaje de " + voltaje100ms[i] +" Voltios");
    }
}
