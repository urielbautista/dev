package mx.umb.pattern.comportamiento.command.centralita;

public class ApagarLucesCommand implements ICommand {

	// Referencia al objeto cuyo método se quiere encapsular
    private LucesReceiver luces;
 
    // El constructor inyectará el objeto cuyo método se quiere encapsular
    public ApagarLucesCommand(LucesReceiver luces){
        this.luces = luces;
    }
 
    // El método Execute() ejecutará el método encapsulado
	@Override
	public void execute() {
		luces.apagar();;
        System.out.println("Apagando las luces");
	}

}
