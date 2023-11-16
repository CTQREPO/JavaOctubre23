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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "empleadoId")
public class Empleados  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cidss_auto")
	@SequenceGenerator(name="cidss_auto", sequenceName="EMPLEADOS_SEQ", allocationSize=1)
	
	@Column(name="EMPLEADO_ID", columnDefinition="NUMBER")
	int empleadoId;
	@Column(name="NOMBRE", columnDefinition="NVARCHAR2(20)")
	String nombre;
	@Column(name="FECHA_INGRESO", columnDefinition="DATE")
	Date fechaNac;
	@Column(name="SALARIO", columnDefinition="NUMBER(5,2)")
	double salario;
	@OneToMany(mappedBy="empleado")	
	List<Ventas>ventas;
	
	
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
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	

}
