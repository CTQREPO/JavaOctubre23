package com.mscustomers.service;

import java.util.List;

import com.mspersistence.entity.Customers;
import com.mspersistence.request.CustomersRequest;

//Interface de negocio

/*
* Indica que acciones del negocio se tienen que resolver
* en este nodo de sistema
*/

public interface CustomersService {

	Customers guardar(CustomersRequest request);
	Customers actualizar(CustomersRequest request);
	Customers buscar(int id);
	Customers buscar(String nombre);
	String eliminar(int id);
	List mostrar();
	
}
