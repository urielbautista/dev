package mx.umb.concurrence.asynchronous;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SequentialAsynchronousWorker {
    private static int numberOfJobs = 5;
    
    public SequentialAsynchronousWorker() {
    }
    
    public static void main(String[] args) {
        Date startTime = new java.util.Date();
        System.out.println("Start Work"  + startTime);
        
        ExecutorService es = Executors.newFixedThreadPool(5);
        List<Future> futures = new ArrayList<Future>();
        
        for(int i=1;i<numberOfJobs;i++) {
          System.out.println("* Start worker "+ i);                           
          futures.add(es.submit(new Callable() {
        	  public Object call() throws Exception {
        		  new SlowWorker().doWork();
                  return null;
              }
          }));
        }
       
        System.out.println("... try to do something while the work is being done....");
        System.out.println("... and more ....");
        int ctr=0;
        for (Future future:futures){
            try {
                future.get();
                System.out.println("** response worker "+ ++ctr +" is in");
            } catch (InterruptedException e) {
            } catch (ExecutionException e) {
            }
        }

    
        Date endTime = new java.util.Date();
        System.out.println("End work at " + endTime);
        System.out.println("Job took " + new Double(0.001*(endTime.getTime() - startTime.getTime()))+ " seconds");
        System.exit(0);
    }
    
}