package com.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "INVENTARIO")
public class Inventario {

	public Inventario() {
	}

	public Inventario(int id) {
		this.inventarioId = id;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cid_inventario")
	@SequenceGenerator(name = "cid_inventario", sequenceName = "INVENTARIO_SEQ")
	@Column(name = "INVENTARIO_ID", columnDefinition = "NUMBER")
	int inventarioId;

	@Column(name = "PRODUCTO_ID", columnDefinition = "NUMBER")
	int productoId;
	@Column(name = "STOCK", columnDefinition = "NUMBER")
	int stock;

	public int getInventarioId() {
		return inventarioId;
	}

	public void setInventarioId(int inventarioId) {
		this.inventarioId = inventarioId;
	}

	public int getProductoId() {
		return productoId;
	}

	public void setProductoId(int productoId) {
		this.productoId = productoId;
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

	@Column(name = "FECHA", columnDefinition = "DATE")
	Date fecha;

}
