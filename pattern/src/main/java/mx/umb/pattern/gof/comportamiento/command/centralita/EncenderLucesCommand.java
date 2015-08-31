package mx.umb.pattern.gof.comportamiento.command.centralita;

public class EncenderLucesCommand implements ICommand {
	
	// Referencia al objeto cuyo método se quiere encapsular
    private LucesReceiver luces;
 
    // El constructor inyectará el objeto cuyo método se quiere encapsular
    public EncenderLucesCommand(LucesReceiver luces){
        this.luces = luces;
    }
 
    // El método Execute() ejecutará el método encapsulado
	@Override
	public void execute() {
		int distancia = luces.encender();
        System.out.println("Encendiendo luces. Alumbrando a una distancia de {0} metros."+ distancia);
	}

}
