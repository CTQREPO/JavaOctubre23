package com.empleados.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empleados.service.EmpleadoService;
import com.persistence.entity.Empleados;

import com.persistence.repository.EmpleadosRepository;
import com.persistence.request.EmpleadoRequest;
@Service
public class EmpleadosLogic implements EmpleadoService {
	@Autowired
	EmpleadosRepository repo;

	@Override
	public Empleados guardar(EmpleadoRequest request) {
		Empleados e = new Empleados();

		e.setNombre(request.getNombre());
		e.setEmpleadoId(request.getEmpleadoId());
		e.setFechaNac(request.getFechaNac());
		e.setSalario(request.getSalario());

		repo.save(e);
		return e;
	}

	@Override
	public Empleados actualizar(EmpleadoRequest request) {
		Empleados e = repo.findById(request.getEmpleadoId()).get();

		e.setNombre(request.getNombre());
		e.setEmpleadoId(request.getEmpleadoId());
		e.setFechaNac(request.getFechaNac());
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