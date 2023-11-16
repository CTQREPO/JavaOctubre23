package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Productos;
import com.general.IMetodos;

public class ProductosDAO implements IMetodos {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");

	EntityManager em = emf.createEntityManager();

	Productos productos = null;

	@Override
	public String guardar(Object ob) {

		productos = (Productos) ob;
		em.getTransaction().begin();
		String resultado = null;
		try {
			em.persist(productos);//este es el insert
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
		productos = (Productos) ob;
		Productos productodb = em.find(Productos.class,productos.getProductosId());
		String r = null;
		em.getTransaction().begin();
		try {
			productodb.setDeptoId(productodb.getDeptoId());
			productodb.setNombre(productodb.getNombre());
			productodb.setFechaCad(productodb.getFechaCad());
			productodb.setPrecioCompra(productodb.getPrecioCompra());
			productodb.setPrecioVenta(productodb.getPrecioVenta());
			productodb.setRefrigerado(productodb.getRefrigerado());
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
		productos = em.find(Productos.class, id);
		em.getTransaction().begin();
		try {
			em.remove(productos);
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
		productos =em.find(Productos.class, id);
		return productos;
	}

	@Override
	public List mostrar() {
		List<Productos> ls =em.createQuery("from Productos").getResultList();
		return ls;
	}

}
