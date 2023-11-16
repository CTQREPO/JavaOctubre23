package com.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="PRODUCTOS")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "productoId")
public class Productos {
	
	public Productos() {
		
	}
	public Productos(int id) {
		this.productoId = id;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_producto")
	@SequenceGenerator(name="cid_producto", sequenceName="PRODUCTOS_SEQ")
	@Column(name="PRODUCTO_ID",columnDefinition="NUMBER")
	int productoId;
	
	@Column(name="DEPTO_ID",columnDefinition="NUMBER")
	int deptoId;
	@Column(name="NOMBRE",columnDefinition="NVARCHAR2(20)")
	String nombre;
	@Column(name="FECHA_CAD",columnDefinition="DATE")
	Date fechaCad;
	@Column(name="PRECIO_COMPRA",columnDefinition="NUMBER")
	double precioCompra;
	@Column(name="PRECIO_VENTA",columnDefinition="NUMBER")
	double precioVenta;
	@Column(name="REFRIGERADO",columnDefinition="CHAR(1)")
	char refrigerado;
	
	 
	    
	@OneToOne(mappedBy = "producto") // es un atributo relacional no existe fisicamente en la tabla
	  private Inventario inventario;
	
	
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
	public Inventario getInventario() {
		return inventario;
	}
	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}
	
	
}
