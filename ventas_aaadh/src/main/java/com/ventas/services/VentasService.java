package com.ventas.services;

import java.util.List;

import com.persistence.entity.Ventas;
import com.persistence.request.VentasRequest;
//Interface de Negocio
	/*
	 * Indica qué acciones del negocio se tienen que resolver en este nodo de sistema
	 */
public interface VentasService {

	
	Ventas guardar (VentasRequest request);
	Ventas actualizar (VentasRequest request);
	Ventas buscar (int id);
	Ventas buscar (String nombre);
	String eliminar (int id);
	List mostrar ();
}