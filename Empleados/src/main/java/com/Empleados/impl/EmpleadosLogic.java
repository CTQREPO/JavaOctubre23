package com.Empleados.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Empleados.service.IEmpleadosServices;
import com.persitence.entity.Empleados;
import com.persitence.repository.IEmpleadosRepository;
import com.persitence.request.EmpleadosRequest;

@Service
public class EmpleadosLogic implements IEmpleadosServices {
	@Autowired // inyeccion de dependecias por atributo
	IEmpleadosRepository repo;
	
	@Override
	public Empleados guardar(EmpleadosRequest request) {

		// request es el objeto que viene desde el cliente

		// Entidad nueva se llevara a la bd
		Empleados p = new Empleados();
		p.setEmpleadoId(request.getEmpleadoId());
		p.setNombre(request.getNombre());
		p.setFechaingreso(request.getFechaingreso());
		p.setSalario(request.getSalario());
		
	
		// Aqui se guarda
		repo.save(p);
		return p;
	}

	@Override
	public Empleados actualizar(EmpleadosRequest request) {

		Empleados p = repo.findById(request.getEmpleadoId()).get();
		p.setNombre(request.getNombre());
		p.setFechaingreso(request.getFechaingreso());
		p.setSalario(request.getSalario());
		

		// Aqui se guarda
		repo.save(p);
		return p;
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
