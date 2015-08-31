package mx.umb.pattern.gof.creacional.prototype.centralita;

public class Vehiculo  implements Cloneable {
	public String marca;
	public String modelo;
    public String color;
    public Rueda tipoRueda;
    public Carroceria tipoCarroceria;
 
    public String vehiculoInfo()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Marca: ").append(marca).append(System.getProperty("line.separator"));
        sb.append("Modelo: ").append(modelo).append(System.getProperty("line.separator"));
        sb.append("Color: ").append(color).append(System.getProperty("line.separator"));
        sb.append("Ruedas: ").append(tipoRueda.getLlanta()).append(" ");
        sb.append(tipoRueda.getDiametro()).append(" ").append(tipoRueda.getNeumatico()).append(System.getProperty("line.separator"));
        sb.append("Carroceria: ").append(tipoCarroceria.isHabitaculoReforzado()).append(" ");
        sb.append(tipoCarroceria.getTipoCarroceria()).append(" ").append(tipoCarroceria.getMaterial()).append(System.getProperty("line.separator"));
        return sb.toString();
    }
 
    @Override
    public Object clone() throws CloneNotSupportedException{
    	return super.clone();
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

	public Rueda getTipoRueda() {
		return tipoRueda;
	}

	public void setTipoRueda(Rueda tipoRueda) {
		this.tipoRueda = tipoRueda;
	}

	public Carroceria getTipoCarroceria() {
		return tipoCarroceria;
	}

	public void setTipoCarroceria(Carroceria tipoCarroceria) {
		this.tipoCarroceria = tipoCarroceria;
	}

    
}
