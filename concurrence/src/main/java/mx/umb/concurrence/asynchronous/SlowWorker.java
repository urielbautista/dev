package mx.umb.concurrence.asynchronous;

public class SlowWorker {
    private int id;
    
    public SlowWorker() {
        this.id = 1;
    }
    
    public SlowWorker(int id) {
        this.id = id;
    }
    
    public void doWork() {
        try {
            System.out.println("==== working, working, working ====== (Worker Id = "  + this.id+")");
            Thread.sleep(2000);
            System.out.println("==== ready! ======");
        } catch (InterruptedException e) {
        	
        }
    }
    
    public static void main(String[] args) {
        SlowWorker worker = new SlowWorker();
        System.out.println("Start Work"  + new java.util.Date());
        worker.doWork();
        System.out.println("... try to do something while the work is being done....");
        
        System.out.println("End work" + new java.util.Date());
        System.exit(0);
    }
}