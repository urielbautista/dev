package mx.umb.pattern.concurrency.activeobject;

public interface ActiveObject {
	public abstract Result makeString(int count, char fillchar);
	public abstract void displayString(String string);
}
