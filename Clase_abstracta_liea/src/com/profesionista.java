package com;

public abstract class profesionista {
	
	String carrera;
	String cedula;
	
	public profesionista() {
		
	}

	public profesionista(String carrera, String cedula) {
//		super();
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
	
	///METODO ABSTRACTO
		
		public abstract void trabajar();
}
