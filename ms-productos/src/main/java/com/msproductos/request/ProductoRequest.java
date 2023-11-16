package com.msproductos.request;

import java.sql.Date;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

//import javax.validation.constraints.
//clase de entidad porque tiene anotaciones y la habilita la usa de molde
//request sirve para que que cualquier cliente puede tomar los datos que quiera manipular 


public class ProductoRequest {
	
	int productoId;
	int deptoId;
	@NotBlank(message="El nombre no puede quedar vacio")
	@Size(max=20, message="Este atributo solo permite hasta 20 caracteres")
	String nombre;
	@FutureOrPresent(message="La fecha no debe ser pasada")
	Date fecha;
	@DecimalMax(value="999.99", message="El precio de la compra no deber superar 999.99")
	double precioCompra;
	@DecimalMax(value="999.99", message="El precio de la compra no deber superar 999.99")
	double precioVenta;
	
	//Validacion de negocio 
	char refrigerado;
	
	public ProductoRequest(int productoId, int deptoId, String nombre, Date fecha, double precioCompra,
			double precioVenta, char refrigerado) {
		super();
		this.productoId = productoId;
		this.deptoId = deptoId;
		this.nombre = nombre;
		this.fecha = fecha;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.refrigerado = refrigerado;
		
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

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
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
