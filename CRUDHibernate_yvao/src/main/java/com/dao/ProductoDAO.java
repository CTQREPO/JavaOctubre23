package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Productos;
import com.general.IMetodos;

public class ProductoDAO implements IMetodos{

	//carga los objetos(las clases definidas en el persistence)
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	//cargar todas las operaciones(insert,update,delete,select,contar,etc)
	EntityManager em = emf.createEntityManager();
	Productos producto = null;
	
	@Override
	public String guardar(Object ob) {
		
	//public String guardar(Object ob) {
		producto = (Productos) ob;
		em.getTransaction().begin();
		String resultado=null;
	try {
		em.persist(producto); //Este es el insert
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
		producto = (Productos) ob;
		Productos productodb = em.find(Productos.class, producto.getProductoId());
		String resultado = null;
		em.getTransaction().begin();
	try {
		productodb.setDeptoId(producto.getDeptoId());
		productodb.setNombre(producto.getNombre());
		productodb.setFechaCad(producto.getFechaCad());
		productodb.setPrecioCompra(producto.getPrecioCompra());
		productodb.setPrecioVenta(producto.getPrecioVenta());
		productodb.setRefrigerado(producto.getRefrigerado());
		em.getTransaction().commit();
		System.out.println("Editado correctamente");
		resultado = "1";
	}catch(Exception e) {
		e.printStackTrace();
		em.getTransaction().rollback();
		System.out.println("No se puede editar");
		resultado = e.getMessage();
	}
	return resultado;
	}
	
	@Override
	public String eliminar(int id) {
		String resultado = null;
		producto = em.find(Productos.class, id);
		em.getTransaction().begin();
	try {
		em.remove(producto);
		em.getTransaction().commit();
		System.out.println("Se ha eliminado el registro");
		resultado = "1";
	}catch(Exception e) {
		em.getTransaction().rollback();
		System.out.println("No se puede eliminar");
		resultado = e.getMessage();
	}
	return resultado;
}
	
	@Override
	public Object buscar(int id) {
		producto = em.find(Productos.class,id);
		return producto;
	}
	
	@Override
	public List mostrar() {
		List<Productos> ls = em.createQuery("from Productos").getResultList();
		return ls;
	}
}