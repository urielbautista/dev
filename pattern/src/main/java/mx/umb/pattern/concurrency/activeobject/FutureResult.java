package mx.umb.pattern.concurrency.activeobject;

public class FutureResult extends Result {

	private boolean ready = false;
	private Result result;

	public synchronized void setResult(Result result) {
		this.result = result;
		this.ready = true;
		notifyAll();
	}

	@Override
	public synchronized Object getResultValue() {
		while (!ready)
			try {
				System.out.println("ready"+ ready);
				wait();
			} catch (InterruptedException e) {
				System.out.println("PASO ALFO");
			}
		return result.getResultValue();
	}

}
