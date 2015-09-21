package mx.umb.pattern.concurrency.scheduler;

/**
 * Instances of this class manage the processing of Request objects.
 */
class Printer {
	private Scheduler scheduler = new Scheduler();

	/**
	 * Handle a request
	 */
	public void doIt(JournalEntry req) {
		try {
			scheduler.enter(req);
			try {
				/**
				 * really handle the request here.
				 */
			} finally {
				scheduler.done();
			}
		} catch (InterruptedException e) {
		}
	}
	
	
}