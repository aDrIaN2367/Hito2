package cuestión1;

public class Trabajador {
	//Declaración de tipos de variable
	private String nombre;
	private String ciudad;
	private Float salarioBruto;
	private Boolean contratoTemporal;
	
	//constructor
	public Trabajador(String nombre, String ciudad, Float salarioBruto, Boolean contratoTemporal) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.salarioBruto = salarioBruto;
		this.contratoTemporal = contratoTemporal;
	}
	
	//getters/setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public Float getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(Float salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public Boolean getContratoTemporal() {
		return contratoTemporal;
	}
	public void setContratoTemporal(Boolean contratoTemporal) {
		this.contratoTemporal = contratoTemporal;
	}

	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", ciudad=" + ciudad + ", salarioBruto=" + salarioBruto
				+ ", contratoTemporal=" + contratoTemporal + "]";
	}
	
	
}
