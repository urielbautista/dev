package mx.umb.pattern.concurrency.lock;

public class Resource {
	public void doSomething(){
		//do some operation, DB read, write etc
		System.out.println("Operacion bloqueada");
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	     
	public void doLogging(){
		//logging, no need for thread safety
		System.out.println("Operacion no bloqueada");
	}
}
