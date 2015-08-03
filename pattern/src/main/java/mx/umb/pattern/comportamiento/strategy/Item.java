package mx.umb.pattern.comportamiento.strategy;

public class Item {
	private String upcCode;
	private int price;

	public Item (String upc, int cost){
		this.upcCode=upc;
		this.price=cost;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}