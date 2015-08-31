package mx.umb.pattern.gof.comportamiento.mediator;

public class Usuario implements IUsuarioChat {
	private String nombre;
	private ISalonDeChat salonDeChat;
	 
	public Usuario(ISalonDeChat salonDeChat) {
		this.salonDeChat=salonDeChat;	
	}

	@Override
	public void recibir(String de, String msg) {
		String mensaje= "El usaurio "+de+" te dice " +msg;
		System.out.println(nombre +" : "+mensaje);

	}

	@Override
	public void enviar(String a, String msg) {
		salonDeChat.enviar(nombre, a, msg);
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
}
