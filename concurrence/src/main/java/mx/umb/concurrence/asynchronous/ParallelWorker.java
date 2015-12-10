package mx.umb.concurrence.asynchronous;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ParallelWorker {
    private static int numberOfJobs = 5;
    public static int workerId;
    
    public ParallelWorker() {
    }
    
    public static void main(String[] args) {
        Date startTime = new java.util.Date();
        System.out.println("Start Work"  + startTime);
        ExecutorService es = Executors.newFixedThreadPool(3);
        CompletionService<Object> cs = new ExecutorCompletionService<Object>(es);

        for (int i=1;i<numberOfJobs;i++) {
            workerId = i;
            cs.submit(new Callable<Object>() {
                public Object call() throws Exception {
                    new SlowWorker( ParallelWorker.workerId).doWork();
                    return null;
                }
            });
        }
        System.out.println("... try to do something while the work is being done....");
        System.out.println("... and more ....");

        for (int i = 1; i < numberOfJobs; i++) {
          Object x;
            try {
                x = cs.take().get();
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