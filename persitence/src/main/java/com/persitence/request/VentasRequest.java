package com.persitence.request;

import java.sql.Date;

import com.persitence.entity.Customers;
import com.persitence.entity.Empleados;

public class VentasRequest {

	private int ventaId;
	private Empleados empleado;
	private Customers cliente;
	private Date fechaventa;
	private double subtotal;
	private double total;
	public VentasRequest(int ventaId, Empleados empleado, Customers cliente, Date fechaventa, double subtotal,
			double total) {
		super();
		this.ventaId = ventaId;
		this.empleado = empleado;
		this.cliente = cliente;
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
