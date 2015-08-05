package mx.umb.pattern.comportamiento.command;

public class CommandMain {

	public static void main(String[] args) {
		  StockReceiver abcStock = new StockReceiver();
	      BuyStockCommand buyStockOrder = new BuyStockCommand(abcStock);
	      SellStockCommand sellStockOrder = new SellStockCommand(abcStock);

	      BrokerInvoker broker = new BrokerInvoker();
	      broker.takeOrder(buyStockOrder);
	      broker.takeOrder(sellStockOrder);
	      broker.placeOrders();	}
}
