package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table (name = "PROD_PROV")
public class ProdProv {
	
	public ProdProv () {}
	public ProdProv (int id) {
		this.prodprovId = id;
		
	}
 @Id
 @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "pid_prodprov" )
 @SequenceGenerator (name = "pid_prodprov", sequenceName= "PROD_PROV_SEQ")
 @Column (name = "PROD_PROV_ID", columnDefinition = "NUMBER")
 int prodprovId;
 @OneToOne 
 @JoinColumn (name = "PROVEEDOR_ID", columnDefinition ="ProveedorId")
 int proveedorId;
 @Column (name = "PRODUCTO_ID", columnDefinition ="ProductoId")
 int productoId;
 
 
public ProdProv(int prodprovId, int proveedorId, int productoId) {
	super();
	this.prodprovId = prodprovId;
	this.proveedorId = proveedorId;
	this.productoId = productoId;
}
public int getProdprovId() {
	return prodprovId;
}
public void setProdprovId(int prodprovId) {
	this.prodprovId = prodprovId;
}
public int getProveedorId() {
	return proveedorId;
}
public void setProveedorId(int proveedorId) {
	this.proveedorId = proveedorId;
}
public int getProductoId() {
	return productoId;
}
public void setProductoId(int productoId) {
	this.productoId = productoId;
}
@Override
public String toString() {
	return "ProdProv [prodprovId=" + prodprovId + ", proveedorId=" + proveedorId + ", productoId=" + productoId + "]";
}
 
}
