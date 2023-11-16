package com.customers.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customers.service.CustomersService;
import com.persistence.entity.Customers;
import com.persistence.repository.CustomersRepository;
import com.persistence.request.CustomersRequest;


@Service
public class CustomersLogic implements CustomersService{
	@Autowired
	CustomersRepository repo;
	
	@Override
	public Customers guardar(CustomersRequest request) {
		//request es elo objeto que viene desde el cliente
		
		//Entidad nueva, se llevara a la bd
		
		Customers p =  new Customers();
		
		p.setNombre(request.getNombre());
		p.setDomicilio(request.getDomicilio());
		p.setFechaNac(request.getFechaNac());
		
		//aqui se guarda 
		repo.save(p);
		
		return p;
	}
	@Override
	public Customers actualizar(CustomersRequest request) {
		
		Customers p =  repo.findById(request.getClienteId()).get();
		
		p.setNombre(request.getNombre());
		p.setDomicilio(request.getDomicilio());
		p.setFechaNac(request.getFechaNac());
		
		//aqui se guarda 
		repo.save(p);
		
		return p;
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
