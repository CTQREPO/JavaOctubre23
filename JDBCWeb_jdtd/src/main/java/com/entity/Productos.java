package com.entity;

import java.sql.Date;
//POJO
public class Productos {
	
	private int productos;
	private int deptoId;
	private String nombre;
	private Date fechaCad;
	private double precioCompra;
	private double precioVenta;
	private String refrigerado;

	public  Productos () {//metodo constructor vacio
		
	}
// se genera el metodo constructor automatico
	public Productos(int productos, int deptoId, String nombre, Date fechaCad, double precioCompra, double precioVenta,
			String refrigerado) {
		super();
		this.productos = productos;
		this.deptoId = deptoId;
		this.nombre = nombre;
		this.fechaCad = fechaCad;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.refrigerado = refrigerado;
	}
//se generan geters and setters
	public int getProductos() {
		return productos;
	}

	public void setProductos(int productos) {
		this.productos = productos;
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

	@Override
	public String toString() {
		return "Productos [productos=" + productos + ", deptoId=" + deptoId + ", nombre=" + nombre + ", fechaCad="
				+ fechaCad + ", precioCompra=" + precioCompra + ", precioVenta=" + precioVenta + ", refrigerado="
				+ refrigerado + "]";
	}
	
	
	
	
	
}
