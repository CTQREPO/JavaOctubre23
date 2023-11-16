package com.persistence.request;

import java.sql.Date;


public class EmpleadoRequest {

	
	
	int empleadoId;
	String nombre;
	Date fechaNac;
	double salario;
	public EmpleadoRequest(int empleadoId, String nombre, Date fechaNac, double salario) {
		super();
		this.empleadoId = empleadoId;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.salario = salario;
	}
	public int getEmpleadoId() {
		return empleadoId;
	}
	public void setEmpleadoId(int empleadoId) {
		this.empleadoId = empleadoId;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "EmpleadoRequest [empleadoId=" + empleadoId + ", nombre=" + nombre + ", fechaNac=" + fechaNac
				+ ", salario=" + salario + "]";
	}
	
}
