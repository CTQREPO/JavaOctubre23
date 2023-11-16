package com.ms.productos.request;

import java.util.Date;

public class ProductoRequest {
	int productoId;
	int departamenoId;
	String nombreProducto;
	Date fechaCaducidad;
	double precioCompra;
	double precioVenta;
	char refrigerado;

	public int getProductoId() {
		return productoId;
	}

	

	public ProductoRequest(int productoId, int departamenoId, String nombreProducto, Date fechaCaducidad,
			double precioCompra, double precioVenta, char refrigerado) {
		super();
		this.productoId = productoId;
		this.departamenoId = departamenoId;
		this.nombreProducto = nombreProducto;
		this.fechaCaducidad = fechaCaducidad;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.refrigerado = refrigerado;
	}



	public void setProductoId(int productoId) {
		this.productoId = productoId;
	}

	public int getDepartamenoId() {
		return departamenoId;
	}

	

	public char getRefrigerado() {
		return refrigerado;
	}



	public void setRefrigerado(char refrigerado) {
		this.refrigerado = refrigerado;
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

	@Override
	public String toString() {
		return "ProductoRequest [productoId=" + productoId + ", departamenoId=" + departamenoId + ", nombreProducto="
				+ nombreProducto + ", fechaCaducidad=" + fechaCaducidad + ", precioCompra=" + precioCompra
				+ ", precioVenta=" + precioVenta + "]";
	}
}
