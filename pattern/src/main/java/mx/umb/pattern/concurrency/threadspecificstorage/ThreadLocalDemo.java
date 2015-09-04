package mx.umb.pattern.concurrency.threadspecificstorage;

public class ThreadLocalDemo extends Thread{

    public static void main(String args[]) {
        Thread threadOne = new ThreadLocalDemo();
        threadOne.start();

        Thread threadTwo = new ThreadLocalDemo();
        threadTwo.start();
        
        Thread threadThree = new ThreadLocalDemo();
        threadThree.start();
    }

    @Override
    public void run() {
        // sample code to simulate transaction id
        Context context = new Context();
        context.setTransactionId(getName());

        // set the context object in thread local to access it somewhere else
        MyThreadLocal.set(context);

        /* note that we are not explicitly passing the transaction id */
        new BusinessService().businessMethod();
        MyThreadLocal.unset();

    }
}
