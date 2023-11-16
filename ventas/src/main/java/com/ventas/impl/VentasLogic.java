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
	@Autowired
	CustomersRepository custom;
	@Autowired
	EmpleadosRepository empleadoRepo;
	
	RestTemplate template = new RestTemplate(); 
	
	@Override
	public Ventas guardar(VentasRequest request) {
		// request es elo objeto que viene desde el cliente

		// Entidad nueva, se llevara a la bd
		int customerid = request.getCliente().getClienteId();
		Customers customer = template.getForObject("http://localhost:8096/v1/customers/buscar-por-id/"+customerid, Customers.class);
        Empleados empleado = empleadoRepo.findById(request.getEmpleado().getEmpleadoId()).get();
		
		Ventas p = new Ventas();

		p.setEmpleado(empleado);
		p.setCliente(customer);
		p.setFechaVenta(request.getFechaVenta());
		p.setSubtotal(request.getSubtotal());
		p.setTotal(request.getTotal());
		// aqui se guarda
		repo.save(p);

		return p;
	}
	
	
	@Override
	public Ventas actualizar(VentasRequest request) {
		int customerid = request.getCliente().getClienteId();
		Customers customer = template.getForObject("http://localhost:9096/v1/customers/buscar-por-id/"+customerid, Customers.class);
		Ventas p = repo.findById(request.getVentaId()).get();
		Empleados empleado = empleadoRepo.findById(request.getEmpleado().getEmpleadoId()).get();
		
		p.setEmpleado(empleado);
		p.setCliente(customer);
		p.setFechaVenta(request.getFechaVenta());
		p.setSubtotal(request.getSubtotal());
		p.setTotal(request.getTotal());

		// aqui se guarda
		repo.save(p);

		return p;
	}
	@Override
	public Ventas buscar(int id) {
		return repo.findById(id).get();
	}
	@Override
	public Ventas buscar(String nombre) {

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
