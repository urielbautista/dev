package mx.umb.pattern.gof.comportamiento.command;

//Receiver: sabe como llevar a cabo las operaciones asociadas a una petición. 
//Invoker: le pide a la orden que ejecute la petición.
public class StockReceiver {
	private String name = "ABC";
	private int quantity = 10;

	public void buy(){
		System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
	}
	public void sell(){
		System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
	}
	   
}