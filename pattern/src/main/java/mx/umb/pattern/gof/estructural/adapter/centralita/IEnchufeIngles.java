package mx.umb.pattern.gof.estructural.adapter.centralita;

public interface IEnchufeIngles {
    // Devuelve un array de enteros con un voltaje de unos 110V
    int[] flujo110V();
 
    // Devuelve el numero de bornes del enchufe
    int getNumeroBornes();
}
