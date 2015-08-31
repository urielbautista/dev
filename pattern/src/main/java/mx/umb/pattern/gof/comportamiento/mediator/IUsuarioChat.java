package mx.umb.pattern.gof.comportamiento.mediator;

public interface IUsuarioChat {
	void recibir (String de , String msg);
	void enviar (String a, String msg);
}
