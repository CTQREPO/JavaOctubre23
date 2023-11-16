package com;

public abstract class Profesionista {

	String carrera;
	String cedula;
	
	public Profesionista() {// tiene por lo menos un metodo abstracto 
		
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
	public abstract void trabajar(); //para que el metodo sea abstracto se finaliza con ;
	
	
}
	
//sirve para poder modeleras un concepto, esos metodos que quedan abstractos pueda crear especializaciones de esta clase, que lo haga a su manera
//base muy generica, terminar de completar el modelo 
