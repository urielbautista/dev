package mx.umb.pattern.concurrency.eba.eventdriven;

public interface Channel<E extends Message> {
	public void dispatch(E message);
}
