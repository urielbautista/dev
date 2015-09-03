package mx.umb.pattern.concurrency.poisonpill;

import java.util.Map;

public interface Message {
	public static final Message POISON_PILL = new Message() {

		@Override
		public void addHeader(Headers header, String value) {
			throw poison();
		}

		@Override
		public String getHeader(Headers header) {
			throw poison();
		}

		@Override
		public Map<Headers, String> getHeaders() {
			throw poison();
		}

		@Override
		public void setBody(String body) {
			throw poison();
		}

		@Override
		public String getBody() {
			throw poison();
		}

		private RuntimeException poison() {
			return new UnsupportedOperationException("Poison");
		}

	};

	public enum Headers {
		DATE, SENDER
	}

	public void addHeader(Headers header, String value);
	public String getHeader(Headers header);
	public Map<Headers, String> getHeaders();
	public void setBody(String body);
	public String getBody();
}
