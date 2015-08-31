package mx.umb.pattern.gof.comportamiento.command.centralita;

public class ControladorLucesInvoker implements IInvoker {

	private ICommand command;
	 
	@Override
	public void setCommand(ICommand command) {
		this.command= command;
	}

	@Override
	public void invoke() {
		command.execute();
	}

}
