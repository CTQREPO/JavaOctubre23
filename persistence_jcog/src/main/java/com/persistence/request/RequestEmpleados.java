package com.persistence.request;

import java.sql.Date;

public class RequestEmpleados {

	int empleadoId;
	String nombre;
	Date fechaingreso;
	double salario;
	
	public RequestEmpleados(int empleadoId, String nombre, Date fechaingreso, double salario) {
		this.empleadoId = empleadoId;
		this.nombre = nombre;
		this.fechaingreso = fechaingreso;
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

	public Date getFechaingreso() {
		return fechaingreso;
	}

	public void setFechaingreso(Date fechaingreso) {
		this.fechaingreso = fechaingreso;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
