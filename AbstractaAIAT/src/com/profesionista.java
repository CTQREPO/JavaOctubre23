package com;

public abstract class profesionista {
	String carrera;
	String cedula; 
	
	public profesionista () {
		
	}

	public profesionista(String carrera, String cedula) {
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
		return "profesionista [carrera=" + carrera + ", cedula=" + cedula + "]";
	}
	
	//Metodo abstracto: Es un metodo sin finalizacion y termina con punto y coma. para que el metodo sea abstracto es necesario esto.
	//Una clase abstracta es aquella que contiene al menos un metodo abstracto. Sirve para crear un modelo  
public abstract void trabajar();


}
