package com.ms.persistence.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLEADOS")
public class Empleados implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "EMPLEADO_ID", columnDefinition = "NUMBER")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cid_empleados")
	@SequenceGenerator(name = "cid_empleados", sequenceName = "EMPLEADOS_SEQ", allocationSize = 1)
	private int empleadoId;

	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR2(15)")
	private int nombreEmpleado;

	@Column(name = "FECHA_INGRESO", columnDefinition = "DATE")
	private Date fecchaIngreso;

	@Column(name = "SALARIO", columnDefinition = "NUMBER(5,2)")
	private double salario;

	public int getEmpleadoId() {
		return empleadoId;
	}

	public void setEmpleadoId(int empleadoId) {
		this.empleadoId = empleadoId;
	}

	public int getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(int nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public Date getFecchaIngreso() {
		return fecchaIngreso;
	}

	public void setFecchaIngreso(Date fecchaIngreso) {
		this.fecchaIngreso = fecchaIngreso;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
