package com.msempleados.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msempleados.service.Empleadosservice;
import com.persistence.entity.PersistenceEmpleados;
import com.persistence.repository.RepositoryEmpleados;
import com.persistence.request.RequestEmpleados;

@Service
public class Empleadoslogic implements Empleadosservice {
	 
	@Autowired
	RepositoryEmpleados repo; 

	@Override
	public PersistenceEmpleados guardar(RequestEmpleados request) {
		PersistenceEmpleados e = new PersistenceEmpleados();
		e.setEmpleadoId(request.getEmpleadoId());
		e.setNombre(request.getNombre());
		e.setFechaingreso(request.getFechaingreso());
		e.setSalario(request.getSalario());
		repo.save(e);
		return e;
	} 

	@Override
	public PersistenceEmpleados actualizar(RequestEmpleados request) {
		PersistenceEmpleados e = repo.findById(request.getEmpleadoId()).get();
		e.setFechaingreso(request.getFechaingreso());
		e.setNombre(request.getNombre());
		e.setSalario(request.getSalario());
		repo.save(e);
		return e;
	}

	@Override
	public PersistenceEmpleados buscar(int id) {
		return repo.findById(id).get();
	} 

	@Override
	public PersistenceEmpleados buscar(String nombre) {
		// TODO Auto-generated method stub
		return null;
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