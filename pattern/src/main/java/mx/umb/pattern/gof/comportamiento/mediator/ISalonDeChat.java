package mx.umb.pattern.gof.comportamiento.mediator;

public interface ISalonDeChat {
	abstract void registrar (Usuario usuario);
	abstract void enviar(String de , String a, String msg);
}
