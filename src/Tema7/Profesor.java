package Tema7;

import java.util.Arrays;

public class Profesor extends Persona{

	protected String[] asig;
	protected float salario;
	
	public Profesor() {
		super();
		asig = null;
		salario = 0.0f;
	}
	
	public Profesor(String nombre, String apellidos, String dni, int edad, String[] asig, float salario) {
		super(nombre, apellidos, dni, edad);
	
		this.asig=asig;
		this.salario=salario;
	}

	public String[] getAsig() {
		return asig;
	}

	public void setAsig(String[] asig) {
		this.asig = asig;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}


	
	
}
