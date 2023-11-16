package com.persistence.request;

import java.sql.Date;

public class RequestEmpleados {

	int empleadoId;
	String nombre_empleado;
	Date fechaIngr;
	double salario;
	
	public RequestEmpleados(int empleadoId, String nombre_empleado, Date fechaIngr, double salario) {
		super();
		this.empleadoId = empleadoId;
		this.nombre_empleado = nombre_empleado;
		this.fechaIngr = fechaIngr;
		this.salario = salario;
	}

	public int getEmpleadoId() {
		return empleadoId;
	}

	public void setEmpleadoId(int empleadoId) {
		this.empleadoId = empleadoId;
	}

	public String getNombre_empleado() {
		return nombre_empleado;
	}

	public void setNombre_empleado(String nombre_empleado) {
		this.nombre_empleado = nombre_empleado;
	}

	public Date getFechaIngr() {
		return fechaIngr;
	}

	public void setFechaIngr(Date fechaIngr) {
		this.fechaIngr = fechaIngr;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
