package com.empleados.service;

import java.util.List;

import com.persistence.entity.Empleado;
import com.persistence.request.EmpleadoRequest;


public interface EmpleadoService {

	Empleado guardar(EmpleadoRequest request);
	Empleado actualizar(EmpleadoRequest request);
	Empleado buscar(int id);
	Empleado buscar(String nombre);
	String eliminar(int id);
	List mostrar();
	
	
	
}
