package mx.umb.pattern.concurrency.lock;

public class SynchronizedLockExample implements Runnable {
	private Resource resource;
    
    public SynchronizedLockExample(Resource r){
        this.resource = r;
    }
     
    
	@Override
	public void run() {
        synchronized (resource) {
            resource.doSomething();
        }
        resource.doLogging();
	}
	
	public static void main(String[] args) {
		new SynchronizedLockExample(new Resource()).run();
		new SynchronizedLockExample(new Resource()).run();
		new SynchronizedLockExample(new Resource()).run();
	}


}
