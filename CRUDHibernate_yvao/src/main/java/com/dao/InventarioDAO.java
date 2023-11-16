package com.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Inventario;
import com.entity.Productos;
import com.general.IMetodos;

public class InventarioDAO implements IMetodos{
	
	//carga los objetos(las clases definidas en el persistence)
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	//cargar todas las operaciones(insert,update,delete,select,contar,etc)
	EntityManager em = emf.createEntityManager();
	Inventario inventario = null;

	@Override
	public String guardar(Object ob) {
	//public String guardar(Object ob) {
			inventario = (Inventario) ob;
			em.getTransaction().begin();
			String resultado=null;
		try {
			em.persist(inventario); //Este es el insert
			em.getTransaction().commit();
			resultado ="1";
			System.out.println("Registro insertado");
		}catch(Exception e) {
			em.getTransaction().rollback();
			resultado = e.getMessage();
			System.out.println("No pudo insertarse");
		}
		em.close(); //es importante cerrar el EntityManager para liberar memoria
			return resultado;
	}

	@Override
	public String editar(Object ob) {
		inventario = (Inventario) ob;
		Inventario inventariodb = em.find(Inventario.class, inventario.getInventarioId());
		Productos productos = em.find(Productos.class, inventario.getProducto().getProductoId());
		String r = null;
		em.getTransaction().begin();
	try {
		inventariodb.setInventarioId(inventario.getInventarioId());
		inventariodb.setProducto(productos);
		inventariodb.setStock(inventario.getStock());
		inventariodb.setFecha(inventario.getFecha());
		
		
		em.getTransaction().commit();
		System.out.println("Editado correctamente");
		r = "1";
	}catch(Exception e) {
		em.getTransaction().rollback();
		System.out.println("No se puede editar");
		r = e.getMessage();
	}
	return r;
}

	@Override
	public String eliminar(int id) {
		String r = null;
		inventario = em.find(Inventario.class, id);
		em.getTransaction().begin();
		try {
			em.remove(inventario);
			em.getTransaction().commit();
			System.out.println("Se ha eliminado el registro");
			r = "1";
		}catch(Exception e) {
			em.getTransaction().rollback();
			System.out.println("No se puede eliminar");
			r = e.getMessage();
		}
		return r;
	}

	@Override
	public Object buscar(int id) {
		inventario = em.find(Inventario.class, id);
		return inventario;
	}

	@Override
	public List mostrar() {
		List<Inventario> ls = em.createQuery("from Inventario").getResultList();
		return ls;
	}

}
