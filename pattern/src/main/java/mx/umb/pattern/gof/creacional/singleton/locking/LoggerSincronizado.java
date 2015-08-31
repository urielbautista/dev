package mx.umb.pattern.gof.creacional.singleton.locking;

/**Este código soluciona la creacion de doble instnacia en entornos multihilos,
 * sin embargo, tiene el  problema de bajo desempeño; dado que se utilizó la instrucción synchronized 
 * en el método todo los llamados para este serán encolados, es aquí entonces donde se crea un cuello de botella
**/
public class LoggerSincronizado {
	private static LoggerSincronizado instance = null;
	
    private LoggerSincronizado(){
    }

    public static synchronized LoggerSincronizado getInstance(){
        if(instance == null){
        	instance = new LoggerSincronizado();
        }
        return instance;
   }
    
}
