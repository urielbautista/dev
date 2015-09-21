package mx.umb.pattern.concurrency.eba.eventmodel;

import java.util.EventObject;

public class NumberReadEvent extends EventObject {

	private Double number;

	public NumberReadEvent(Object source, Double number) {
		super(source);
		this.number = number;
	}

	public Double getNumber() {
		return number;
	}
}
