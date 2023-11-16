package com.persistence.request;

import java.sql.Date;

import com.persistence.entity.PersistenceCustomers;
import com.persistence.entity.PersistenceEmpleados;

public class RequestVentas {

	int ventaId;
	PersistenceEmpleados empleado;
	PersistenceCustomers customer;
	Date fechaventa;
	double subtotal;
	double total;
	public RequestVentas(int ventaId, PersistenceEmpleados empleado, PersistenceCustomers customer, Date fechaventa,
			double subtotal, double total) {
		super();
		this.ventaId = ventaId;
		this.empleado = empleado;
		this.customer = customer;
		this.fechaventa = fechaventa;
		this.subtotal = subtotal;
		this.total = total;
	}
	public int getVentaId() {
		return ventaId;
	}
	public void setVentaId(int ventaId) {
		this.ventaId = ventaId;
	}
	public PersistenceEmpleados getEmpleado() {
		return empleado;
	}
	public void setEmpleado(PersistenceEmpleados empleado) {
		this.empleado = empleado;
	}
	public PersistenceCustomers getCustomer() {
		return customer;
	}
	public void setCustomer(PersistenceCustomers customer) {
		this.customer = customer;
	}
	public Date getFechaventa() {
		return fechaventa;
	}
	public void setFechaventa(Date fechaventa) {
		this.fechaventa = fechaventa;
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
