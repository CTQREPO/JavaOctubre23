package com.msproductos.request;

import java.sql.Date;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
//import javax.validation.constraints.;

public class Productorequest {

	private int productosId;
	private int deptoId;
	@NotBlank(message="El nombre no puede quedar vacio")
	@Size(max=20,message="Este atributo  solo permite 20 caracteres")
	private String nombre;
	@FutureOrPresent(message="La fecha no debe serm pasada")
	private Date fechaCad;
	@DecimalMax(value="999.99",message="el precio de compra no debe superar 999.99")
	private double precioCompra;
	@DecimalMax(value="999.99",message="el precio de compra no debe superar 999.99")
	private double precioVenta;
	//validacion de negocio
	private char refrigerado;
	
	public Productorequest(int productosId, int deptoId, String nombre, Date fechaCad, double precioCompra,
			double precioVenta, char refrigerado) {
		super();
		this.productosId = productosId;
		this.deptoId = deptoId;
		this.nombre = nombre;
		this.fechaCad = fechaCad;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.refrigerado = refrigerado;
	}
	public int getProductosId() {
		return productosId;
	}
	public void setProductosId(int productosId) {
		this.productosId = productosId;
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
