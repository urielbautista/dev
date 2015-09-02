package mx.umb.pattern.concurrency.activeobject;

public class DisplayClientThread extends Thread {
	private final ActiveObject object;

	public DisplayClientThread(String name, ActiveObject object) {
		super(name);
		this.object = object;
	}

	public void run() {
		try {
			int i = 0;
			while (true) {
				String string = Thread.currentThread().getName() + " " + i++;
				object.displayString(string);
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
