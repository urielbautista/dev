package mx.umb.concurrence.asynchronous;

import java.util.Date;

public class SequentialWorker {
    private static int numberOfJobs = 5;
    
    public SequentialWorker() {
    }
    
    public static void main(String[] args) {
        Date startTime = new java.util.Date();
        System.out.println("Start Work"  + startTime);
        
        for(int i=1;i<numberOfJobs;i++) {
          System.out.println("* Start worker "+i);                           
          SlowWorker worker = new SlowWorker(i);
          worker.doWork();
        }
        
        System.out.println("... try to do something while the work is being done....");
        
        Date endTime = new java.util.Date();
        System.out.println("End work at " + endTime);
        System.out.println("Job took " + new Double(0.001*(endTime.getTime() - startTime.getTime()))+ " seconds");
        System.exit(0);
    }
}
