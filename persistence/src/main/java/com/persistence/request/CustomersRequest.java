package com.persistence.request;

import java.sql.Date;

public class CustomersRequest {

	int ClienteId;
	String nombre;
	Date fechaNac;
	String domicilio;
	
	//constructor
	public CustomersRequest(int clienteId, String nombre, Date fechaNac, String domicilio) {
		super();
		ClienteId = clienteId;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.domicilio = domicilio;
	}

	//getters && setters
	public int getClienteId() {
		return ClienteId;
	}

	public void setClienteId(int clienteId) {
		ClienteId = clienteId;
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

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	
	
}
