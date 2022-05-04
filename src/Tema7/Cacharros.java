package Tema7;

public class Cacharros {
	
	protected String nombre;
	protected char consumo;
	protected float precio;

	public Cacharros() {
		nombre="";
		consumo=' ';
		precio=0.0f;
	}
	
	public Cacharros(String nombre, char consumo, float precio) {
		this.nombre=nombre;
		this.consumo=consumo;
		this.precio=precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getConsumo() {
		return consumo;
	}

	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public String toString() {
		return "Nombre: " + getNombre() + "\t Tipo de consumo: " + getConsumo() + "\n Precio: "	+ getPrecio();
		}
	
	
}