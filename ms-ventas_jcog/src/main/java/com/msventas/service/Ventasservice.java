package com.msventas.service;

import java.util.List;

import com.persistence.entity.PersistenceVentas;
import com.persistence.request.RequestVentas;

public interface Ventasservice {

	PersistenceVentas guardar (RequestVentas request);
	PersistenceVentas actualizar(RequestVentas request);
	PersistenceVentas buscar(int id);
	PersistenceVentas buscar(String nombre);
	String eliminar(int id);
	List mostrar ();
} 
