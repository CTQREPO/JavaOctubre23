package com.msproductos.entity;

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
@Table(name = "PRODUCTOS")
public class Productos implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Productos() {
	}
	

	public Productos(int productoId) {
		
		this.productoId = productoId;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pid_auto")
	@SequenceGenerator(name="pid_auto",sequenceName="PRODUCTOS_SEQ", allocationSize = 1)
	@Column(name= "PRODUCTO_ID",columnDefinition = "NUMBER")
	int productoId;
	
	@Column(name= "DEPTO_ID",columnDefinition = "NUMBER")
	int deptoId;
	
	@Column(name= "NOMBRE",columnDefinition = "NVARCHAR2(20)")
	String nombre;
	
	@Column(name= "FECHA_CAD",columnDefinition = "DATE")
	Date fechaCad;
	
	@Column(name= "PRECIO_COMPRA",columnDefinition = "NUMBER(5,2)")
	double precioCompra;
	
	@Column(name= "PRECIO_VENTA",columnDefinition = "NUMBER(5,2)")
	double precioVenta;
	
	@Column(name= "REFRIGERADO",columnDefinition = "CHAR(1)")
	char refrigerado;
	
	@Column(name= "STATUS",columnDefinition = "NVARCHAR2(1)")
	String status;

	public int getDeptoId() {
		return deptoId;
	}

	public void setDeptoId(int deptoId) {
		this.deptoId = deptoId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaCad() {
		return fechaCad;
	}

	public void setFechaCad(Date fechaCad) {
		this.fechaCad = fechaCad;
	}



	public double getPrecioCompra() {
		return precioCompra;
	}


	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}


	public double getPrecioVenta() {
		return precioVenta;
	}


	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}


	public char getRefrigerado() {
		return refrigerado;
	}

	public void setRefrigerado(char refrigerado) {
		this.refrigerado = refrigerado;
	}

	public int getProductoId() {
		return productoId;
	}

	public void setProductoId(int productoId) {
		this.productoId = productoId;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	
}