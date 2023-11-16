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
@Table(name = "Empleados")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "empleadoId")
public class Empleados implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_empleado")
	@SequenceGenerator(name="cid_empleado", sequenceName="EMPLEADOS_SEQ", allocationSize=1)
	@Column(name="EMPLEADO_ID",columnDefinition="NUMBER")
	int empleadoId;
	
	@Column(name="NOMBRE",columnDefinition="NVARCHAR2(15)")
	String nombre;
	@Column(name="FECHA_INGRESO",columnDefinition="DATE")
	Date fechaIngreso;
	@Column(name="SALARIO",columnDefinition="NUMBER")
	double salario;
	
	
		@OneToMany(mappedBy="empleado")
		List<Ventas> ventas;

		//getters && setters
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


		public List<Ventas> getVentas() {
			return ventas;
		}


		public void setVentas(List<Ventas> ventas) {
			this.ventas = ventas;
		}
	
	
	

}
