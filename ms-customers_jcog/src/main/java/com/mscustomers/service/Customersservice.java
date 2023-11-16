package com.mscustomers.service;

import java.util.List;

import com.persistence.entity.PersistenceCustomers;
import com.persistence.request.RequestCustomers;

public interface Customersservice {

	PersistenceCustomers guardar (RequestCustomers request);
	PersistenceCustomers actualizar(RequestCustomers request);
	PersistenceCustomers buscar(int id);
	PersistenceCustomers buscar(String nombre);
	String eliminar(int id);
	List mostrar ();
} 
 