package com.dto;

import java.sql.Date;

//DTO: modelo de una estructura  que no existe fisicamente (solo lectura)
public class ProductosStockDTO {
	
	private String nombre;
	private Date fechaCad;
	private double precioCompra;
	private int stock;
	
	
	public ProductosStockDTO(String nombre, Date fechaCad, double precioCompra, int stock) {
		super();
		this.nombre = nombre;
		this.fechaCad = fechaCad;
		this.precioCompra = precioCompra;
		this.stock = stock;
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


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	@Override
	public String toString() {
		return "ProductosStockDTO [nombre=" + nombre + ", fechaCad=" + fechaCad + ", precioCompra=" + precioCompra
				+ ", stock=" + stock + "]";
	}
	
	

	

}
