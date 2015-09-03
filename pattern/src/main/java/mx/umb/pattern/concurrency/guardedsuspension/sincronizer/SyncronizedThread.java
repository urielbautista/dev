package mx.umb.pattern.concurrency.guardedsuspension.sincronizer;

public class SyncronizedThread implements Runnable {

	private ThreadSyncronizer threadSyncronizer;
	private int count;

	public SyncronizedThread(int count) {
		this.count = count;
		threadSyncronizer = ThreadSyncronizer.getInstance();
	}

	@Override
	public void run() {
		threadSyncronizer.lock();
		try {
			System.out.println("Thread(" + count + ") Run!");
			Thread.sleep(1000);
			System.out.println("Thread(" + count + ") End!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		threadSyncronizer.unlock();
	}

}
