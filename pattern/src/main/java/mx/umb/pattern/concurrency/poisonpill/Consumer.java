package mx.umb.pattern.concurrency.poisonpill;

import mx.umb.pattern.concurrency.poisonpill.Message.Headers;

public class Consumer {
	private final MQSubscribePoint queue;
	private final String name;

	public Consumer(String name, MQSubscribePoint queue) {
		this.name = name;
		this.queue = queue;
	}

	public void consume() {
		while (true) {
			Message msg;
			try {
				msg = queue.take();
				if (msg == Message.POISON_PILL) {
					System.out.println(String.format("Consumer %s receive request to terminate.", name));
					break;
				}
			} catch (InterruptedException e) {
				// allow thread to exit
				System.err.println(e);
				return;
			}

			String sender = msg.getHeader(Headers.SENDER);
			String body = msg.getBody();
			System.out.println(String.format("Message [%s] from [%s] received by [%s]", body, sender, name));
		}
	}
}
