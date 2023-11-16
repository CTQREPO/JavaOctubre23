package com.ms.ventas.service;

import java.util.List;
import com.ms.persistence.entity.Ventas;
import com.ms.persistence.request.VentasRequest;

public interface IVentasService {
	Ventas guardar(VentasRequest request);

	Ventas actualizar(VentasRequest request);

	Ventas buscar(int id);

	Ventas buscar(String nombre);

	Ventas eliminar(int id);

	List mostrar();
}
