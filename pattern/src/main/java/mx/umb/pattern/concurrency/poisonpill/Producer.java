package mx.umb.pattern.concurrency.poisonpill;

import java.util.Date;

import mx.umb.pattern.concurrency.poisonpill.Message.Headers;

public class Producer {
	private final MQPublishPoint queue;
	private final String name;
	private boolean isStopped;

	public Producer(String name, MQPublishPoint queue) {
		this.name = name;
		this.queue = queue;
		this.isStopped = false;
	}

	public void send(String body) {
		if (isStopped) {
			throw new IllegalStateException(String.format("Producer %s was stopped and fail to deliver requested message [%s].", body, name));
		}
		Message msg = new SimpleMessage();
		msg.addHeader(Headers.DATE, new Date().toString());
		msg.addHeader(Headers.SENDER, name);
		msg.setBody(body);

		try {
			queue.put(msg);
		} catch (InterruptedException e) {
			// allow thread to exit
			System.err.println(e);
		}
	}

	public void stop() {
		isStopped = true;
		try {
			queue.put(Message.POISON_PILL);
		} catch (InterruptedException e) {
			// allow thread to exit
			System.err.println(e);
		}
	}
}
