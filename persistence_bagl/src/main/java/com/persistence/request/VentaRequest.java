package com.persistence.request;

import java.sql.Date;

import com.persistence.entity.Customer;
import com.persistence.entity.Empleado;

public class VentaRequest {

	private int ventaId;
	private Empleado empleado;
	private Customer customer;
	private Date fechaVenta;
	private double subtotal;
	private double total;

	public VentaRequest() {

	}

	public VentaRequest(int ventaId, Empleado empleado, Customer customer, Date fechaVenta, double subtotal,
			double total) {
		this.ventaId = ventaId;
		this.empleado = empleado;
		this.customer = customer;
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

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
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
