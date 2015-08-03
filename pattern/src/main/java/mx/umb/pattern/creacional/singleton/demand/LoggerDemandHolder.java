package mx.umb.pattern.creacional.singleton.demand;


/**
 *  Se llama inicialización bajo demanda al poseedor (initialization on demand holder):
 *  ,este procedimiento no utilizar la instrucción synchronized lo cual evita el cuello de botella. 
 *  pero por qué si funciona? básicamente lo hace al aprovechar el hecho de que las clases internas 
 *  no son cargadas hasta que son referenciadas.Es importante que al utilizar el patrón Singleton se 
 *  asegure de que realmente lo es, es decir, siempre devuelva la misma instancia del objeto no importa 
 *  si su aplicación es o no multihilo la implementación del patrón siempre debe funcionar en ambos ambientes.
 */	
public class LoggerDemandHolder {

	private LoggerDemandHolder(){	
	}

    private static class LazyHolder {
         public static LoggerDemandHolder logger = new LoggerDemandHolder();
    }

    public static LoggerDemandHolder getInstance(){
         return LazyHolder.logger;
    }
    
}
