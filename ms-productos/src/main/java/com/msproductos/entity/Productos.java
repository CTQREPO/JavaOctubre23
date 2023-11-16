package com.msproductos.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCTOS")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "productoId")
public class Productos implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
	@SequenceGenerator(name="cid_auto", sequenceName="PRODUCTOS_SEQ", allocationSize=1)
	
	@Column(name="PRODUCTO_ID", columnDefinition="NUMBER")
	int productoId;
	@Column(name="DEPTO_ID", columnDefinition="NUMBER")
	int deptoId;
	@Column(name="NOMBRE", columnDefinition="NVARCHAR2(20)")
	String nombre;
	@Column(name="FECHA_CAD", columnDefinition="DATE")
	Date fecha;
	@Column(name="PRECIO_COMPRA", columnDefinition="NUMBER(5,2)")
	double precioCompra;
	@Column(name="PRECIO_VENTA", columnDefinition="NUMBER(5,2)")
	double precioVenta;
	@Column(name="REFRIGERADO", columnDefinition="CHAR(1)")
	char refrigerado;
	@Column(name="STATUS", columnDefinition="NVARCHAR2(1)")
	String status;
//	@OneToOne(mappedBy = "producto")//esto es un atributo relacional no existe fisicamente en la tabla
//	private Inventario inventario;
	
	public int getProductoId() {
		return productoId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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



