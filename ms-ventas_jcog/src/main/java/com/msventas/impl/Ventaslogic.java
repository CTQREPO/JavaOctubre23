package com.msventas.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.msventas.service.Ventasservice;
import com.persistence.entity.PersistenceCustomers;
import com.persistence.entity.PersistenceEmpleados;
import com.persistence.entity.PersistenceVentas;
import com.persistence.repository.RepositoryCustomers;
import com.persistence.repository.RepositoryEmpleados;
import com.persistence.repository.RepositoryVentas;
import com.persistence.request.RequestVentas;

@Service
public class Ventaslogic implements Ventasservice {
	
	@Autowired
	RepositoryVentas repo;
	
	//@Autowired
	//RepositoryCustomers customerRepo;
	
	@Autowired
	RepositoryEmpleados empleadosRepo; //permite que desde dentro de un servicio me permita hacer llamadas de un microservicio a otro
	
	RestTemplate template = new RestTemplate();
	
	@Override
	public PersistenceVentas guardar(RequestVentas request) {
		
		//PersistenceCustomers customer = customerRepo.findById(request.getCustomer().getClienteId()).get();
		int customerId = request.getCustomer().getClienteId();
		PersistenceCustomers customer = template.getForObject("http://localhost:8096/v1/customers/buscar-por-id/"+customerId,PersistenceCustomers.class);
		
		PersistenceEmpleados empleados = empleadosRepo.findById(request.getEmpleado().getEmpleadoId()).get();
		PersistenceVentas v = new PersistenceVentas();
		v.setEmpleado(empleados);		
		
		v.setCustomer(customer);
		v.setFechaventa(request.getFechaventa());
		v.setSubtotal(request.getSubtotal());
		v.setTotal(request.getTotal());
		v.setVentaId(request.getVentaId());
		repo.save(v);
		return v;
	}

	@Override
	public PersistenceVentas actualizar(RequestVentas request) {
		
		//PersistenceCustomers customer = customerRepo.findById(request.getCustomer().getClienteId()).get();
		int customerId = request.getCustomer().getClienteId();
		PersistenceCustomers customer = template.getForObject("http://localhost:8096/v1/customers/buscar-por-id/"+customerId,PersistenceCustomers.class);
		
		PersistenceEmpleados empleados = empleadosRepo.findById(request.getEmpleado().getEmpleadoId()).get();
		PersistenceVentas v = repo.findById(request.getCustomer().getClienteId()).get();
		v.setEmpleado(empleados);		
		
		v.setCustomer(customer);
		v.setFechaventa(request.getFechaventa());
		v.setSubtotal(request.getSubtotal());
		v.setTotal(request.getTotal());
		v.setVentaId(request.getVentaId());
		repo.save(v);
		return v;
	}

	@Override
	public PersistenceVentas buscar(int id) { 
		return repo.findById(id).get();
	}

	@Override
	public PersistenceVentas buscar(String nombre) {
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
