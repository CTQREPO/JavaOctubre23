package com.persistence.request;

import java.sql.Date;

import com.persistence.entity.Customers;
import com.persistence.entity.Empleados;

public class VentasRequest {

	int ventaId;
	Empleados empleado;
	Customers cliente;
	Date fechaVenta;
	double subtotal;
	double total;
	
	//contructor
	

	public VentasRequest(int ventaId, Empleados empleado, Customers cliente, Date fechaVenta, double subtotal,
			double total) {
		super();
		this.ventaId = ventaId;
		this.empleado = empleado;
		this.cliente = cliente;
		this.fechaVenta = fechaVenta;
		this.subtotal = subtotal;
		this.total = total;
}

	public int getVentaId() {
		return ventaId;
	}

	public void setVentaId(int ventaId) {
		this.ventaId = ventaId;
	}

	public Empleados getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleados empleado) {
		this.empleado = empleado;
	}

	public Customers getCliente() {
		return cliente;
	}

	public void setCliente(Customers cliente) {
		this.cliente = cliente;
	}

	public Date getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
}