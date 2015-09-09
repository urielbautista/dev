package mx.umb.pattern.concurrency.eba.eventdriven;

public class Handler implements Channel<Event> {

	@Override
	public void dispatch(Event message) {
		System.out.println("Despachando: " + message.getClass());
	}

}
