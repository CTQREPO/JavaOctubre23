package com.ms.productos.service;

import java.util.List;

import com.ms.productos.emtity.Productos;
import com.ms.productos.request.ProductoRequest;

public interface IProductoService {

	Productos guardar(ProductoRequest request);

	Productos actualizar(ProductoRequest request);

	Productos buscar(int id);

	Productos buscar(String nombre);

	String eliminar(int id);

	List mostrar();
}
