package mx.umb.pattern.concurrency.monitorobject;

public class MonitorExclusion {

	public static void main(String[] args) {
		VisitableHouse house = new VisitableHouse();
		Thread visitor1 = new Thread(new Visitor(house, "visitor#1"));
		Thread visitor2 = new Thread(new Visitor(house, "visitor#2"));
		Thread visitor3 = new Thread(new Visitor(house, "visitor#3"));
		Thread visitor4 = new Thread(new Visitor(house, "visitor#4"));
		Thread visitor5 = new Thread(new Visitor(house, "visitor#5"));
		visitor1.start();
		visitor2.start();
		visitor3.start();
		visitor4.start();
		visitor5.start();
	}

}

class Visitor implements Runnable {
	private VisitableHouse house;
	private String name;

	public Visitor(VisitableHouse house, String name) {
		this.house = house;
		this.name = name;
	}

	@Override
	public void run() {
		this.house.visit(this.name);
	}
}

class VisitableHouse {
	private Object visit = new Object();

	public void visit(String visitor) {
		System.out.println(visitor + " is waiting for the visit");
		synchronized (visit) {
			try {
				Thread.sleep(1000);
				System.out.println(visitor + " is visited the house");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		;
	}
}
