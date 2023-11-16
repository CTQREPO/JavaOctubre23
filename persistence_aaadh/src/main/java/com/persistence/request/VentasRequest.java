package com.persistence.request;

import java.sql.Date;

import com.persistence.entity.Costumers;
import com.persistence.entity.Empleados;

public class VentasRequest {
	
	int venta_Id;
	Empleados empleado;
	Costumers cliente;
	Date fecha_venta;
	double subtotal;
	double total;
	public VentasRequest(int venta_Id, Empleados empleado, Costumers cliente, Date fecha_venta, double subtotal,
			double total) {
		super();
		this.venta_Id = venta_Id;
		this.empleado = empleado;
		this.cliente = cliente;
		this.fecha_venta = fecha_venta;
		this.subtotal = subtotal;
		this.total = total;
	}
	public int getVenta_Id() {
		return venta_Id;
	}
	public void setVenta_Id(int venta_Id) {
		this.venta_Id = venta_Id;
	}
	public Empleados getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleados empleado) {
		this.empleado = empleado;
	}
	public Costumers getCliente() {
		return cliente;
	}
	public void setCliente(Costumers cliente) {
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