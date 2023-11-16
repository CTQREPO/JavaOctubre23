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

@Entity
@Table(name = "VENTAS")
public class Venta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Venta() {
	}

	public Venta(int ventaId) {
		this.ventaId = ventaId;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vid_auto")
	@SequenceGenerator(name = "vid_auto", sequenceName = "VENTAS_SEQ", allocationSize = 1)
	@Column(name = "VENTA_ID", columnDefinition = "NUMBER")
	private int ventaId;

	@ManyToOne
	@JoinColumn(name = "EMPLEADO_ID", columnDefinition = "NUMBER")
	private Empleado empleado;

	@ManyToOne
	@JoinColumn(name = "CLIENTE_ID", columnDefinition = "NUMBER")
	private Customer customer;

	@Column(name = "FECHA_VENTA", columnDefinition = "DATE")
	private Date fechaVenta;

	@Column(name = "SUBTOTAL", columnDefinition = "NUMBER(5,2)")
	private double subtotal;

	@Column(name = "TOTAL", columnDefinition = "NUMBER(5,2)")
	private double total;

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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
