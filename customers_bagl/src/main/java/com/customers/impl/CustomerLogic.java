package com.customers.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customers.service.CustomerService;
import com.persistence.entity.Customer;
import com.persistence.repository.CustomerRepository;
import com.persistence.request.CustomerRequest;

@Service
public class CustomerLogic implements CustomerService{

	
	@Autowired
	CustomerRepository repo;

	@Override
	public Customer guardar(CustomerRequest request) {

		Customer customer = new Customer();
		customer.setDomicilio(request.getDomicilio());
		customer.setNombre(request.getNombre());
		customer.setFechaNac(request.getFechaNac());
		repo.save(customer);
		
		return customer;
	}

	@Override
	public Customer actualizar(CustomerRequest request) {

		Customer customer = repo.findById(request.getClienteId()).get();
		customer.setDomicilio(request.getDomicilio());
		customer.setNombre(request.getNombre());
		customer.setFechaNac(request.getFechaNac());
		repo.save(customer);
		
		return customer;
	}

	@Override
	public Customer buscar(int id) {
		
		Customer customer = repo.findById(id).get();
		return customer;
	}

	@Override
	public Customer buscar(String nombre) {

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
