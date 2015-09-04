package mx.umb.pattern.concurrency.threadspecificstorage;

public class ThreadLocalExample implements Runnable {
	private ThreadLocal threadLocal = new ThreadLocal();
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " " + threadLocal.get());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		threadLocal.set(System.nanoTime());
		System.out.println(Thread.currentThread().getName() + " " + threadLocal.get());
	}
	
	public static void main(String[] args) {
		ThreadLocalExample  sharedRunnableInstance = new ThreadLocalExample ();
	    Thread thread1 = new Thread(sharedRunnableInstance);
	    Thread thread2 = new Thread(sharedRunnableInstance);
	    thread1.start();
	    thread2.start();
	}

}
