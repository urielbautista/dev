package mx.umb.pattern.creacional.singleton;

/**Este código soluciona la creacion de doble instnacia en entornos multihilos,sin embargo, 
 * tiene el  problema de bajo desempeño; dado que se utilizó la instrucción synchronized 
 * en el método todo los llamados para este serán encolados, es aquí entonces donde se crea un cuello de botella
 **/
public class Logger {
	private static Logger instance = null;
	
    private Logger(){
    }

    public static synchronized Logger getInstance(){
        if(instance == null){
        	instance = new Logger();
        }
        return instance;
   }
    
}
