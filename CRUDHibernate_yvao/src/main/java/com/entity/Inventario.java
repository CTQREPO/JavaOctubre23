package com.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="INVENTARIO")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "inventarioId")

public class Inventario {
	
			
	public Inventario() {}
	public Inventario(int id) {
		this.inventarioId = id;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_inventario")
	@SequenceGenerator(name="cid_inventario", sequenceName="INVENTARIO_SEQ")
	@Column(name="INVENTARIO_ID",columnDefinition="NUMBER")
	private int inventarioId;
	
	@OneToOne
	@JoinColumn(name="PRODUCTO_ID",columnDefinition="NUMBER")
	private Productos producto;
	@Column(name="STOCK",columnDefinition="NUMBER")
	private int stock;
	@Column(name="FECHA",columnDefinition="DATE")
	private Date fecha;
	
//	 @OneToOne
//	 @JoinColumn(name = "FK_PRODUCTO_ID", updatable = false, nullable = false)
//	 private Productos producto;
	
	//GETTERS && SETTERS
	public int getInventarioId() {
		return inventarioId;
	}
	public void setInventarioId(int inventarioId) {
		this.inventarioId = inventarioId;
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
	public Productos getProducto() {
		return producto;
	}
	public void setProducto(Productos producto) {
		this.producto = producto;
	}
	
	
}
