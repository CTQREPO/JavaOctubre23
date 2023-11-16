package com.ms.persistence.entity;

import java.io.Serializable;
import java.util.Date;
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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class , property = "clienteId")
public class Customers implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CLIENTE_ID", columnDefinition = "NUMBER")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cid_customers")
	@SequenceGenerator(name = "cid_customers", sequenceName = "CUSTOMERS_SE", allocationSize = 1)
	private int clienteId;

	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR2(15)")
	private String nombreCliente;

	@Column(name = "FECHA_NAC", columnDefinition = "DATE")
	private Date fechaNacimiento;

	@Column(name = "DOMICILIO", columnDefinition = "NVARCHAR2(40)")
	private String domicilio;
	
	@Column(name = "STATUS", columnDefinition = "NVARCHAR2(1)")
	private String status;

	// Atributos relacinales

	@OneToMany(mappedBy = "cliente")
	List<Ventas> ventas;

	public int getClienteId() {
		return clienteId;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDomicilio() {
		return domicilio;
	}
	
	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
