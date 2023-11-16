package com.Customers.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Customers.service.ICustomersService;
import com.persitence.entity.Customers;
import com.persitence.repository.ICustomersRepository;
import com.persitence.request.CustomersRequest;

@Service
public class CustomersLogic implements ICustomersService {

	@Autowired // inyeccion de dependecias por atributo
	ICustomersRepository repo;
	
	@Override
	public Customers guardar(CustomersRequest request) {

		// request es el objeto que viene desde el cliente

		// Entidad nueva se llevara a la bd
		Customers p = new Customers();
		
		p.setNombre(request.getNombre());
		p.setFechanac(request.getFechanac());
		p.setDomicilio(request.getDomicilio());
		
	
		// Aqui se guarda
		repo.save(p);
		return p;
	}

	@Override
	public Customers actualizar(CustomersRequest request) {

		Customers p = repo.findById(request.getClienteId()).get();
		p.setNombre(request.getNombre());
		p.setFechanac(request.getFechanac());
		p.setDomicilio(request.getDomicilio());
		

		// Aqui se guarda
		repo.save(p);
		return p;
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
