package com.persitence.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "CUSTOMERS")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "clienteId",scope = Customers.class)
public class Customers implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cid_customers")
	@SequenceGenerator(name = "cid_customers", sequenceName = "CUSTOMERS_SEQ", allocationSize = 1)
	@Column(name = "CLIENTE_ID", columnDefinition = "NUMBER")
	private int clienteId;

	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR2(15)")
	private String nombre;

	@Column(name = "FECHA_NAC", columnDefinition = "DATE")
	private Date fechanac;

	@Column(name = "DOMICILIO", columnDefinition = "NVARCHAR2(40)")
	private String domicilio;
	
	//atributo relacional
	@OneToMany(mappedBy="cliente")
	List<Ventas> ventas;

	public int getClienteId() {
		return clienteId;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechanac() {
		return fechanac;
	}

	public void setFechanac(Date fechanac) {
		this.fechanac = fechanac;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public List<Ventas> getVentas() {
		return ventas;
	}

	public void setVentas(List<Ventas> ventas) {
		this.ventas = ventas;
	}

	
}
