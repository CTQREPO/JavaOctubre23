package com.ventas.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.persistence.entity.Customers;
import com.persistence.entity.Empleados;
import com.persistence.entity.Ventas;
import com.persistence.repository.ICustomersRepository;
import com.persistence.repository.IEmpleadosRepository;
import com.persistence.repository.IVentasRepository;
import com.persistence.request.VentasRequest;
import com.ventas.service.IVentasService;


@Service
public class VentasLogic implements IVentasService{

	@Autowired  // 
	IVentasRepository repo;
	//@Autowired
	//ICustomersRepository customersRepo;
	@Autowired
	IEmpleadosRepository empleadoRepo;
	
	RestTemplate template= new RestTemplate();

	@Override
	public Ventas guardar(VentasRequest request) {
		
		//Customers customer = customersRepo.findById(request.getCliente().getClienteId()).get();
		int customerId = request.getCliente().getClienteId();
		Customers customer = template.getForObject("http://localhost:8096/v1/customers/buscar-por-id/"+customerId, Customers.class);
		Empleados empleado = empleadoRepo.findById(request.getEmpleado().getEmpleadoId()).get();
		
		Ventas v = new Ventas();
		v.setEmpleado(empleado);
		v.setCliente(customer);
		v.setFechaVenta(request.getFechaVenta());
		v.setSubtotal(request.getSubtotal());
		v.setTotal(request.getTotal());
		repo.save(v);
		return v;
	}

	@Override
	public Ventas actualizar(VentasRequest request) {
		
		//Customers customer = customersRepo.findById(request.getCliente().getClienteId()).get();
		int customerId = request.getCliente().getClienteId();
		Customers customer = template.getForObject("http://localhost:8096/v1/customers/buscar-por-id/"+customerId, Customers.class);
		Empleados empleado = empleadoRepo.findById(request.getEmpleado().getEmpleadoId()).get();
		
		Ventas v = repo.findById(request.getVentaId()).get();
		
		v.setEmpleado(empleado);
		v.setCliente(customer);
		v.setFechaVenta(request.getFechaVenta());
		v.setSubtotal(request.getSubtotal());
		v.setTotal(request.getTotal());
		
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

