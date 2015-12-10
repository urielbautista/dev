package mx.umb.concurrence.asynchronous;

import java.util.concurrent.Callable;

public class CallingBackWorker implements Callable {
    private CallbackInterface employer;
    
    public CallingBackWorker() {
    }

    public Object call() {
        new SlowWorker().doWork();
        employer.returnResult("Task Completed!");
        return null;
    }

    public void setEmployer(CallbackInterface employer) {
        this.employer = employer;
    }

    public CallbackInterface getEmployer() {
        return employer;
    }
}
