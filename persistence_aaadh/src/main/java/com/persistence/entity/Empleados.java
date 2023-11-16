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




//import com.fasterxml.jackson.annotation.JsonIdentityInfo;

@Entity
@Table (name = "EMPLEADOS")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
//property = "empleado_Id")

public class Empleados implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "eid_auto")
	@SequenceGenerator(name = "eid_auto", sequenceName = "EMPLEADOS_SEQ", allocationSize = 1)
	@Column(name = "EMPLEADO_ID", columnDefinition = "NUMBER")
	int empleado_Id;
	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR2(15)")
	String nombre;
	@Column(name = "FECHA_INGRESO", columnDefinition = "DATE")
	Date fecha_ingreso;
	@Column(name = "SALARIO", columnDefinition = "NUMBER")
	double salario;
	
	//@OneToMany (mappedBy= "empleados")
	//List<Ventas>ventas;
	
	public Empleados(int empleado_Id) {
		super();
		this.empleado_Id = empleado_Id;
	}

	public Empleados () {
	}
	
	public int getEmpleado_Id() {
		return empleado_Id;
	}
	public void setEmpleado_Id(int empleado_Id) {
		this.empleado_Id = empleado_Id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFecha_ingreso() {
		return fecha_ingreso;
	}
	public void setFecha_ingreso(Date fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
