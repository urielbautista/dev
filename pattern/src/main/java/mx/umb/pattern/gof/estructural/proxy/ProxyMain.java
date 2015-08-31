package mx.umb.pattern.gof.estructural.proxy;

public class ProxyMain {

	public static void main(String[] args) {
		/**
		 https://danielggarcia.wordpress.com/2014/04/07/patrones-estructurales-vii-patron-proxy/
		 */
		Elemento elemento= new ElementoProxy(new ElementoReal());
		System.out.println(elemento.httpGet("google.com"));
	}
}
