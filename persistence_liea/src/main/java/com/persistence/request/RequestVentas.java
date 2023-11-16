package com.persistence.request;

import java.sql.Date;

import com.persistence.entity.Customers;
import com.persistence.entity.Empleados;

public class RequestVentas {

	int ventaId;
	Empleados empleado;//// EPLEADOS
	Customers cliente;
	Date fecha_venta;
	double subtotal;
	double total;

	public RequestVentas(int ventaId, Empleados empleadoId, Customers clienteId, Date fecha_venta, double subtotal,
			double total) {
		super();
		this.ventaId = ventaId;
		this.empleado = empleadoId;
		this.cliente = clienteId;
		this.fecha_venta = fecha_venta;
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

	public Date getFecha_venta() {
		return fecha_venta;
	}

	public void setFecha_venta(Date fecha_venta) {
		this.fecha_venta = fecha_venta;
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
