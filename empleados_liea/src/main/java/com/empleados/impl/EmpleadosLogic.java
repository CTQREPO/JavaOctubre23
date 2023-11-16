package com.empleados.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empleados.service.EmpleadosService;
import com.persistence.entity.Empleados;
import com.persistence.repository.RepositoryEmpleados;
import com.persistence.request.RequestEmpleados;

@Service
public class EmpleadosLogic implements EmpleadosService {

	@Autowired
	RepositoryEmpleados repo;
	
	@Override
	public Empleados guardar(RequestEmpleados request) {
		
		Empleados e = new Empleados();
		
		e.setNombre(request.getNombre_empleado());
		e.setFecha_ingreso(request.getFechaIngr());
		e.setSalario(request.getSalario());
		
		
		repo.save(e);

		return e;
		
	}
	@Override
	public Empleados actualizar(RequestEmpleados request) {

		Empleados e = repo.findById(request.getEmpleadoId()).get();
		
		e.setNombre(request.getNombre_empleado());
		e.setFecha_ingreso(request.getFechaIngr());
		e.setSalario(request.getSalario());
		
		repo.save(e);
		return e; 
	}
	@Override
	public Empleados buscar(int id) {
		return repo.findById(id).get();
	}
	@Override
	public String eliminar(int id) {
		repo.deleteById(id);
		return "ELIMINADO";
	}
	
	@Override
	public List mostrar() {
		
		return repo.findAll();
		
	}
}
