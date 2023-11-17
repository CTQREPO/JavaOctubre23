package com.customers.service;

import java.util.List;

import com.persistence.entity.Customers;
import com.persistence.request.CustomerRequest;

//Interface de negocio
//Indica que acciones del negocio se tienen que resolver
//en este nodo de sistema

public interface ICustomerService {

	Customers guardar(CustomerRequest request);
	Customers actualizar(CustomerRequest request);
	Customers buscar(int id);
	Customers buscar(String nombre);
	String eliminar(int id);
	List mostrar();
}
