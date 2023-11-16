package com.persistence.request;

import java.sql.Date;

public class CostumerRequest {
	
	int clienteId;
	String nombre;
	Date fecha_nacimiento;
	String domicilio;
	public CostumerRequest(int clienteId, String nombre, Date fecha_nacimiento, String domicilio) {
		super();
		this.clienteId = clienteId;
		this.nombre = nombre;
		this.fecha_nacimiento = fecha_nacimiento;
		this.domicilio = domicilio;
	}
	public int getClienteId() {
		return clienteId;
	}
	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
}
