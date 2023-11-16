package com.empleados.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empleados.service.EmpleadosService;
import com.persistence.entity.Empleados;
import com.persistence.repository.EmpleadoRepository;
import com.persistence.request.EmpleadoRequest;

@Service
public class EmpleadosLogic implements EmpleadosService {

	@Autowired
	EmpleadoRepository repo;
	
	@Override
	public Empleados guardar (EmpleadoRequest request) {
		Empleados e = new Empleados ();
		
		e.setNombre(request.getNombre());
		e.setFecha_ingreso(request.getFecha_ingreso());
		e.setSalario(request.getSalario());

		repo.save (e);
		return e ;
	
	}
	
	@Override
	public Empleados actualizar(EmpleadoRequest request) {
		// Entidad nueva se llevara a base de datos
		Empleados e = repo.findById(request.getEmpleadoId()).get();
		
		e.setNombre(request.getNombre());
		e.setFecha_ingreso(request.getFecha_ingreso());
		e.setSalario(request.getSalario());

		repo.save (e);
		return e ;
	}

	@Override
	public Empleados buscar(int id) {
		return repo.findById(id).get();
	}

	@Override
	public Empleados buscar(String nombre) {

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
