package com.customers.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customers.service.ICustomersService;
import com.persistence.entity.Customers;
import com.persistence.repository.ICustomersRepository;
import com.persistence.request.CustomersRequest;


@Service
public class CustomersLogic implements ICustomersService {

	@Autowired  // 
	ICustomersRepository repo;
	
	@Override
	public Customers guardar(CustomersRequest request) {
		
		Customers c = new Customers();
		c.setNombre(request.getNombre());
		c.setFechaNac(request.getFechaNac());
		c.setDomicilio(request.getDomicilio());
		//Aqui se guarda el objeto
		repo.save(c);
		return c;
	}

	@Override
	public Customers actualizar(CustomersRequest request) {
		
		Customers c = repo.findById(request.getClienteId()).get();
		
		c.setNombre(request.getNombre());
		c.setFechaNac(request.getFechaNac());
		c.setDomicilio(request.getDomicilio());
		
		repo.save(c);
		return c;
	}

	@Override
	public Customers buscar(int id) {
		return repo.findById(id).get();
	}

	@Override
	public Customers buscar(String nombre) {
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
