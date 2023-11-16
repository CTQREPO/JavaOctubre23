package com.empleados.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empleados.service.EmpleadosService;
import com.persistence.entity.Empleados;

import com.persistence.repository.EmpleadosRepository;
import com.persistence.request.EmpleadosRequest;


@Service
public class EmpleadosLogic implements EmpleadosService {
	@Autowired
	EmpleadosRepository repo;
	
	@Override
	public Empleados guardar(EmpleadosRequest request) {
		Empleados e = new Empleados();
		
		e.setNombre(request.getNombre());
		e.setEmpleadoId(request.getEmpleadoId());
		e.setFechaIngreso(request.getFechaIngreso());
		e.setSalario(request.getSalario());
		
		repo.save(e);
		return e;
	}

	@Override
	public Empleados actualizar(EmpleadosRequest request) {
		Empleados e = repo.findById(request.getEmpleadoId()).get();
		
		e.setNombre(request.getNombre());
		e.setEmpleadoId(request.getEmpleadoId());
		e.setFechaIngreso(request.getFechaIngreso());
		e.setSalario(request.getSalario());
		
		 repo.save(e);
		 
		 return e;
	}

	@Override
	public Empleados buscar(int id) {
		return repo.findById(id).get();
	}

	@Override
	public Empleados buscar(String nombre) {
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
