package com.persistence.entity;

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
@Table(name="CUSTOMERS")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
property = "clienteId")
public class PersistenceCustomers implements Serializable {
	/**
	 * 
	 */ 
	private static final long serialVersionUID = 1L;
	public PersistenceCustomers() {
	}
	public PersistenceCustomers(int clienteId) {
		this.clienteId = clienteId;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="cid_auto")
	@SequenceGenerator(name="cid_auto", sequenceName="CUSTOMERS_SEQ", allocationSize=1)
	@Column(name="CLIENTE_ID", columnDefinition = "NUMBER")
	int clienteId;
	
	@Column(name="NOMBRE", columnDefinition = "NVARVHAR2(15)")
	String nombre;
	@Column(name="FECHA_NAC", columnDefinition = "DATE")
	Date fechanac;
	@Column(name="DOMICILIO", columnDefinition = "NVARCHAR2(40)")
	String domicilio;
	
	//ATRIBUTO RELACIONAL
	@OneToMany(mappedBy="customer")
	List<PersistenceVentas> ventas;

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

	/*public List<PersistenceVentas> getVentas() {
		return ventas;
	}

	public void setVentas(List<PersistenceVentas> ventas) {
		this.ventas = ventas;
	}	
	*/
	@Override
	public String toString() {
		return "PersistenceCustomers [clienteId=" + clienteId + ", nombre=" + nombre + ", fechanac=" + fechanac
				+ ", domicilio=" + domicilio + ", ventas=" + ventas + "]";
	}
}
