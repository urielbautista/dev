package mx.umb.pattern.concurrency.guardedsuspension.sincronizer;

public class ThreadSyncronizer {
	private static ThreadSyncronizer threadSyncronizer = new ThreadSyncronizer();
	private boolean available = true;

	private ThreadSyncronizer() {
	}

	public static ThreadSyncronizer getInstance() {
		return threadSyncronizer;
	}

	public synchronized void lock() {
		while (available == false) {
			try {
				System.out.println("wait");
				wait();
			} catch (InterruptedException e) {
			}
		}
		System.out.println("look");
		available = false;
	}

	public synchronized void unlock() {
		System.out.println("unlook");
		available = true;
		notify();
	}

}
