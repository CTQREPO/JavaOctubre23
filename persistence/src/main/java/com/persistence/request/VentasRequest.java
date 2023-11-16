package com.persistence.request;

import java.util.Date;

import com.persistence.entity.Customers;
import com.persistence.entity.Empleados;

public class VentasRequest {
	int ventaId;
	Empleados empleados;
	Customers cliente;
	Date fechaVenta;
	double subtotal;
	double total;
	public VentasRequest(int ventaId, Empleados empleados, Customers cliente, Date fechaVenta, double subtotal,
			double total) {
		super();
		this.ventaId = ventaId;
		this.empleados = empleados;
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
	public Empleados getEmpleados() {
		return empleados;
	}
	public void setEmpleados(Empleados empleados) {
		this.empleados = empleados;
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
	public void setTotal(int total) {
		this.total = total;
	}
	
	
}