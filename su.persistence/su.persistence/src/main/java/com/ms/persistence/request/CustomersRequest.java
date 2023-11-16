package com.ms.persistence.request;

import java.util.Date;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class CustomersRequest {

	int clienteId;
	@NotBlank(message = "El Nombre no puede quedar vacio")
	@Size(max = 20)
	String nombreCliente;
	@FutureOrPresent
	Date fechaNacimiento;
	String domicilio;

	public CustomersRequest(int clienteId, String nombreCliente, Date fechaNacimiento, String domicilio) {
		super();
		this.clienteId = clienteId;
		this.nombreCliente = nombreCliente;
		this.fechaNacimiento = fechaNacimiento;
		this.domicilio = domicilio;
	}

	public int getClienteId() {
		return clienteId;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	@Override
	public String toString() {
		return "CustomersRequest [clienteId=" + clienteId + ", nombreCliente=" + nombreCliente + ", fechaNacimiento="
				+ fechaNacimiento + ", domicilio=" + domicilio + "]";
	}
}
