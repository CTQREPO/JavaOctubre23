package com.empleados.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.empleados.service.EmpleadoService;
import com.persistence.entity.Empleado;
import com.persistence.repository.EmpleadoRepository;
import com.persistence.request.EmpleadoRequest;

@Service
public class EmpleadoLogic implements EmpleadoService {

	@Autowired
	EmpleadoRepository repo;

	@Override
	public Empleado guardar(EmpleadoRequest request) {

		Empleado empleado = new Empleado();
		empleado.setNombre(request.getNombre());
		empleado.setFechaIngreso(request.getFechaIngreso());
		empleado.setSalario(request.getSalario());
		
		repo.save(empleado);
		return empleado;
	}

	@Override
	public Empleado actualizar(EmpleadoRequest request) {

		
		Empleado empleado = repo.findById(request.getEmpleadoId()).get();
		empleado.setNombre(request.getNombre());
		empleado.setFechaIngreso(request.getFechaIngreso());
		empleado.setSalario(request.getSalario());
		
		repo.save(empleado);
		return empleado;
	}

	@Override
	public Empleado buscar(int id) {
		
		return repo.findById(id).get();
	}

	@Override
	public Empleado buscar(String nombre) {
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
