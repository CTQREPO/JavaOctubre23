package com.msproductos.service;

import java.util.List;
import com.msproductos.entity.Productos;
import com.msproductos.request.ProductoRequest;

//Interface de Negocio
	/*
	 * Indica qué acciones del negocio se tienen que resolver en este nodo de sistema
	 */
	public interface ProductoService {
		
		Productos guardar (ProductoRequest request);
		Productos actualizar (ProductoRequest request);
		Productos buscar (int id);
		Productos buscar (String nombre);
		String eliminar (int id);
		List mostrar ();
		
}
