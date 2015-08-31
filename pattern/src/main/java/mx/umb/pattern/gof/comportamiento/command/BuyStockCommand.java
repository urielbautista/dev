package mx.umb.pattern.gof.comportamiento.command;

//CommandConcreto: define un enlace entre un objeto “Receiver” y una acción. 
//Implementa el método execute invocando la(s) correspondiente(s) operación(es) del “Receiver”.
public class BuyStockCommand implements OrderCommand {
	private StockReceiver stockReceiver;

	public BuyStockCommand(StockReceiver stockReceiver){
		this.stockReceiver = stockReceiver;
	}

	@Override
	public void execute() {
		stockReceiver.buy();
	}

}