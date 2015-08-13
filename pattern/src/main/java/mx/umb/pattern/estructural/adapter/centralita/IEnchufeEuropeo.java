package mx.umb.pattern.estructural.adapter.centralita;

public interface IEnchufeEuropeo {
    // Devuelve un array de enteros con un voltaje de unos 220V
    int[] flujo220V();
 
    // Devuelve el numero de bornes del enchufe
    int getNumeroBornes();
}
