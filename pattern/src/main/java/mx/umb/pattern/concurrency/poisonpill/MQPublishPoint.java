package mx.umb.pattern.concurrency.poisonpill;

public interface MQPublishPoint {
	public void put(Message msg) throws InterruptedException;
}
