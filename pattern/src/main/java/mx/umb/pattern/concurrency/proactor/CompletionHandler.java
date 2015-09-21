package mx.umb.pattern.concurrency.proactor;

import java.nio.channels.SelectionKey;

public interface CompletionHandler {
	public void handleEvent(SelectionKey sk);
}
