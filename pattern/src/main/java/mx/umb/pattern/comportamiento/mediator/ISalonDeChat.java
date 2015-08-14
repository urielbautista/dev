package mx.umb.pattern.comportamiento.mediator;

public interface ISalonDeChat {
	abstract void registrar (Usuario usuario);
	abstract void enviar(String de , String a, String msg);
}
