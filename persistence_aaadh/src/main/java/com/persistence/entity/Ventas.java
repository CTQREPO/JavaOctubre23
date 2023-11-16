package com.persistence.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table (name = "VENTAS")
public class Ventas implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pid_auto")
	@SequenceGenerator(name = "pid_auto", sequenceName = "VENTAS_SEQ", allocationSize = 1)
	@Column(name = "VENTA_ID", columnDefinition = "NUMBER")
	int venta_Id;
//	@ManyToOne
	@Column(name = "EMPLEADO", columnDefinition = "NUMBER")
	Empleados empleado;
//	@ManyToOne
	@Column(name = "CLIENTE", columnDefinition = "NUMBER")
	Costumers cliente;
	@Column(name = "FECHAVENTA", columnDefinition = "DATE")
	Date fechaventa;
	@Column(name = "SUBTOTAL", columnDefinition = "NUMBER")
	double subtotal;
	@Column(name = "TOTAL", columnDefinition = "NUMBER")
	double total;
	
	
	public Ventas () {
	}

	public int getVenta_Id() {
		return venta_Id;
	}

	public void setVenta_Id(int venta_Id) {
		this.venta_Id = venta_Id;
	}

	public Costumers getCliente() {
		return cliente;
	}

	public void setCliente(Costumers cliente) {
		this.cliente = cliente;
	}

	public Empleados getEmpleado() {
		return empleado;
	}


	public void setEmpleado(Empleados empleado) {
		this.empleado = empleado;
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
	
	