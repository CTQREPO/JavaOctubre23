package com.Customers.service;

import java.util.List;

import com.persitence.entity.Customers;
import com.persitence.request.CustomersRequest;



public interface ICustomersService {
	
	Customers guardar(CustomersRequest request);
	Customers actualizar(CustomersRequest request);
	Customers buscar(int id);
	Customers buscar(String nombre);
	String eliminar(int id);
	List mostrar();

}
