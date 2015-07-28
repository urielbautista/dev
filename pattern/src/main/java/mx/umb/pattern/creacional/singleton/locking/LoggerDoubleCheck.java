package mx.umb.pattern.creacional.singleton.locking;

/**Este código, sin embargo,presenta un problema permitido directamente por la máquina virtual, 
 * se llama escritura fuera de orden (out-of-order writes),este es un bug que fue solucionado en el JDK 5,
 * sin embargo aun existiendo la corrección no se recomienda utilizar este código.
**/
public class LoggerDoubleCheck {
	private static LoggerDoubleCheck instance;

    private LoggerDoubleCheck(){
    }

    public static LoggerDoubleCheck getInstance(){
         if(instance == null){
              synchronized(LoggerDoubleCheck.class){
                   if(instance == null){
                	   instance = new LoggerDoubleCheck();
                   }
              }
         }
         return instance;
    }
    
}
