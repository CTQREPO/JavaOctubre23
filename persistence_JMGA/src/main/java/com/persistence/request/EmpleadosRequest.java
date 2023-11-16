package com.persistence.request;

import java.sql.Date;

public class EmpleadosRequest {

	int empleadoId;
	String nombre;
	Date fechaIngreso;
	double salario;
	public EmpleadosRequest(int empleadoId, String nombre, Date fechaIngreso, double salario) {
	
		this.empleadoId = empleadoId;
		this.nombre = nombre;
		this.fechaIngreso = fechaIngreso;
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
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	
}
