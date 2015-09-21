package mx.umb.pattern.concurrency.proactor;

import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.spi.SelectorProvider;
import java.util.Iterator;
import java.util.Set;

public class Proactor {
	private Selector selector;

	public Proactor() throws IOException {
		selector = SelectorProvider.provider().openSelector();
	}

	public void register(SelectableChannel handle, int eventType,Object completionHandler) throws ClosedChannelException {
		handle.register(selector, eventType, completionHandler);
	}

	public void handleEvent() throws IOException {
		while (selector.select() > 0) {
			Set readyKeys = selector.selectedKeys();
			Iterator i = readyKeys.iterator();
			while (i.hasNext()) {
				SelectionKey sk = (SelectionKey) i.next();
				i.remove();
				((CompletionHandler) sk.attachment()).handleEvent(sk);
			}
		}
	}
}
