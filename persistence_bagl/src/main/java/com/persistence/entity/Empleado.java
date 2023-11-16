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
@Table(name = "EMPLEADOS")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, 
property = "empleadoId")
public class Empleado implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Empleado() {
	}

	public Empleado(int empleadoId) {
		this.empleadoId = empleadoId;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "eid_auto")
	@SequenceGenerator(name = "eid_auto", sequenceName = "EMPLEADOS_SEQ", allocationSize = 1)
	@Column(name = "EMPLEADO_ID", columnDefinition = "NUMBER")
	private int empleadoId;
	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR2(15)")
	private String nombre;
	@Column(name = "FECHA_INGRESO", columnDefinition = "DATE")
	private Date fechaIngreso;
	@Column(name = "SALARIO", columnDefinition = "NUMBER(5,2)")
	private double salario;

	@OneToMany(mappedBy = "empleado")
	List<Venta> ventas;

	public int getEmpleadoId() {
		return empleadoId;
	}

	public void setEmpleadoId(int empleadoId) {
		this.empleadoId = empleadoId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
/*
	public List<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}*/

	@Override
	public String toString() {
		return "Empleado [empleadoId=" + empleadoId + ", nombre=" + nombre + ", fechaIngreso=" + fechaIngreso
				+ ", salario=" + salario + ", ventas=" + ventas + "]";
	}
	
	

}
