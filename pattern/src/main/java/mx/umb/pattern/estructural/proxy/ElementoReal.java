package mx.umb.pattern.estructural.proxy;

public class ElementoReal implements Elemento {

	@Override
	public String HttpGet(String uri) {
		return "Response :" + uri;
	}

}
