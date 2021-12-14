package cuestión2;

public class Padre {
	//declaracion de variables y tipos
	private String mensaje;
	private int numero;
	
	//constructor
	public Padre(String mensaje, int numero) {
		super();
		this.mensaje = mensaje;
		this.numero = numero;
	}
	
	public void saludar() {
		System.out.println("Hola soy el padre.");
	}	
	
}
