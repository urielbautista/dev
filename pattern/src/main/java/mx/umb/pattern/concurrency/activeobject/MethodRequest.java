package mx.umb.pattern.concurrency.activeobject;

public abstract  class MethodRequest {
	protected final Servant servant;
	protected final FutureResult future;

	public MethodRequest(Servant servant, FutureResult future) {
		this.servant = servant;
		this.future = future;
	}

	public abstract void execute();
	
}
