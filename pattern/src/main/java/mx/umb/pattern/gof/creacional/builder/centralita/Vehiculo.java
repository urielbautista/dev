package mx.umb.pattern.gof.creacional.builder.centralita;

public class Vehiculo {
	private boolean cierreCentralizado;
    private String color;
    private boolean direccionAsistida;
    private String marca;
    private String modelo;
    private IMotor motor;
	private Carroceria tipoCarroceria;
    private Rueda tipoRuedas;
 
    public String getPrestaciones(){
        StringBuilder sb = new StringBuilder();
        String nl = System.getProperty("line.separator");
 
        sb.append("El presente vehiculo es un ").append(marca).append(" ").append(modelo);
        sb.append(" estilo ").append(tipoCarroceria.getTipoCarroceria()).append(nl);
        sb.append("Color: ").append(color).append(nl);
        sb.append(direccionAsistida ? "Con " : "Sin ").append("direccion asistida").append(nl);
        sb.append(cierreCentralizado ? "Con " : "Sin ").append("cierre centralizado").append(nl);
        sb.append("Carroceria de ").append(tipoCarroceria.getMaterial());
        sb.append(tipoCarroceria.isHabitaculoReforzado() ? " con " : " sin ").append("el habitaculo reforzado").append(nl);
        sb.append("Ruedas con llantas ").append(tipoRuedas.getLlanta()).append(" de ").append(tipoRuedas.getDiametro()).append(" cm").append(nl);
        sb.append("Neumaticos ").append(tipoRuedas.getNeumatico());
        sb.append("Respuesta del motor: ").append(motor.inyectarCombustible(100));
        return sb.toString();
    }
    
    public boolean isCierreCentralizado() {
		return cierreCentralizado;
	}

	public void setCierreCentralizado(boolean cierreCentralizado) {
		this.cierreCentralizado = cierreCentralizado;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isDireccionAsistida() {
		return direccionAsistida;
	}

	public void setDireccionAsistida(boolean direccionAsistida) {
		this.direccionAsistida = direccionAsistida;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public IMotor getMotor() {
		return motor;
	}

	public void setMotor(IMotor motor) {
		this.motor = motor;
	}

	public Carroceria getTipoCarroceria() {
		return tipoCarroceria;
	}

	public void setTipoCarroceria(Carroceria tipoCarroceria) {
		this.tipoCarroceria = tipoCarroceria;
	}

	public Rueda getTipoRuedas() {
		return tipoRuedas;
	}

	public void setTipoRuedas(Rueda tipoRuedas) {
		this.tipoRuedas = tipoRuedas;
	}
    
}