package mx.umb.pattern.concurrency.reactor;

import java.nio.channels.SelectionKey;

public interface EventHandler {
	void handleEvent(SelectionKey handle) throws Exception;
}
