package com;

public abstract class Profesionista { //una clase abstracta es aquella que contiene n o mas clases abstractas, entonces toda la clase se convierte en abstracta

	String carrera;
	String cedula;
	
	public Profesionista() {
		
	}

	public Profesionista(String carrera, String cedula) {
		super();
		this.carrera = carrera;
		this.cedula = cedula;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	@Override
	public String toString() {
		return "Profesionista [carrera=" + carrera + ", cedula=" + cedula + "]";
	}
	
	
	//METODO ABSTRACTO
	//sirve para modelar y crear diferentes especializaciones con un comportamiento distinto	
	
	
	public abstract void trabajar(); //metodo abstracto sin implementacion ni cuerpo que trabaja con ";" modifica toda la clase por tener una o mas clases abstractas
	
	
	
	
}
