package com.msventas.service;

import java.util.List;

import com.mspersistence.entity.Ventas;
import com.mspersistence.request.VentasRequest;

//Interface de negocio

/*
* Indica que acciones del negocio se tienen que resolver
* en este nodo de sistema
*/
public interface VentasService {

	Ventas guardar(VentasRequest request);
	Ventas actualizar(VentasRequest request);
	Ventas buscar(int id);
	Ventas buscar(String nombre);
	String eliminar(int id);
	List mostrar();
}
