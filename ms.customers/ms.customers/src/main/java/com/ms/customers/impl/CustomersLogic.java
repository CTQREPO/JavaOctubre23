package com.ms.customers.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.customers.service.ICustomersService;
import com.ms.persistence.entity.Customers;
import com.ms.persistence.repository.ICustomersRrepository;
import com.ms.persistence.request.CustomersRequest;

@Service
public class CustomersLogic implements ICustomersService {

	@Autowired
	ICustomersRrepository repo;

	@Override
	public Customers guardar(CustomersRequest request) {
		Customers customer = new Customers();
		customer.setNombreCliente(request.getNombreCliente());
		customer.setFechaNacimiento(request.getFechaNacimiento());
		customer.setDomicilio(request.getDomicilio());
		repo.save(customer);
		return customer;
	}

	@Override
	public Customers actualizar(CustomersRequest request) {
		Customers customer = repo.findById(request.getClienteId()).get();
		customer.setNombreCliente(request.getNombreCliente());
		customer.setFechaNacimiento(request.getFechaNacimiento());
		customer.setDomicilio(request.getDomicilio());
		repo.save(customer);
		return null;
	}

	@Override
	public Customers buscar(int id) {
//		Optional<Customers> customers = repo.findById(id).get();
		
		return new Customers();
	}

	@Override
	public Customers buscar(String nombre) {
		return repo.findByName(nombre).get();
	}

	@Override
	public String eliminar(int id) {
		Optional<Customers> customers = repo.findById(id);
		String respuesta = null;
		if (customers.isPresent()) {
			customers.get().setStatus("0");
			respuesta = "Eliminado";
		} else {
			respuesta = "No esposbile eliminaar el registro";
		}
		repo.deleteById(id);
		return "Eliminado";
	}

	@Override
	public List mostrar() {
		return repo.findAll();
	}
}
