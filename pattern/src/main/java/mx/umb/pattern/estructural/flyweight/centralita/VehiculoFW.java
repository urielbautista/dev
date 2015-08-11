package mx.umb.pattern.estructural.flyweight.centralita;

import java.util.Date;

public class VehiculoFW {
	// Los datos implícitos estarán encapsulados dentro de la clase ModeloVehiculo
    private ModeloVehiculo datosImplicitos;
 
    // Datos explícitos
    private String matricula;
    private Date fechaMatriculacion;
    private String nifTitular;
 
    // Propiedades de acceso a los elementos implícitos.
    // Recordemos que estos datos no deberían variar con el tiempo (son comunes a todas las
    // instancias) y, si lo hicieran, afectarían a todas las instancias.
    private String marca;
	private String modelo;
    private String color;
 
    // Constructor del vehículo
    // Hace uso de la factoría para obtener (o generar, en caso de que no exista) la parte implícita de
    // los datos del vehículo (marca, modelo y color)
    public VehiculoFW(String marca, String modelo, String color,    		// Datos implícitos
        String matricula, Date fechaMatriculacion, String nifTitular){       // Datos explícitos

        // Instanciamos o referenciamos los datos implícitos a través de la factoría
        this.datosImplicitos = VehiculoFactory.getCar(marca, modelo, color);
        // Asignamos los datos propios, exclusivos de este objeto
        this.matricula = matricula;
        this.fechaMatriculacion = fechaMatriculacion;
        this.nifTitular = nifTitular;
    }
 
    // Método que accede tanto a datos implícitos como a datos explícitos
    public void mostrarInformacionVehiculo()  {
        datosImplicitos.mostrarCaracteristicas(" con matricula " + matricula + 
            " (" + fechaMatriculacion.toString() + ") registrado por " + nifTitular);
    }
    
    public String getMarca() {
		return datosImplicitos.getMarca();
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return datosImplicitos.getModelo();
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return datosImplicitos.getColor();
	}

	public void setColor(String color) {
		this.color = color;
	}
}