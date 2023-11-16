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
@Table(name = "Ventas")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "ventaId", scope= Ventas.class)
public class Ventas implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_venta")
	@SequenceGenerator(name="cid_venta", sequenceName="VENTAS_SEQ", allocationSize=1)
	@Column(name="VENTA_ID",columnDefinition="NUMBER")
	int ventaId;
	
	@ManyToOne//de muchas ventas a un empleado
	@JoinColumn(name="EMPLEADO_ID",columnDefinition="NUMBER")
	Empleados empleado;
	
	@ManyToOne//de muchas ventas a un cliente
	@JoinColumn(name="CLIENTE_ID",columnDefinition="NUMBER")
	Customers cliente;
	
	@Column(name="FECHA_VENTA",columnDefinition="DATE")
	Date fechaVenta;
	@Column(name="SUBTOTAL",columnDefinition="NUMBER")
	double subtotal;
	@Column(name="TOTAL",columnDefinition="NUMBER")
	double total;
	
	
	//getters && setters
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
