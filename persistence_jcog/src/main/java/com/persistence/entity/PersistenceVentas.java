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
@Table(name="VENTAS")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
property = "ventaId", scope=PersistenceVentas.class)
public class PersistenceVentas implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public PersistenceVentas() {
	}
	
	public PersistenceVentas(int ventaId) {
		this.ventaId = ventaId;
	} 

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="vid_auto")
	@SequenceGenerator(name="vid_auto", sequenceName="VENTAS_SEQ", allocationSize=1)
	@Column(name="VENTA_ID", columnDefinition = "NUMBER")
	private int ventaId;
	
	@ManyToOne
	@JoinColumn(name="EMPLEADO_ID", columnDefinition = "NUMBER")
	private PersistenceEmpleados empleado;
	
	@ManyToOne
	@JoinColumn(name="CLIENTE_ID", columnDefinition = "NUMBER")
	private PersistenceCustomers customer;
	 
	@Column(name="FECHA_VENTA", columnDefinition = "DATE")
	private Date fechaventa;
	@Column(name="SUBTOTAL", columnDefinition = "NUMBER(5,2)")
	private double subtotal;
	@Column(name="TOTAL", columnDefinition = "NUMBER(5,2)")
	private double total;
	
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
	