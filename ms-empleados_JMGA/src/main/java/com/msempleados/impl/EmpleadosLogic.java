package com.msempleados.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.msempleados.service.EmpleadosServices;
import com.persistence.entity.Empleados;
import com.persistence.repository.EmpleadosRepository;
import com.persistence.request.EmpleadosRequest;

@Service
public class EmpleadosLogic implements EmpleadosServices {
	@Autowired
	EmpleadosRepository repo;

	@Override
	public Empleados guardar(Empleados request) {
		Empleados e = new Empleados();
		e.setNombre(request.getNombre());
		e.setFechaIngreso(request.getFechaIngreso());
		e.setSalario(request.getSalario());
		repo.save(e);
		return e;
	}

	@Override
	public Empleados actualizar(EmpleadosRequest request) {
		Empleados e =repo.findById(request.getEmpleadoId()).get();
		e.setNombre(request.getNombre());
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
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
