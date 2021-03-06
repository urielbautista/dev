package mx.umb.pattern.concurrency.poisonpill;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class SimpleMessageQueue implements MessageQueue{
	private final BlockingQueue<Message> queue;

	public SimpleMessageQueue(int bound) {
		queue = new ArrayBlockingQueue<Message>(bound);
	}

	@Override
	public void put(Message msg) throws InterruptedException {
		queue.put(msg);
	}

	@Override
	public Message take() throws InterruptedException {
		return queue.take();
	}
}
