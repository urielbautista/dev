package mx.umb.pattern.gof.comportamiento.observer.centralita;

public class ObserverAlerta implements IObserver {

    // Niveles minimos y maximos
    final private static int MIN_ACEITE = 12;
    final private static int MAX_ACEITE = 45;
 
    final private static int MIN_AGUA = 300;
    final private static int MAX_AGUA = 550;
 
    final private static int MIN_PRESION = 120;
    final private static int MAX_PRESION = 350;
    		
    // Atributos que modelan el estado
    private int nivelAceite;
    private int nivelAgua;
    private int nivelPresionNeumaticos;
 
    // Subject al que se encuentra suscrito el observer
    private ISubject subject;
    
    // El constructor suscribira el observer al subject
    public ObserverAlerta(ISubject subject){
        this.subject = subject;
        subject.registrarObserver(this);
    }
 
    
	@Override
	public void update(Object o) {
        // Comprobamos el tipo del objeto recibido como parametro
        int[] arrayInt = null;
        if (o  instanceof  int[]){
            arrayInt = (int[])o;
        }
        // Si es del tipo esperado (int[]) y del tamano esperado (3), actualizamos los
        // atributos
        if ((arrayInt != null) && (arrayInt.length == 3)){
            nivelAceite = arrayInt[0];
            nivelAgua = arrayInt[1];
            nivelPresionNeumaticos = arrayInt[2];
            // Comprobamos que los valores no exceden los limites
            comprobarAceite();
            comprobarAgua();
            comprobarNeumaticos();
        }
	}
	
	
    // Metodo que comprueba los niveles de aceite
    private void comprobarAceite() {
        if (nivelAceite < MIN_ACEITE){
            enviarAlerta();
            System.out.println("NIVEL DE ACEITE DEMASIADO BAJO:"+ nivelAceite +MIN_ACEITE);
        }
        if (nivelAceite > MAX_ACEITE) {
            enviarAlerta();
            System.out.println("NIVEL DE ACEITE DEMASIADO ALTO: "+ nivelAceite + MAX_ACEITE);
        }
    }
 
    // Metodo que comprueba los niveles de agua
    private void comprobarAgua(){
        if (nivelAgua < MIN_AGUA){
            enviarAlerta();
            System.out.println("NIVEL DE AGUA DEMASIADO BAJO: " + nivelAgua+ MIN_AGUA);
        }
        if (nivelAgua > MAX_AGUA){
            enviarAlerta();
            System.out.println("NIVEL DE AGUA DEMASIADO ALTO: "+ nivelAgua + MAX_AGUA);
        }
    }
 
    // Metodo que comprueba la presion de los neumaticos
    private void comprobarNeumaticos() {
        if (nivelPresionNeumaticos < MIN_PRESION){
            enviarAlerta();
            System.out.println("NIVEL DE PRESION DE NEUMATICOS DEMASIADO BAJO:" + nivelPresionNeumaticos + MIN_PRESION);
        }
        if (nivelPresionNeumaticos > MAX_PRESION){
            enviarAlerta();
            System.out.println("NIVEL DE PRESION DE NEUMATICOS DEMASIADO ALTO: "+ nivelPresionNeumaticos + MAX_PRESION);
        }
    }
 
    // Metodo que envie la alerta
    private void enviarAlerta() {
        // Este metodo podria enviar una alerta a la centralita del vehiculo que, por ejemplo,
        // forzaria a su detencion
    	System.out.println("ALERTA!!");
    }
    

}
