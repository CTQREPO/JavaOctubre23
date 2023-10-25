package com;

public abstract class Profeionista {

	String carrera, cedula;
	
	public Profeionista() {
		
	}

	public Profeionista(String carrera, String cedula) {
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
		return "Profeionista [carrera=" + carrera + ", cedula=" + cedula + "]";
	}
	
	// Metodo abstracto
	
	public abstract void trabajar();
	
}
