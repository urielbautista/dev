package mx.umb.pattern.concurrency.readwritelock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Dictionary {
	private final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
	private final Lock read = readWriteLock.readLock();
	private final Lock write = readWriteLock.writeLock();
	private Map<String, String> dictionary = new HashMap<String, String>();

	public void set(String key, String value) {
		write.lock();
		try {
			dictionary.put(key, value);
		} finally {
			write.unlock();
		}
	}

	public String get(String key) {
		read.lock();
		try {
			return dictionary.get(key);
		} finally {
			read.unlock();
		}
	}

	public String[] getKeys() {
		read.lock();
		try {
			String keys[] = new String[dictionary.size()];
			return dictionary.keySet().toArray(keys);
		} finally {
			read.unlock();
		}

	}

}
