package com.empleados.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empleados.service.IEmpleadoService;
import com.persistence.entity.Empleados;
import com.persistence.repository.IEmpleadoRepository;
import com.persistence.request.EmpleadoRequest;

@Service
public class EmpleadoLogic implements IEmpleadoService {

	@Autowired
	IEmpleadoRepository repo;

	@Override
	public Empleados guardar(EmpleadoRequest request) {
		// El request es el objeto que viene desde el cliente

		// Entidad nueva, se llevara a la db
		Empleados e = new Empleados();

		e.setNombre(request.getNombre());
		e.setFechaIngreso(request.getFechaIngreso());
		e.setSalario(request.getSalario());

		// Aqui se guarda
		repo.save(e);

		return e;
	}

	@Override
	public Empleados actualizar(EmpleadoRequest request) {
		Empleados e = repo.findById(request.getEmpleadoId()).get();

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
		return repo.findAll();
	}

}
