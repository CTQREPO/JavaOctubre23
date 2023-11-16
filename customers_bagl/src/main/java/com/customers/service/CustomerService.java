package com.customers.service;

import java.util.List;

import com.persistence.entity.Customer;
import com.persistence.request.CustomerRequest;

public interface CustomerService {

	Customer guardar(CustomerRequest request);
	Customer actualizar(CustomerRequest request);
	Customer buscar(int id);
	Customer buscar(String nombre);
	String eliminar(int id);
	List mostrar();
	
}
