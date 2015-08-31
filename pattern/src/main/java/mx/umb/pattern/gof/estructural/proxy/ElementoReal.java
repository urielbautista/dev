package mx.umb.pattern.gof.estructural.proxy;

public class ElementoReal implements Elemento {

	@Override
	public String httpGet(String uri) {
		return "Response :" + uri;
	}

}
