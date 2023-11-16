package com.Ventas.service;

import java.util.List;

import com.persitence.entity.Ventas;
import com.persitence.request.VentasRequest;



public interface IVentasService {
	Ventas guardar(VentasRequest request);
	Ventas actualizar(VentasRequest request);
	Ventas buscar(int id);
	Ventas buscar(String nombre);
	String eliminar(int id);
	List mostrar();

}
