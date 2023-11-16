package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Inventario;
import com.general.IMetodos;




public class InventarioDAO implements IMetodos {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");

	EntityManager em = emf.createEntityManager();

	Inventario inventario = null;
	
	@Override
	public String guardar(Object ob) {

		inventario = (Inventario) ob;
		em.getTransaction().begin();
		String resultado = null;
		try {
			em.persist(inventario);//este es el insert
			em.getTransaction().commit();
			resultado = "1";
			System.out.println("Regitro insertado");
		} catch (Exception ex) {
			em.getTransaction().rollback();
			resultado = ex.getMessage();
			System.out.println("No pudo insertarse");

		}
		em.close();// es importante cerrarlo para liberar memoria

		return resultado;
	}

	@Override
	public String editar(Object ob) {
		inventario = (Inventario) ob;
		Inventario inventariodb = em.find(Inventario.class,inventario.getInventarioId());
		String r = null;
		em.getTransaction().begin();
		try {
			inventariodb.setInventarioId(inventariodb.getInventarioId());
			inventariodb.setProductoId(inventariodb.getProductoId());
			inventariodb.setStock(inventariodb.getStock());
			inventariodb.setFecha(inventariodb.getFecha());

			
			em.getTransaction().commit();
			System.out.println("Editado Correctamente");
			r="1";
			}catch(Exception ex) {
				em.getTransaction().rollback();
				System.out.println("No se pudo editar");
				r = ex.getMessage();
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
			System.out.println("Se ha eliminado el registo");
		}catch(Exception ex){
			em.getTransaction().rollback();
			System.out.println("No se pudo eliminar el registro");
			r = ex.getMessage();
			
		}
		return r;
	}

	@Override
	public Object buscar(int id) {
		inventario =em.find(Inventario.class, id);
		return inventario;
	}

	@Override
	public List mostrar() {
		List<Inventario> ls =em.createQuery("from Productos").getResultList();
		return ls;
	}



}
