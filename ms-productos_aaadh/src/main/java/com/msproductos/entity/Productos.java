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

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pid_auto")
	@SequenceGenerator(name = "pid_auto", sequenceName = "PRODUCTOS_SEQ", allocationSize = 1)
	@Column(name = "PRODUCTO_ID", columnDefinition = "NUMBER")
	int productoId;
	@Column(name = "DEPTO_ID", columnDefinition = "NUMBER")
	int deptoId;
	@Column(name = "NOMBRE", columnDefinition = "NVARVHAR2(20)")
	String nombre;
	@Column(name = "FECHA_CAD", columnDefinition = "DATE")
	Date fechacad;
	@Column(name = "PRECIO_COMPRA", columnDefinition = "NUMBER(5,2)")
	double precioCompra;
	@Column(name = "PRECIO_VENTA", columnDefinition = "NUMBER(5,2)")
	double precioVenta;
	@Column(name = "REFRIGERADO", columnDefinition = "CHAR(1)")
	char refrigerado;
	@Column(name = "STATUS", columnDefinition = "CHAR(1)")
	String status;
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getProductoId() {
		return productoId;
	}

	public void setProductoId(int productoId) {
		this.productoId = productoId;
	}

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

	public Date getFechacad() {
		return fechacad;
	}

	public void setFechacad(Date fechacad) {
		this.fechacad = fechacad;
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
}