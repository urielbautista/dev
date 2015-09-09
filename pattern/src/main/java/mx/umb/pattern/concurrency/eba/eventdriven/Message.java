package mx.umb.pattern.concurrency.eba.eventdriven;

public interface Message {
	public Class<? extends Message> getType();
}
