package com.customers.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customers.service.CustomersService;
import com.persistence.entity.Customers;
import com.persistence.repository.RepositoryCustomers;
import com.persistence.request.RequestCustomers;

@Service
public class CustomersLogic implements CustomersService{

	@Autowired
	RepositoryCustomers repo;
	
	@Override
	public Customers guardar(RequestCustomers request) {
		
		Customers c = new Customers();
		
		c.setNombre(request.getNombre_cliente());
		c.setFecha_nac(request.getFecha_nac());
		c.setDomicilio(request.getDomicilio());
		
		
		repo.save(c);

		return c;
		
	}
	@Override
	public Customers actualizar(RequestCustomers request) {

		Customers c = repo.findById(request.getClienteId()).get();
		
		c.setNombre(request.getNombre_cliente());
		c.setFecha_nac(request.getFecha_nac());
		c.setDomicilio(request.getDomicilio());
		
		repo.save(c);
		return c; 
	}
	@Override
	public Customers buscar(int id) {
		return repo.findById(id).get();
	}
	
	
	@Override
	public String eliminar(int id) {
		repo.deleteById(id);
		return "ELIMINADO";
	}
	
	@Override
	public List mostrar() {
		
		return repo.findAll();
		
	}
	
	@Override
	public Customers buscar(String nombre) {
		return repo.findByName(nombre).get();
	}
}
