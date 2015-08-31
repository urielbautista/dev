package mx.umb.pattern.gof.estructural.flyweight.centralita;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

public class VehiculoFactory {

	// El pool se encargará de almacenar las instancias de los objetos reutilizables
    private static Map<String, ModeloVehiculo> pool = new HashMap<String, ModeloVehiculo>();
 
    public static ModeloVehiculo getCar(String marca, String modelo, String color){
    	
        ModeloVehiculo v = null;
 
        // Si el modelo ya ha sido creado anteriormente, se recupera del pool
        if (pool.containsKey(marca + " " + modelo + " " + color)){
            v = pool.get(marca + " " + modelo + " " + color);
            System.out.println("\t* Recuperando del pool el vehiculo " + marca + " " + modelo + " " + color);
        }
 
        // En caso de que no exista, se instancia un nuevo objeto y se añade al pool.
        // Las próximas ocasiones en las que el objeto sea utilizado, se devolverá una referencia
        // al objeto existente, evitando ocupar más memoria en crear una nueva instancia
        else{
            // Dependiendo de algún parámetro (por ejemplo, si el modelo tiene el sufijo 'sport'), se
            // instanciará una clase u otra.
            if (modelo.endsWith("sport")){
                v = new ModeloDeportivo(marca, modelo, color);
            }else{
                v = new ModeloBerlina(marca, modelo, color);
            }

            // Se añade el objeto al pool: las sucesivas llamadas usarán este objeto en lugar de
            // instanciar uno nuevo
            pool.put(marca + " " + modelo + " " + color, v);
            System.out.println("\t* Insertando en el pool el vehiculo " + marca + " " + modelo + " " + color);
        }
 
        return v;
    }
}
