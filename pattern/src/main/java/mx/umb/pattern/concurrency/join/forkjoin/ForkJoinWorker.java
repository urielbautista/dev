package mx.umb.pattern.concurrency.join.forkjoin;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinWorker {

	public static void main(String[] args) {
		// Check the number of available processors
		  int processors = Runtime.getRuntime().availableProcessors();
		  System.out.println("No of processors: " + processors);
		  
		  int n = 20;
		  
		  StopWatch stopWatch = new StopWatch();   
		  FibonacciProblem bigProblem = new FibonacciProblem(n);
		  
		  FibonacciTask task = new FibonacciTask(bigProblem);
		  ForkJoinPool pool = new ForkJoinPool(processors);
		  pool.invoke(task);
		  
		  long result = task.result;
		  System.out.println("Computed Result: " + result);
		  
		  stopWatch.stop();
		  System.out.println("Elapsed Time: " + stopWatch.getElapsedTime());
		  
	}

}
