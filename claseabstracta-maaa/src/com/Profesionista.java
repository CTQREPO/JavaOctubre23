package com;

public abstract class Profesionista {

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
	
	//Metodo abstracto
	public abstract void trabajar();
	
	
}
