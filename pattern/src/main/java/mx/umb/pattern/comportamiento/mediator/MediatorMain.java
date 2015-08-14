package mx.umb.pattern.comportamiento.mediator;

public class MediatorMain {

	public static void main(String[] args) {
		ISalonDeChat salonDeChat= new SalonDeChat();
		Usuario usuarioJuan= new Usuario(salonDeChat);
		usuarioJuan.setNombre("Juan");
		
		salonDeChat.registrar(usuarioJuan);
		
		Usuario usuarioPepe= new Usuario(salonDeChat);
		usuarioPepe.setNombre("Pepe");
		
		salonDeChat.registrar(usuarioPepe);
		
		Usuario usuarioPedro= new Usuario(salonDeChat);
		usuarioPedro.setNombre("Pedro");
		
		salonDeChat.registrar(usuarioPedro);
		
		usuarioJuan.enviar("Pepe", "Hola Como Andas");
		usuarioPepe.enviar("Juan", "Todo ok. Y tu?");
		usuarioPedro.enviar("Martin", "MartinEstas");
		

	}

}
