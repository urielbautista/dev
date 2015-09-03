package mx.umb.pattern.concurrency.monitorobject;

public class MonitorSample {
	// this object plays the role of monitor
	private Object monitor = new Object();
	
	public void synchronizedMethod(String name) {
	    // When thread is able to enter behind synchronized(monitor) {, it means that the
	    // monitor region and monitor can be acquired by this thread
	    synchronized(monitor) {
	      // The code included between synchronized block is monitor region - the code that 
	      // can be executed only by one thread at given moment, from the begin to the end.
	      // When given thread access here, it owns the monitor region.
	    System.out.println(name+" accessed here");
	      // After the print, the monitor region and monitor are released.
	    }
	}
	  
	public static void main(String[] args) {
		final MonitorSample sample = new MonitorSample();
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				sample.synchronizedMethod("Thread#1");
			}
	    });
	    
	    Thread t2 = new Thread(new Runnable() {
	    	@Override
	    	public void run() {
	    		sample.synchronizedMethod("Thread#2");
	    	}
	    });
	    
	    t1.start();
	    t2.start();

	}

}
