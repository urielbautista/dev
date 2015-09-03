package mx.umb.pattern.concurrency.poisonpill;

public interface MQSubscribePoint {
	public Message take() throws InterruptedException;
}
