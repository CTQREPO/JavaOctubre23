package com.ventas.service;

import java.util.List;

import com.persistence.entity.Ventas;
import com.persistence.request.RequestVentas;


public interface VentasService {

	Ventas guardar(RequestVentas request); 
	Ventas actualizar(RequestVentas request);
	Ventas buscar(int id);
	String eliminar (int id);
	List mostrar();
}
