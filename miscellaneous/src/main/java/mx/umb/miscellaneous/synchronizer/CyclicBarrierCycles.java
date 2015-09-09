package mx.umb.miscellaneous.synchronizer;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierCycles {

	 static CyclicBarrier barrier;

	    public static void main(String[] args) throws InterruptedException {
	        barrier = new CyclicBarrier(3); 

	        new Worker().start();
	       // Thread.sleep(1000);
	        new Worker().start();
	       // Thread.sleep(1000);
	        new Worker().start();
	       // Thread.sleep(1000);

	        new Worker().start();
	       // Thread.sleep(1000);
	        new Worker().start();
	        //Thread.sleep(1000);
	        new Worker().start();
	        
	        System.out.println("Barrier automatically resets.");
	    }

	}


	class Worker extends Thread {
	    @Override
	    public void run() {
	        try {
	        	System.out.println("Haciendo Lago");
	            Thread.sleep(1000);
	            CyclicBarrierCycles.barrier.await();

	            System.out.println("Let's play.");
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        } catch (BrokenBarrierException e) {
	            e.printStackTrace();
	        }
	    }
	}