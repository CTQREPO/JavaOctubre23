package com.ventas.service;

import java.util.List;

import com.persistence.entity.Ventas;
import com.persistence.request.VentaRequest;

//Interface de negocio
//Indica que acciones del negocio se tienen que resolver
//en este nodo de sistema

public interface IVentaService {

	Ventas guardar(VentaRequest request);
	Ventas actualizar(VentaRequest request);
	Ventas buscar(int id);
	Ventas buscar(String nombre);
	String eliminar(int id);
	List mostrar();
}
