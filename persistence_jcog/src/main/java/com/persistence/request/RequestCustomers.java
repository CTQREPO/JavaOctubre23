package com.persistence.request;

import java.sql.Date;

public class RequestCustomers {

	int clienteId;
	String nombre;
	Date fechanac;	
	String domicilio;
	
	public RequestCustomers(int clienteId, String nombre, Date fechanac, String domicilio) {
		this.clienteId = clienteId;
		this.nombre = nombre;
		this.fechanac = fechanac;
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

	public Date getFechanac() {
		return fechanac;
	}

	public void setFechanac(Date fechanac) {
		this.fechanac = fechanac;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

}
