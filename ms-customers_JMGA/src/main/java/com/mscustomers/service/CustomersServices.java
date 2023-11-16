package com.mscustomers.service;

import java.util.List;

import com.persistence.entity.Customers;
import com.persistence.request.CustomersRequest;



public interface CustomersServices {
	
	Customers guardar(CustomersRequest request);
	Customers actualizar(CustomersRequest request);
	Customers buscar(int id);
	Customers buscar(String nombre);
	String eliminar(int id);
	List mostrar();

}
