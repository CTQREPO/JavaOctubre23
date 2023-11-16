package com.msempleados.service;

import java.util.List;

import com.persistence.entity.PersistenceEmpleados;
import com.persistence.request.RequestEmpleados;

public interface Empleadosservice {

	PersistenceEmpleados guardar (RequestEmpleados request);
	PersistenceEmpleados actualizar(RequestEmpleados request);
	PersistenceEmpleados buscar(int id);
	PersistenceEmpleados buscar(String nombre);
	String eliminar(int id);
	List mostrar ();
} 
