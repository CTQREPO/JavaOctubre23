package com.ms.persistence.request;

import java.util.Date;

public class EmpleadosRequest {

	int empleadoId;
	int nombreEmpleado;
	Date fecchaIngreso;
	double salario;

	public EmpleadosRequest(int empleadoId, int nombreEmpleado, Date fecchaIngreso, double salario) {
		this.empleadoId = empleadoId;
		this.nombreEmpleado = nombreEmpleado;
		this.fecchaIngreso = fecchaIngreso;
		this.salario = salario;
	}

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

	@Override
	public String toString() {
		return "EmpleadosRequest [empleadoId=" + empleadoId + ", nombreEmpleado=" + nombreEmpleado + ", fecchaIngreso="
				+ fecchaIngreso + ", salario=" + salario + "]";
	}

}
