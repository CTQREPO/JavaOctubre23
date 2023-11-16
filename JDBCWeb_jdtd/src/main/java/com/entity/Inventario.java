package com.entity;

import java.sql.Date;

public class Inventario {
	
	private int inventario_id;
	private int productos;
	private int stock;
	private Date fecha;
	
	
	public Inventario () {
		
	}


	public Inventario(int inventario_id, int productos, int stock, Date fecha) {
		super();
		this.inventario_id = inventario_id;
		this.productos = productos;
		this.stock = stock;
		this.fecha = fecha;
	}


	public int getInventario_id() {
		return inventario_id;
	}


	public void setInventario_id(int inventario_id) {
		this.inventario_id = inventario_id;
	}


	public int getProductos() {
		return productos;
	}


	public void setProductos(int productos) {
		this.productos = productos;
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
		return "Inventario [inventario_id=" + inventario_id + ", productos=" + productos + ", stock=" + stock
				+ ", fecha=" + fecha + "]";
	}
	
	


}
