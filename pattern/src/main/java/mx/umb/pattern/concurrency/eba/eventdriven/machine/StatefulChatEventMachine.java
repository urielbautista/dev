package mx.umb.pattern.concurrency.eba.eventdriven.machine;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import mx.umb.pattern.concurrency.eba.eventdriven.Event;
import mx.umb.pattern.concurrency.eba.eventdriven.EventDispatcher;
import mx.umb.pattern.concurrency.eba.eventdriven.Handler;

public class StatefulChatEventMachine {
	private static class ChatState {
		private ArrayList<User> users;

		public ChatState() {
			this.users = new ArrayList<User>();
		}

		public void broadcast(Event evt) {
			for (User recipient : users)
				recipient.dispatch(evt);
		}

		// Mutators
		public void addUser(User user) {
			users.add(user);
		}

		public void removeUser(User user) {
			users.remove(user);
		}
	}

	private static class ChatHandler extends Handler {
		protected ChatState state;

		public ChatHandler(ChatState state) {
			this.state = state;
		}
	}

	private static class UserArrival extends Event {
		public User user;

		public UserArrival(User user) {
			this.user = user;
		}
	}

	private static class UserDeparture extends Event {
		public User user;

		public UserDeparture(User user) {
			this.user = user;
		}
	}

	private static class UserMessage extends Event {
		public User user;
		public String message;

		public UserMessage(User user, String message) {
			this.user = user;
			this.message = message;
		}
	}

	private static class User {
		public Queue<Event> eventQueue;
		public String name;

		public User(Queue<Event> eventQueue, String name) {
			this.eventQueue = eventQueue;
			this.name = name;
		}

		// Event demultiplexing
		public void dispatch(Event evt) {
			if (evt.getClass() == UserMessage.class) {
				UserMessage message = (UserMessage) evt;
				processMessage(message.user, message.message);
			}
		}

		// Event processing
		public void processMessage(User user, String userMessage) {
			if (user.equals(this))
				return;
		}

		// Event generation
		public void sendMessage(String message) {
			eventQueue.add(new UserMessage(this, message));
		}
	}

	public static void registerHandlers(EventDispatcher dispatcher,
			ChatState state) {
		dispatcher.registerChannel(UserArrival.class, new ChatHandler(state) {
			@Override
			public void dispatch(Event evt) {
				UserArrival arrival = (UserArrival) evt;
				state.addUser(arrival.user);

				System.out
						.println(arrival.user.name + " has entered the room.");
			}
		});

		dispatcher.registerChannel(UserDeparture.class, new ChatHandler(state) {
			@Override
			public void dispatch(Event evt) {
				UserDeparture departure = (UserDeparture) evt;
				state.removeUser(departure.user);

				System.out.println(departure.user.name + " has left the room.");
			}
		});

		dispatcher.registerChannel(UserMessage.class, new ChatHandler(state) {
			@Override
			public void dispatch(Event evt) {
				UserMessage message = (UserMessage) evt;
				String userMessage = String.format("%s: %s", message.user.name,
						message.message);
				System.out.println(userMessage);

				// Broadcast messages
				state.broadcast(message);
			}
		});
	}

	public static void main(String[] args) {
		EventDispatcher dispatcher = new EventDispatcher();
		ChatState state = new ChatState();
		Queue<Event> eventQueue = new LinkedList<Event>();

		registerHandlers(dispatcher, state);

		// Initialize users
		User foo = new User(eventQueue, "foo");
		User bar = new User(eventQueue, "bar");
		dispatcher.dispatch(new UserArrival(foo));
		dispatcher.dispatch(new UserArrival(bar));

		// Enqueue events from individual users
		foo.sendMessage("hello, bar!");
		bar.sendMessage("hello, foo!");
		foo.sendMessage("goodbye, bar!");

		// Dispatch all queued events
		while (!eventQueue.isEmpty()) {
			Event evt = eventQueue.remove();
			dispatcher.dispatch(evt);
		}

		// Finish up simulation
		dispatcher.dispatch(new UserDeparture(foo));
		dispatcher.dispatch(new UserDeparture(bar));
	}
}