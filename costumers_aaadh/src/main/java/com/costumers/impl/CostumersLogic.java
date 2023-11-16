package com.costumers.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.costumers.service.CostumersService;
import com.persistence.entity.Costumers;
import com.persistence.repository.CostumerRepository;
import com.persistence.request.CostumerRequest;

@Service
public class CostumersLogic implements CostumersService {

	@Autowired
	CostumerRepository repo;

	@Override
	public Costumers guardar(CostumerRequest request) {

		Costumers c = new Costumers();

		c.setNombre(request.getNombre());
		c.setFechaNac(request.getFecha_nacimiento());
		c.setDomicilio(request.getDomicilio());

		repo.save(c);
		return c;
	}

	@Override
	public Costumers actualizar(CostumerRequest request) {
		// Entidad nueva se llevara a base de datos
		Costumers c = repo.findById(request.getClienteId()).get();

		c.setNombre(request.getNombre());
		c.setFechaNac(request.getFecha_nacimiento());
		c.setDomicilio(request.getDomicilio());

		repo.save(c);
		return c;
	}

	@Override
	public Costumers buscar(int id) {
		return repo.findById(id).get();
	}

	@Override
	public Costumers buscar(String nombre) {

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
