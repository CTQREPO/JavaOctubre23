package com.empleados.service;

import java.util.List;

import com.persistence.entity.Empleados;
import com.persistence.request.RequestEmpleados;

public interface EmpleadosService {
	
	Empleados guardar(RequestEmpleados request);
	Empleados actualizar(RequestEmpleados request);
	Empleados buscar(int id);
	String eliminar (int id);
	List mostrar();
}
