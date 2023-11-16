package com.ms.productos.request;

import java.sql.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.DecimalMax;
//import javax.validation.constraints
import javax.validation.constraints.FutureOrPresent;
public class ProductosRequest {
	
	int productoId;
	int deptoId;
	
	@NotBlank(message="El nombre no se puede guardar vacio")
	@Size(max=20, message="Este atributo solo permite hasta 20 caracteres")
	String nombre;
	@FutureOrPresent(message="La fecha no debe ser pasada")
	Date fechaCad;
	@DecimalMax(value="999.99", message="El precio de compra no debe superar 999.99")
	double precioCompra;
	@DecimalMax(value="999.99", message="El precio de compra no debe superar 999.99")
	double precioVenta;
	//validacion de negocio
	char refrigerado;
	

	public ProductosRequest(int productoId, int deptoId, String nombre, Date fechaCad, double precioCompra,
			double precioVenta, char refrigerado) {
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


	public char getRefrigerado() {
		return refrigerado;
	}


	public void setRefrigerado(char refrigerado) {
		this.refrigerado = refrigerado;
	}

	
	
	
	
}
