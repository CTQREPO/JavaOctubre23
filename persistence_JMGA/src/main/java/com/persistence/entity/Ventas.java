package com.persistence.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "VENTAS")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "ventaId")
public class Ventas implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vid_auto")
	@SequenceGenerator(name = "vid_auto", sequenceName = "VENTAS_SEQ", allocationSize = 1)
	@Column(name = "VENTA_ID", columnDefinition = "NUMBER")
	int ventaId;

	@ManyToOne
	@JoinColumn(name = "EMPLEADO_ID", columnDefinition = "NUMBER")
	Empleados empleado;

	@ManyToOne
	@JoinColumn(name = "CLIENTE_ID", columnDefinition = "NUMBER")
	Customers cliente;

	@Column(name = "FECHA_VENTA", columnDefinition = "DATE")
	Date fechaVenta;

	@Column(name = "SUBTOTAL", columnDefinition = "NUMBER(5,2)")
	double subTotal;

	@Column(name = "TOTAL", columnDefinition = "NUMBER(5,2)")
	double total;

	// Atributo relacional
	// @ManyToOne(mappedBy = "cliente","")
	// List<Ventas> ventas;

	public Ventas() {

	}

	public Ventas(int ventaId) {

		this.ventaId = ventaId;
	}

	public int getVentaId() {
		return ventaId;
	}

	public void setVentaId(int venta_Id) {
		this.ventaId = venta_Id;
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

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

}
