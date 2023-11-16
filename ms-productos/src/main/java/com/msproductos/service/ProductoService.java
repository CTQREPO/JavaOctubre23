package com.msproductos.service;

import java.util.List;

import com.msproductos.entity.Productos;
import com.msproductos.request.ProductoRequest;

//Inteface de negocio 

//indica accionas del negocio se tiene que resolver
//en este nodo del sistema

public interface ProductoService {
	
	Productos guardar(ProductoRequest request);
	Productos actualizar(ProductoRequest request);
	Productos buscar(int id);
	Productos buscar(String nombre);
	String eliminar(int id);
	List mostrar();
}
