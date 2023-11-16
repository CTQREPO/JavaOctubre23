package com.persistence.request;

import java.sql.Date;

public class RequestCustomers {

	int clienteId;
	String nombre_cliente;
	Date fecha_nac;
	String domicilio;
	
	public RequestCustomers(int clienteId, String nombre_cliente, Date fecha_nac, String domicilio) {
		super();
		this.clienteId = clienteId;
		this.nombre_cliente = nombre_cliente;
		this.fecha_nac = fecha_nac;
		this.domicilio = domicilio;
	}

	public int getClienteId() {
		return clienteId;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}

	public String getNombre_cliente() {
		return nombre_cliente;
	}

	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}

	public Date getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(Date fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	
}