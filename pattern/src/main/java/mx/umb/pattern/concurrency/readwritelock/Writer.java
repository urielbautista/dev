package mx.umb.pattern.concurrency.readwritelock;

public class Writer extends Thread {
	private boolean runForestRun = true;
	private Dictionary dictionary = null;

	public Writer(Dictionary dictionary, String threadName) {
		this.dictionary = dictionary;
		this.setName(threadName);
	}

	@Override
	public void run() {
		while (this.runForestRun) {
			
			String[] keys = dictionary.getKeys();
			for (String key : keys) {
				String newValue = getNewValueFromDatastore(key);
				// updating dictionary with WRITE LOCK
				dictionary.set(key, newValue);
			}

			// update every seconds
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}

	}

	public void stopWriter() {
		this.runForestRun = false;
		this.interrupt();
	}

	public String getNewValueFromDatastore(String key) {
		// This part is not implemented. Out of scope of this artile
		return "newValue";
	}

}
