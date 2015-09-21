package mx.umb.pattern.concurrency.scheduler;

import java.util.ArrayList;

/**
 * This class is used to explicitly schedule single threaded access to a
 * resource.
 */
public class Scheduler {
	// The runningThread variable is null when the managed resource is
	// not busy. It contains a reference to the thread that is using
	// the resource when the resource is busy.
	private Thread runningThread;

	// An invariant for this class is that a request and its
	// corresponding thread are only in waitingRequests and
	// waitingThreads while its call to enter is pending.
	private ArrayList waitingRequests = new ArrayList();
	private ArrayList waitingThreads = new ArrayList();

	/**
	 * This method is called before a thread starts using a managed resource.
	 * This method does not return until the managed resource is not busy and
	 * this Scheduler object decides it is the method call's turn to return.
	 * 
	 * @exception InterruptedException
	 *                if this thread has been interrupted.
	 */
	public void enter(JournalEntry req) throws InterruptedException {
		Thread thisThread = Thread.currentThread();

		// For the case when the managed resource is not busy,
		// synchronize on this object to ensure that two
		// concurrent calls to enter do not both return
		// immediately.
		synchronized (this) {
			if (runningThread == null) {
				runningThread = thisThread;
				return;
			}

			waitingThreads.add(thisThread);
			waitingRequests.add(req);
		}

		synchronized (thisThread) {
			// Wait until another thread's call to the done
			// method decides that it is this thread's turn.
			while (thisThread != runningThread) {
				thisThread.wait();
			}
		}

		synchronized (this) {
			int i = waitingThreads.indexOf(thisThread);
			waitingThreads.remove(i);
			waitingRequests.remove(i);
		}
	}

	/**
	 * This method is called to indicate that the current thread is finished
	 * with the managed resource.
	 * 
	 * @exception IllegalStateException
	 *                if called by a thread that is not the thread using the
	 *                managed resource.
	 */
	synchronized public void done() {
		if (runningThread != Thread.currentThread()) {
			throw new IllegalStateException("Wrong Thread");
		}

		int waitCount = waitingThreads.size();
		if (waitCount <= 0) {
			// no request left
			runningThread = null;
		} else if (waitCount == 1) {
			// the last request
			runningThread = (Thread) waitingThreads.get(0);
		} else {
			// reorgnize the order of the request
			int next = waitCount - 1;
			ScheduleOrdering nextRequest;
			nextRequest = (ScheduleOrdering) waitingRequests.get(next);

			for (int i = waitCount - 2; i >= 0; i--) {
				ScheduleOrdering req;
				req = (ScheduleOrdering) waitingRequests.get(i);
				if (req.isBefore(nextRequest)) {
					next = i;
					nextRequest = (ScheduleOrdering) waitingRequests
							.get(next);
				}
			}

			runningThread = (Thread) waitingThreads.get(next);
		}

//		synchronized (runningThread) {
//			runningThread.notifyAll();
//		}
	}
}