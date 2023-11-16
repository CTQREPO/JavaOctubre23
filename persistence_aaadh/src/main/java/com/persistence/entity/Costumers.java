package com.persistence.entity;

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
@Table (name = "CUSTOMERS")
public class Costumers implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cid_auto")
	@SequenceGenerator(name = "cid_auto", sequenceName = "COSTUMERS_SEQ", allocationSize = 1)
	@Column(name = "CLIENTE_ID", columnDefinition = "NUMBER")
	int cliente_Id;
	
	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR2")
	String nombre;
	
	@Column(name = "FECHA_NAC", columnDefinition = "DATE")
	Date fechaNac;
	
	@Column(name = "DOMICILIO", columnDefinition = "NVARCHAR2")
	String domicilio;
	
	
//	@OneToMany (mappedBy= "cliente")
//	List<Ventas>ventas;
	
	public Costumers () {
	}
	public Costumers(int cliente_Id) {
		super();
		this.cliente_Id = cliente_Id;
	}
	public int getCliente_Id() {
		return cliente_Id;
	}
	public void setCliente_Id(int cliente_Id) {
		this.cliente_Id = cliente_Id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
}
