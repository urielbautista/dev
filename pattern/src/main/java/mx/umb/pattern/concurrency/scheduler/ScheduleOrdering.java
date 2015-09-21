package mx.umb.pattern.concurrency.scheduler;

public interface ScheduleOrdering {
	public boolean isBefore(ScheduleOrdering nextRequest);
}
