package mx.umb.pattern.gof.comportamiento.command;

import mx.umb.pattern.gof.comportamiento.command.OrderCommand;

//CommandConcreto: define un enlace entre un objeto “Receiver” y una acción. 
//Implementa el método execute invocando la(s) correspondiente(s) operación(es) del “Receiver”.
public class SellStockCommand implements OrderCommand {
	private StockReceiver stockReceiver;

	public SellStockCommand(StockReceiver stockReceiver){
		this.stockReceiver = stockReceiver;
	}
	
	@Override
	public void execute() {
		stockReceiver.sell();
	}

}
