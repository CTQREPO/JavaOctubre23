package com.ventas.service;

import java.util.List;

import com.persistence.entity.Venta;
import com.persistence.request.VentaRequest;

public interface VentaService {

	Venta guardar(VentaRequest request);
	Venta actualizar(VentaRequest request);
	Venta buscar(int id);
	Venta buscar(String nombre);
	String eliminar(int id);
	List mostrar();
	
	
}
