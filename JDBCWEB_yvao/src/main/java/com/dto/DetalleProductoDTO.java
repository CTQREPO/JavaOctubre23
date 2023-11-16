package com.dto;

public class DetalleProductoDTO {

	private String producto;
	private double precioVenta;
	private int cantidad;
	private String depto;
	
	//constructor
	public DetalleProductoDTO(String producto, double precioVenta, int cantidad, String depto) {
		super();
		this.producto = producto;
		this.precioVenta = precioVenta;
		this.cantidad = cantidad;
		this.depto = depto;
	}

	//gettesr && setters
	
	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getDepto() {
		return depto;
	}

	public void setDepto(String depto) {
		this.depto = depto;
	}
	
}
