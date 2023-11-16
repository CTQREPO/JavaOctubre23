package com.ms.productos.emtity;

import java.io.Serializable;
import java.util.Date;

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

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cid_auto")
	@SequenceGenerator(name = "cid_auto", sequenceName = "PRODUCTOS_SEQ", allocationSize = 1)
	int productoId;

	@Column(name = "DEPTO_ID", columnDefinition = "NUMBER")
	int departamenoId;

	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR2(20)")
	String nombreProducto;

	@Column(name = "FECHA_CAD", columnDefinition = "DATE")
	Date fechaCaducidad;

	@Column(name = "PRECIO_COMPRA", columnDefinition = "NUMBER(5,2)")
	double precioCompra;

	@Column(name = "PRECIO_VENTA", columnDefinition = "NUMBER(5,2)")
	double precioVenta;

	@Column(name = "REFRIGERADO", columnDefinition = "CHAR(1)")
	char refrigerado;

	public int getProductoId() {
		return productoId;
	}

	public void setProductoId(int productoId) {
		this.productoId = productoId;
	}

	public int getDepartamenoId() {
		return departamenoId;
	}

	public void setDepartamenoId(int departamenoId) {
		this.departamenoId = departamenoId;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
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
