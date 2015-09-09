package mx.umb.pattern.concurrency.eba.eventdriven;

public interface DynamicRouter<E extends Message> {
	public void registerChannel(Class<? extends E> contentType,	Channel<? extends E> channel);
	public abstract void dispatch(E content);
}
