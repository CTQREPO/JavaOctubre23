package com.msproductos.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

//import com.fasterxml.jackson.annotation.JsonIdentityInfo;
//import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "PRODUCTOS")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "productosId")
public class Productos implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cid_producto")
	@SequenceGenerator(name = "cid_producto", sequenceName = "PRODUCTOS_SEQ", allocationSize=1)
	@Column(name = "PRODUCTO_ID", columnDefinition = "NUMBER")
	private int productosId;

	@Column(name = "DEPTO_ID", columnDefinition = "NUMBER")
	private int deptoId;
	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR2(20)")
	private String nombre;
	@Column(name = "FECHA_CAD", columnDefinition = "DATE")
	private Date fechaCad;
	@Column(name = "PRECIO_COMPRA", columnDefinition = "NUMBER(5,2)")
	private double precioCompra;
	@Column(name = "PRECIO_VENTA", columnDefinition = "NUMBER(5,2)")
	private double precioVenta;
	@Column(name = "REFRIGERADO", columnDefinition = "CHAR(1)")
	private char refrigerado;
	
	@Column(name = "STATUS", columnDefinition = "NVARCHAR2(1)")
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	// getters and setters
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

//@OneToOne(mappedBy = "producto")//este es un atributo relacional no existe fisicamente en la tabla
//private Inventario inventario;

}