package com.ms.productos.service;

//Interfaz de Negocio

/*
 * 
 */

import java.util.List;


import com.ms.productos.entity.Productos;
import com.ms.productos.request.ProductosRequest;

public interface IProductoService {

	Productos guardar(ProductosRequest request);
	Productos actualizar(ProductosRequest request);
	Productos buscar(int id);
	Productos buscar(String nombre);
	String eliminar(int id);
	List mostrar();
}
