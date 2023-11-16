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
@Table(name="EMPLEADOS")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
property = "empleadoId")
public class PersistenceEmpleados implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public PersistenceEmpleados() {	
	}
	public PersistenceEmpleados(int empleadoId) {
		this.empleadoId = empleadoId;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="eid_auto")
	@SequenceGenerator(name="eid_auto", sequenceName="EMPLEADOS_SEQ", allocationSize=1)
	@Column(name="EMPLEADO_ID", columnDefinition = "NUMBER")
	private int empleadoId;	
	@Column(name="NOMBRE", columnDefinition = "NVARVHAR2(15)")
	private String nombre;
	@Column(name="FECHA_INGRESO", columnDefinition = "DATE")
	private Date fechaingreso;
	@Column(name="SALARIO", columnDefinition = "NUMBER(5,2)")
	private double salario;
	
	@OneToMany(mappedBy = "empleado")
	List<PersistenceVentas> ventas;

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
	public Date getFechaingreso() {
		return fechaingreso;
	}
	public void setFechaingreso(Date fechaingreso) {
		this.fechaingreso = fechaingreso;
	}
	public double getSalario() {
		return salario; 
	}
	public void setSalario(double salario) {
		this.salario = salario; 
	}
/*	public List<PersistenceVentas> getVentas() {
		return ventas;
	}
	public void setVentas(List<PersistenceVentas> ventas) {
		this.ventas = ventas;
	}*/
	@Override
	public String toString() {
		return "PersistenceEmpleados [empleadoId=" + empleadoId + ", nombre=" + nombre + ", fechaingreso="
				+ fechaingreso + ", salario=" + salario + ", ventas=" + ventas + "]";
	}
	
	

}
	