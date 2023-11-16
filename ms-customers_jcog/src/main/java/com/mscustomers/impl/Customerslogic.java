package com.mscustomers.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mscustomers.service.Customersservice;
import com.persistence.entity.PersistenceCustomers;
import com.persistence.repository.RepositoryCustomers;
import com.persistence.request.RequestCustomers;

@Service
public class Customerslogic implements Customersservice {
	
	@Autowired
	RepositoryCustomers repo;
	 
	@Override
	public PersistenceCustomers guardar(RequestCustomers request) { 
		PersistenceCustomers c = new PersistenceCustomers();
		c.setClienteId(request.getClienteId());
		c.setNombre(request.getNombre());
		c.setFechanac(request.getFechanac());
		c.setDomicilio(request.getDomicilio());
		
		repo.save(c);
		return c;
	}

	@Override
	public PersistenceCustomers actualizar(RequestCustomers request) {
		PersistenceCustomers c = repo.findById(request.getClienteId()).get();
		c.setNombre(request.getNombre());
		c.setFechanac(request.getFechanac());
		c.setDomicilio(request.getDomicilio());
		
		repo.save(c); 
		return c;
	}

	@Override
	public PersistenceCustomers buscar(int id) {
		return repo.findById(id).get(); 
	} 

	@Override
	public PersistenceCustomers buscar(String nombre) {
		// TODO Auto-generated method stub
		return repo.findByName(nombre).get();
	}

	@Override
	public String eliminar(int id) {
		repo.deleteById(id);
		return "Eliminado";
	}

	@Override
	public List mostrar() {
		return repo.findAll(); 
	}

}
