package mx.umb.pattern.concurrency.eba.eventdriven;

public class Event implements Message {

	@Override
	public Class<? extends Message> getType() {
		return getClass();
	}

}
