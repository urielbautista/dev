package mx.umb.pattern.estructural.proxy;

public class ProxyMain {

	public static void main(String[] args) {
		Elemento elemento= new ElementoProxy(new ElementoReal());
		System.out.println(elemento.HttpGet("google.com"));
	}
}
