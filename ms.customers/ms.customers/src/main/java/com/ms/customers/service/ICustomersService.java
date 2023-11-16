package com.ms.customers.service;

import java.util.List;

import com.ms.persistence.entity.Customers;
import com.ms.persistence.request.CustomersRequest;

public interface ICustomersService {
	Customers guardar(CustomersRequest request);

	Customers actualizar(CustomersRequest request);

	Customers buscar(int id);

	Customers buscar(String nombre);

	String eliminar(int id);

	List mostrar();
}
