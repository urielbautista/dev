package mx.umb.pattern.comportamiento.mediator;

import java.util.HashMap;
import java.util.Map;

public class SalonDeChat implements ISalonDeChat {
	private Map <String, Usuario> participantes= new HashMap<String, Usuario>();
	
	@Override
	public void registrar(Usuario usuario) {
		participantes.put(usuario.getNombre(), usuario);

	}

	@Override
	public void enviar(String de, String a, String msg) {
		if (participantes.containsKey(de) && participantes.containsKey(a)){
			Usuario usuario= participantes.get(a);
			usuario.recibir(de, msg);
		}else{
			System.out.println("Usuario Inexistente");
		}
			

	}

}
