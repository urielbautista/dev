package mx.umb.pattern.estructural.proxy;

public class ElementoProxy implements Elemento {
	/** Incluímos una referencia a otro elemento.**/
	private Elemento elemento;
	
	/** Inyectamos el elemento a través del constructor.**/
	public ElementoProxy(Elemento elemento) {
        this.elemento = elemento;
    }
	
	
	/** El método HttpGet realizará comprobaciones y/o adaptaciones para
    posteriormente realizar la llamada al método homónimo del objeto real.**/
	@Override
	public String HttpGet(String uri) {

		if (uri.toLowerCase().contains("paginaprohibida.com")){
			return null;
		}else{
            return elemento.HttpGet(uri);
		}
	}

}
