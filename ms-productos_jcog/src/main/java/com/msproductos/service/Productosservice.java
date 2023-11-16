package com.msproductos.service;

import java.util.List;

import com.msproductos.entity.Productos;
import com.msproductos.request.Productorequest;


public interface Productosservice {

	Productos guardar (Productorequest request);
	Productos actualizar(Productorequest request);
	Productos buscar(int id);
	Productos buscar(String nombre);
	String eliminar(int id);
	List mostrar ();
}

//Interface de negocio
//indica que acciones del negocio se tienen que resolver
//en este nodo de sistema