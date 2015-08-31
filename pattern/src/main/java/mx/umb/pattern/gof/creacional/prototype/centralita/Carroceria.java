package mx.umb.pattern.gof.creacional.prototype.centralita;

public class Carroceria {
	private boolean habitaculoReforzado;
    private String material;
    private String tipoCarroceria;
    
	public boolean isHabitaculoReforzado() {
		return habitaculoReforzado;
	}
	public void setHabitaculoReforzado(boolean habitaculoReforzado) {
		this.habitaculoReforzado = habitaculoReforzado;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getTipoCarroceria() {
		return tipoCarroceria;
	}
	public void setTipoCarroceria(String tipoCarroceria) {
		this.tipoCarroceria = tipoCarroceria;
	}

}
