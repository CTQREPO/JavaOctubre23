package com.customers.service;

import java.util.List;

import com.persistence.entity.Customers;
import com.persistence.request.RequestCustomers;

public interface CustomersService {

	Customers guardar(RequestCustomers request); 
	Customers actualizar(RequestCustomers request);
	Customers buscar(int id);
	String eliminar (int id);
	List mostrar();
	Customers buscar(String nombre);
}