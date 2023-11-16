package com.costumers.service;


import java.util.List;

import com.persistence.entity.Costumers;
import com.persistence.request.CostumerRequest;
//Interface de Negocio
	/*
	 * Indica qué acciones del negocio se tienen que resolver en este nodo de sistema
	 */
public interface CostumersService {

	
	Costumers guardar (CostumerRequest request);
	Costumers actualizar (CostumerRequest request);
	Costumers buscar (int id);
	Costumers buscar (String nombre);
	String eliminar (int id);
	List mostrar ();
}
