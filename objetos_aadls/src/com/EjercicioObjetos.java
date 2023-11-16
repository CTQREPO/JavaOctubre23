package com;

public class EjercicioObjetos {

	String nombre, apellido, ciudad;
	int edad;
	Double estatura;
	
	public EjercicioObjetos(String nombre, String apellido, String ciudad, int edad, Double estatura) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.ciudad = ciudad;
		this.edad = edad;
		this.estatura = estatura;
	}

	public EjercicioObjetos(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public EjercicioObjetos() {
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Double getEstatura() {
		return estatura;
	}

	public void setEstatura(Double estatura) {
		this.estatura = estatura;
	}

	@Override
	public String toString() {
		return "Ejercicio_objetos [nombre=" + nombre + ", apellido=" + apellido + ", ciudad=" + ciudad + ", edad="
				+ edad + ", estatura=" + estatura + "]";
	}
	
	
	
}
