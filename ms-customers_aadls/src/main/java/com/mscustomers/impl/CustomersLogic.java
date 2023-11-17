package com.mscustomers.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mscustomers.service.CustomersService;
import com.mspersistence.entity.Customers;
import com.mspersistence.repository.CustomersRepository;
import com.mspersistence.request.CustomersRequest;

@Service
public class CustomersLogic implements CustomersService{

	@Autowired
	CustomersRepository repo;
	
	@Override
	public Customers guardar(CustomersRequest request) {
		
		//request es el objeto que viene desde el cliente-Frontend
		
		//Entidad nueva se llevara a la db
		Customers c = new Customers();
		c.setDomicilio(request.getDomicilio());
		c.setFechaNac(request.getFechaNac());
		c.setNombre(request.getNombre());
		//aqui se guarda
		repo.save(c);
	
		return c;	
	}

	@Override
	public Customers actualizar(CustomersRequest request) {
		Customers c = repo.findById(request.getClienteId()).get();

		c.setDomicilio(request.getDomicilio());
		c.setFechaNac(request.getFechaNac());
		c.setNombre(request.getNombre());
		//aqui se guarda
		repo.save(c);
	
		return c;
	}

	@Override
	public Customers buscar(int id) {
		return repo.findById(id).get();
	}

	@Override
	public Customers buscar(String nombre) {
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
