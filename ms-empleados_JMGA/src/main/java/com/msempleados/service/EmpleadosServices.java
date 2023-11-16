package com.msempleados.service;

import java.util.List;

import com.persistence.entity.Empleados;
import com.persistence.request.EmpleadosRequest;

public interface EmpleadosServices {
	Empleados guardar(Empleados request);
	Empleados actualizar(EmpleadosRequest request);
	Empleados buscar(int id);
	Empleados buscar(String nombre);
	String eliminar(int id);
	List mostrar();

}
