package mx.umb.pattern.gof.comportamiento.state.centralita;

public class VehiculoBasico {

    // Estados
    private final int APAGADO = 0;
    private final int PARADO = 1;
    private final int EN_MARCHA = 2;
 
    // Atributos
    private final int VELOCIDAD_MAXIMA = 200;
    private int estado = APAGADO;
    private int velocidadActual = 0;
    
    public void contactar() {
        switch (estado) {
        	case APAGADO: {
        		// El vehiculo arranca
        		estado = PARADO;
        		velocidadActual = 0;
        		System.out.println("El vehiculo se encuentra ahora PARADO");
        		break;
             }case PARADO: {
            	 // El vehiculo se apaga
            	 estado = APAGADO;
            	 System.out.println("El vehiculo se encuentra ahora APAGADO");
            	 break;
             }case EN_MARCHA: {
            	 // No se puede detener el vehiculo en marcha!
            	System.out.println("ERROR: No se puede cortar el contacto en marcha!");
            	break;
             }default:
                break;
        }
    } 
 
    public void acelerar(){
        switch (estado){
            case APAGADO: {
            	// Acelerar con el vehiculo apagado no sirve de mucho <span class="wp-smiley wp-emoji wp-emoji-smile" title=":)">:)</span>
            	System.out.println("ERROR: El vehiculo esta apagado. Efectue el contacto para iniciar");
            	break;
            }case PARADO:{
            	// El vehiculo se pone en marcha. Aumenta la velocidad y cambiamos de estado
            	velocidadActual += 10;
            	estado = EN_MARCHA;
            	System.out.println("El vehiculo se encuentra ahora EN_MARCHA");
            	System.out.println("Velocidad actual: " + velocidadActual);
                break;
            }case EN_MARCHA: {
            	// Aumentamos la velocidad, permaneciendo en el mismo estado
            	if (velocidadActual >= VELOCIDAD_MAXIMA)
            		System.out.println("ERROR: El coche ha alcanzado su velocidad maxima");
            	else
            		velocidadActual += 10;
                break;
            }default:
            	break;
        }
    }
    
    public void frenar(){
        switch (estado){
            case APAGADO:{
            	// Frenar con el vehiculo parado tampoco sirve de mucho...
            	System.out.println("ERROR: El vehiculo esta apagado. Efectue el contacto para iniciar");
            	break;
            }case PARADO: {
            	// No ocurre nada. Si el vehiculo ya se encuentra detenido, no habra efecto alguno
            	System.out.println("ERROR: El vehiculo ya se encuentra detenido");
            	break;
            }case EN_MARCHA:{
            	// Reducimos la velocidad. Si esta llega a 0, cambiaremos a estado "PARADO"
            	velocidadActual -= 10;
            	if (velocidadActual <= 0){
            		estado = PARADO;
            		System.out.println("El vehiculo se encuentra ahora PARADO");
            	}
            	System.out.println("Velocidad actual: " + velocidadActual);
                break;
            }default:
                break;
        }
    }

	public static void main(String[] args) {
		VehiculoBasico vehiculoBasico= new VehiculoBasico();
		vehiculoBasico.acelerar();
		vehiculoBasico.contactar();
		vehiculoBasico.acelerar();
		vehiculoBasico.acelerar();
		vehiculoBasico.acelerar();
		vehiculoBasico.frenar();
		vehiculoBasico.frenar();
		vehiculoBasico.frenar();
		vehiculoBasico.frenar();
	}
    
}