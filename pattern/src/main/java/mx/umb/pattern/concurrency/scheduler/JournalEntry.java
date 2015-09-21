package mx.umb.pattern.concurrency.scheduler;

import java.util.Date;

public class JournalEntry implements ScheduleOrdering  {
    private Date time = new Date();

    /**
     * return the time that this JournalEntry was created.
     */
    public Date getTime() { 
    	return time; 
    } 

    /**
     * Return true if the given request should be scheduled
     * before this one.
     */

	@Override
	public boolean isBefore(ScheduleOrdering nextRequest) {
        if (nextRequest instanceof JournalEntry)
            return getTime().before(((JournalEntry)nextRequest).getTime());
          return false;

	}

}
