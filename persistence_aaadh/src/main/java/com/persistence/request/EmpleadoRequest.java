package com.persistence.request;

import java.sql.Date;

public class EmpleadoRequest {
	
	int empleadoId;
	String nombre;
	Date fecha_ingreso;
	double salario;
	
	public EmpleadoRequest(int empleadoId, String nombre, Date fecha_ingreso, double salario) {
		super();
		this.empleadoId = empleadoId;
		this.nombre = nombre;
		this.fecha_ingreso = fecha_ingreso;
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

	public Date getFecha_ingreso() {
		return fecha_ingreso;
	}

	public void setFecha_ingreso(Date fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}	

}
