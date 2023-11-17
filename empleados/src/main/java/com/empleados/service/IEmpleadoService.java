package com.empleados.service;

import java.util.List;

import com.persistence.entity.Empleados;
import com.persistence.request.EmpleadoRequest;

//Interface de negocio
//Indica que acciones del negocio se tienen que resolver
//en este nodo de sistema

public interface IEmpleadoService {

	Empleados guardar(EmpleadoRequest request);
	Empleados actualizar(EmpleadoRequest request);
	Empleados buscar(int id);
	Empleados buscar(String nombre);
	String eliminar(int id);
	List mostrar();
}
