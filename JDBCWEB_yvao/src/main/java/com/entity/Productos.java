package com.entity;

import java.sql.Date;

//Plain Old Java Object
public class Productos {

	private int productoId;
	private int deptoId;
	private String nombre;
	private Date fechaCad;
	private double precioCompra;
	private double precioVenta;
	private String refrigerado;
	
	//constructores
	public Productos() {
		
	}

	public Productos(int productoId, int deptoId, String nombre, Date fechaCad, double precioCompra, double precioVenta,
			String refrigerado) {
		super();
		this.productoId = productoId;
		this.deptoId = deptoId;
		this.nombre = nombre;
		this.fechaCad = fechaCad;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.refrigerado = refrigerado;
	}
//getters && setters
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

	public String getRefrigerado() {
		return refrigerado;
	}

	public void setRefrigerado(String refrigerado) {
		this.refrigerado = refrigerado;
	}
//toString
	@Override
	public String toString() {
		return "Productos [productoId=" + productoId + ", deptoId=" + deptoId + ", nombre=" + nombre + ", fechaCad="
				+ fechaCad + ", precioCompra=" + precioCompra + ", precioVenta=" + precioVenta + ", refrigerado="
				+ refrigerado + "]";
	}
	
	
	
	
}
