package com.msempleados.service;

import java.util.List;

import com.mspersistence.entity.Empleados;
import com.mspersistence.request.EmpleadosRequest;


public interface EmpleadosService {

	Empleados guardar(EmpleadosRequest request);
	Empleados actualizar(EmpleadosRequest request);
	Empleados buscar(int id);
	Empleados buscar(String nombre);
	String eliminar(int id);
	List mostrar();
}
