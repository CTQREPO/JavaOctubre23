package com.ventas.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.persistence.entity.Customers;
import com.persistence.entity.Empleados;
import com.persistence.entity.Ventas;
import com.persistence.repository.RepositoryCustomers;
import com.persistence.repository.RepositoryEmpleados;
import com.persistence.repository.RepositoryVentas;
import com.persistence.request.RequestVentas;
import com.ventas.service.VentasService;





@Service
public class VentasLogic implements VentasService {

	@Autowired
	RepositoryVentas repo;
	
//	@Autowired
//	RepositoryCustomers customerRepo;
	
	@Autowired
	RepositoryEmpleados empleadoRepo;
	
	RestTemplate template = new RestTemplate(); ///ES UN CLIENTE 
	
	
	@Override
	public Ventas guardar(RequestVentas request) {
		
		int customerid = request.getCliente().getClienteId();
		Customers customer = template.getForObject("http://localhost:8096/v1/customers/buscar-por-id/"+customerid, Customers.class);
		Empleados empleado = empleadoRepo.findById(request.getEmpleado().getEmpleadoId()).get();
		
		Ventas v = new Ventas();
		
		v.setEmpleado(empleado);
		v.setCliente(customer);
		v.setFecha_venta(request.getFecha_venta());
		v.setSubtotal(request.getSubtotal());
		v.setTotal(request.getTotal());
		
		repo.save(v);

		return v;
		
	}
	@Override
	public Ventas actualizar(RequestVentas request) {
		
		int customerid = request.getCliente().getClienteId();
		
		Ventas v = repo.findById(request.getVentaId()).get();	
		Customers customer = template.getForObject("http://localhost:8096/v1/customers/buscar-por-id/"+customerid, Customers.class);
		Empleados empleado = empleadoRepo.findById(request.getEmpleado().getEmpleadoId()).get();
		
		v.setEmpleado(empleado);
		v.setCliente(customer);
		v.setFecha_venta(request.getFecha_venta());
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
	public String eliminar(int id) {
		repo.deleteById(id);
		return "ELIMINADO";
	}
	
	@Override
	public List mostrar() {
		
		return repo.findAll();
		
	}
}
