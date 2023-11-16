package com.Empleados.service;

import java.util.List;

import com.persitence.entity.Customers;
import com.persitence.entity.Empleados;
import com.persitence.request.CustomersRequest;
import com.persitence.request.EmpleadosRequest;

public interface IEmpleadosServices {
	
	Empleados guardar(EmpleadosRequest request);
	Empleados actualizar(EmpleadosRequest request);
	Empleados buscar(int id);
	Empleados buscar(String nombre);
	String eliminar(int id);
	List mostrar();

}
