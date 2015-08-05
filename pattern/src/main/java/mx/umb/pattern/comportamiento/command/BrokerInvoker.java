package mx.umb.pattern.comportamiento.command;

import java.util.ArrayList;
import java.util.List;

//Invoker: le pide a la orden que ejecute la petición.
public class BrokerInvoker {
	private List<OrderCommand> orderList = new ArrayList<OrderCommand>(); 

	public void takeOrder(OrderCommand order){
		orderList.add(order);		
	}

	public void placeOrders(){
	   
		for (OrderCommand order : orderList) {
			order.execute();
		}
		orderList.clear();
		
	}
	   
}