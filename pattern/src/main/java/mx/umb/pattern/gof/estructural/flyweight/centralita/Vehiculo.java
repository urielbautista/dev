package mx.umb.pattern.gof.estructural.flyweight.centralita;

import java.util.Date;

public class Vehiculo {
	private String marca;
    private String modelo;
    private String color;
    private String matricula;
    private Date fechaMatriculacion;
    private String nifTitular;
 
    public Vehiculo(String marca, String modelo, String color, String matricula,
        Date fechaMatriculacion, String nifTitular){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
        this.fechaMatriculacion = fechaMatriculacion;
        this.nifTitular = nifTitular;
    }
 
    public void mostrarCaracteristicas(){
       System.out.println(marca + " " + modelo + " de color " + color + " con matricula "+
    		   matricula + " (" + fechaMatriculacion + ") registrado por " + nifTitular);
    }
    
}
