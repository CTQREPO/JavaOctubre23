package com.entity;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;

@Entity
@Table (name= "PROVEEDOR")
@JsonIdentityInfo (generator = ObjectIdGenerators.PropertyGenerator.Class  , property = "proveedorId")
public class Proveedor {

	public Proveedor () {}
	public Proveedor (int id) {
		this.proveedorId = id;
	}
	@Id
	@GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "pid_proveedor")
	@SequenceGenerator (name="pid_proveedor", sequenceName= "PROVEEDOR_SEQ")
	@Column(name="PROVEEDOR_ID",columnDefinition="NUMBER")
	int proveedorId;
	
	
	@Column (name= "NOMBRE", columnDefinition= "Nombre")
	String nombre;
	@Column (name= "TELEFONO", columnDefinition= "Telefono")
	String telefono;
	@Column (name= "CORREO", columnDefinition= "Correo")
	String correo;
	
	@OneToOne(mappedBy = "proveedor")//este es un atributo que es primitivo
	private ProdProv productos;
	
	
	
	//Generar Getters & Setter
	public Proveedor(int proveedorId, String nombre, String telefono, String correo) {
		super();
		this.proveedorId = proveedorId;
		this.nombre = nombre;
		this.telefono = telefono;
		this.correo = correo;
	}
	public int getProveedorId() {
		return proveedorId;
	}
	public void setProveedorId(int proveedorId) {
		this.proveedorId = proveedorId;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	@Override
	public String toString() {
		return "Proveedor [proveedorId=" + proveedorId + ", nombre=" + nombre + ", telefono=" + telefono + ", correo="
				+ correo + "]";
	}
	
}
