package mx.umb.pattern.concurrency.activeobject;

public class DisplayStringRequest extends MethodRequest {
	private final String string;

	public DisplayStringRequest(Servant servant, String s) {
		super(servant, null);
		string = s;
	}
	
	@Override
	public void execute() {
		servant.displayString(string);
	}

}
