package mx.umb.pattern.estructural.flyweight.centralita;

public abstract class ModeloVehiculo {
	private String marca;
	private String modelo;
	private String color;
	 
	protected ModeloVehiculo(String marca, String modelo, String color) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}
	 
	public void mostrarCaracteristicas(String datosExtra){
	 	System.out.println(marca + " " + modelo + " de color " + color + " " + "\n" + datosExtra + "\n");
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}