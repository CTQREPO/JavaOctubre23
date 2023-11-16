package com.general;

import java.util.List;

public interface IMetodos {

	String guardar(Object ob); 
	String actualizar(Object ob);
	String eliminar(int id);
	Object buscar(int id);
	List mostrar();
	
}
