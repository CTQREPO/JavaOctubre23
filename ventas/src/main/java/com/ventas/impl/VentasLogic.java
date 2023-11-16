package com.ventas.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.persistence.entity.Customers;
import com.persistence.entity.Empleados;
import com.persistence.entity.Ventas;
import com.persistence.repository.CustomersRepository;
import com.persistence.repository.EmpleadosRepository;
import com.persistence.repository.VentasRepository;

import com.persistence.request.VentasRequest;
import com.ventas.service.VentasService;
@Service
public class VentasLogic implements VentasService{
	@Autowired
	VentasRepository repo;
	//@Autowired
	//CustomersRepository customerRepo;
	@Autowired
	EmpleadosRepository empleadoRepo;
	
	RestTemplate plantilla = new RestTemplate();
	
	
	@Override
	public Ventas guardar(VentasRequest request) {
		
		//Customers customer = customerRepo.findById(request.getCliente().getClienteId()).get();
		System.out.println(request.getCliente().getClienteId());
		int customersId = request.getCliente().getClienteId();
		
		
		Empleados empleado = empleadoRepo.findById(request.getEmpleados().getEmpleadoId()).get();
		Customers customer = plantilla.getForObject("http://localhost:8096/v1/customers/buscar-por-id/"+customersId, Customers.class);
		
		Ventas v = new Ventas();
		
		v.setEmpleados(empleado);
		v.setCliente(customer);
		v.setFechaVenta(request.getFechaVenta());
		v.setSubtotal(request.getSubtotal());
		v.setTotal(request.getTotal());
	
		repo.save(v);
		
		
		return v;
	}

	@Override
	public Ventas actualizar(VentasRequest request) {
		Ventas v = repo.findById(request.getVentaId()).get();
		
		int customersId = request.getCliente().getClienteId();
		Empleados empleado = empleadoRepo.findById(request.getEmpleados().getEmpleadoId()).get();
		Customers customer = plantilla.getForObject("http://localhost:8096/v1/customers/buscar-por-id/"+customersId, Customers.class);
		Ventas ventas = new Ventas();
		
		ventas.setEmpleados(empleado);
		ventas.setCliente(customer);
		ventas.setFechaVenta(request.getFechaVenta());
		ventas.setSubtotal(request.getSubtotal());
		ventas.setTotal(request.getTotal());
		
		repo.save(v);
		
		return v;
		
		
	}

	@Override
	public Ventas buscar(int id) {
		return repo.findById(id).get();
	}

	@Override
	public Ventas buscar(String nombre) {
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
