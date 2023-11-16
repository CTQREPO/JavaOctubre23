package com.entity;

import java.sql.Date;

public class Inventario {

	private int inventarioId;
	private int productoId;
	private int stock;
	private Date fecha;
	
	//constructores
	public Inventario() {
		
	}

	public Inventario(int inventarioId, int productoId, int stock, Date fecha) {
		super();
		this.inventarioId = inventarioId;
		this.productoId = productoId;
		this.stock = stock;
		this.fecha = fecha;
	}
	//getters && setters

	public int getInventarioId() {
		return inventarioId;
	}

	public void setInventarioId(int inventarioId) {
		this.inventarioId = inventarioId;
	}

	public int getProductoId() {
		return productoId;
	}

	public void setProductoId(int productoId) {
		this.productoId = productoId;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Inventario [inventarioId=" + inventarioId + ", productoId=" + productoId + ", stock=" + stock
				+ ", fecha=" + fecha + "]";
	}
	
	
}
