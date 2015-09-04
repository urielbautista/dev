package mx.umb.pattern.concurrency.threadspecificstorage;

public class BusinessService {
    public void businessMethod() {
        // get the context from thread local
        Context context = MyThreadLocal.get();
        System.out.println(context.getTransactionId());
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
