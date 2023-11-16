package com.ms.persistence.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "VENTAS")
public class Ventas implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "VENTA_ID", columnDefinition = "NUMBER")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cid_ventas")
	@SequenceGenerator(name = "cid_ventas", sequenceName = "VENTAS_SEQ", allocationSize = 1)
	private int ventaId;

	@Column(name = "EMPLEADO_ID", columnDefinition = "NUMBER")
	private int empleadoId;

	@ManyToOne()
	@JoinColumn(name = "CLIENTE_ID", columnDefinition = "NUMBER")
	Customers cliente;

	@Column(name = "FECHA_VENTA", columnDefinition = "DATE")
	private Date fechaVenta;

	@Column(name = "SUBTOTAL", columnDefinition = "NUMBER(5,2)")
	private double subtotalVenta;

	@Column(name = "TOTAL", columnDefinition = "NUMBER(5,2)")
	private double totalVenta;

	public int getVentaId() {
		return ventaId;
	}

	public void setVentaId(int ventaId) {
		this.ventaId = ventaId;
	}

	public int getEmpleadoId() {
		return empleadoId;
	}

	public void setEmpleadoId(int empleadoId) {
		this.empleadoId = empleadoId;
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

	public double getSubtotalVenta() {
		return subtotalVenta;
	}

	public void setSubtotalVenta(double subtotalVenta) {
		this.subtotalVenta = subtotalVenta;
	}

	public double getTotalVenta() {
		return totalVenta;
	}

	public void setTotalVenta(double totalVenta) {
		this.totalVenta = totalVenta;
	}
}
