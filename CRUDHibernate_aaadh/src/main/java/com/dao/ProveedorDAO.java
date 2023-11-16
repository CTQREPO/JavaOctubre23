package com.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.entity.Proveedor;
import com.general.IMetodosJava;

public class ProveedorDAO implements IMetodosJava {
//Carga los objetos (las clases definidas en el persistence)
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	// Carga todas las operaciones (insert, update, delete, select, contar , etc)
	EntityManager em = emf.createEntityManager();
	Proveedor proveedor = null;
	@Override
	public String guardar(Object ob) {
		proveedor = (Proveedor) ob;
		em.getTransaction().begin();
		String resultado = null;
		try {
			em.persist(proveedor); // Este es el insert
			em.getTransaction().commit();
			resultado = "1";
			System.out.println("Registro insertado");
		} catch (Exception e) {
			em.getTransaction().rollback();
			resultado = e.getMessage();
			System.out.println("No pudo insertarse");
		}
		em.close();// Es importante cerrar el entity manager para que liberar memoria
		return resultado;
	}

	@Override
	public String editar(Object ob) {
		proveedor = (Proveedor) ob;
		Proveedor proveedordb = em.find(Proveedor.class, proveedor.getProveedorId());
		String r = null;
		em.getTransaction().begin();
		try {
			proveedordb.setNombre(proveedordb.getNombre());
			proveedordb.setTelefono(proveedordb.getTelefono());
			proveedordb.setCorreo(proveedordb.getCorreo());
			em.getTransaction().commit();
			System.out.println("Editado correctamente");
			r = "1";
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("No se pudo editar");
			r = e.getMessage();
		}
		return r;

	}

	@Override
	public String eliminar(int id) {
		String r = null;
		proveedor = em.find(Proveedor.class,id);
		em.getTransaction().commit();
		try {
			em.remove(proveedor);
			em.getTransaction().begin();
		System.out.println("Se ha eliminado registro");
		r = "1";
	}catch(Exception e) {
		em.getTransaction().rollback();
		System.out.println("No se pudo eliminar");
		r = e.getMessage();
	}
		return r;
}

	@Override
	public Object buscar(int id) {
		proveedor = em.find(Proveedor.class,id);
		return proveedor;
	}

	@Override
	public List mostrar() {
		List<Proveedor>ls = em.createQuery("from Proveedor").getResultList();
	return ls;
	}
	
}
