package com.msproductos.request;

import java.sql.Date;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
//import javax.validation.constraints.


public class ProductoRequest {

	int productoId;
	int deptoId;
	
	@NotBlank(message  = "(¬_¬) El nombre no puede quedar vacio (¬_¬)")
	@Size(max=20, message = "ESTE ATRIBUTO SOLO PERMITE 20 CARACTERES")
	String nombre;
	@FutureOrPresent(message = "la fecha no debe ser pasado")
	Date fecha;
	
	@DecimalMax(value="99.99", message="EL PREICO NO DEBE SUPERAR 999.99 (ó﹏ò｡)")
	double precioCompra;
	
	@DecimalMax(value="99.99", message="EL PREICO NO DEBE SUPERAR 999.99 (ó﹏ò｡)")
	double precioVenta;
	
	///VALIDACION DE NEGOCIO
	
	String refrigerado;
	
	
	
	public ProductoRequest(int productoId, int deptoId, String nombre, Date fecha, double precioCompra,
			double precioVenta, String refrigerado) {
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



	public String getRefrigerado() {
		return refrigerado;
	}



	public void setRefrigerado(String refrigerado) {
		this.refrigerado = refrigerado;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
