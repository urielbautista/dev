package mx.umb.pattern.concurrency.halfsynchalfasync;

import java.util.concurrent.LinkedBlockingQueue;


public class Main {

	public static void main(String[] args) {
		;
		
		AsynchronousService service = new AsynchronousService( new LinkedBlockingQueue<Runnable> ()  );
		/*
		 *  A new task to calculate sum is received but as this is main thread, it should not block.
		 *  So it passes it to the asynchronous task layer to compute and proceeds with handling other
		 *  incoming requests. This is particularly useful when main thread is waiting on Socket to receive
		 *  new incoming requests and does not wait for particular request to be completed before responding
		 *  to new request.
		 */
		service.execute(new ArithmeticSumTask(1000));
		
		/* New task received, lets pass that to async layer for computation. So both requests will be
		 * executed in parallel.
		 */
		service.execute(new ArithmeticSumTask(500));
		service.execute(new ArithmeticSumTask(2000));
		service.execute(new ArithmeticSumTask(1));
	}
	
}
