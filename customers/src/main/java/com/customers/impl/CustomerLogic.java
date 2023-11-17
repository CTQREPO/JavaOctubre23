package com.customers.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customers.service.ICustomerService;
import com.persistence.entity.Customers;
import com.persistence.repository.ICustomerRepository;
import com.persistence.request.CustomerRequest;

@Service
public class CustomerLogic implements ICustomerService {

	@Autowired
	ICustomerRepository repo;

	@Override
	public Customers guardar(CustomerRequest request) {

		// El request es el objeto que viene desde el cliente

		// Entidad nueva, se llevara a la db
		Customers c = new Customers();

		c.setNombre(request.getNombre());
		c.setFechaNac(request.getFechaNac());
		c.setDomicilio(request.getDomicilio());

		// Aqui se guarda
		repo.save(c);

		return c;
	}

	@Override
	public Customers actualizar(CustomerRequest request) {

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
