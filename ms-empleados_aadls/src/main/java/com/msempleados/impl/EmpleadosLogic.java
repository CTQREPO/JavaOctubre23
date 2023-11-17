package com.msempleados.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msempleados.service.EmpleadosService;
import com.mspersistence.entity.Empleados;
import com.mspersistence.repository.EmpleadosRepository;
import com.mspersistence.request.EmpleadosRequest;

@Service
public class EmpleadosLogic implements EmpleadosService {

	@Autowired
	EmpleadosRepository repo;

	@Override
	public Empleados guardar(EmpleadosRequest request) {
		// request es el objeto que viene desde el cliente-Frontend

		// Entidad nueva se llevara a la db
		Empleados e = new Empleados();

		e.setNombre(request.getNombre());
		e.setFechaIngreso(request.getFechaIngreso());
		e.setSalario(request.getSalario());
		// aqui se guarda
		repo.save(e);

		return e;
	}

	@Override
	public Empleados actualizar(EmpleadosRequest request) {// request es el objeto que viene desde el cliente-Frontend

		Empleados e = repo.findById(request.getEmpleadoId()).get();

		// Entidad nueva se llevara a la db
		e.setNombre(request.getNombre());
		e.setFechaIngreso(request.getFechaIngreso());
		e.setSalario(request.getSalario());
		// aqui se guarda
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
