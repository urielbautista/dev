package mx.umb.pattern.comportamiento.command.centralita;

public interface IInvoker {
	// Inyecta un ICommand, permitiendo cambiar la operación encapsulada en
    // tiempo de ejecución
    void setCommand(ICommand command);
 
    // Ejecuta el método encapsulado
    void invoke();
    
}
