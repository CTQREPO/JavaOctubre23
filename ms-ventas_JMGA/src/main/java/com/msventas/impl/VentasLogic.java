package com.msventas.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.msventas.service.VentasServices;
import com.persistence.entity.Customers;
import com.persistence.entity.Empleados;
import com.persistence.entity.Ventas;
import com.persistence.repository.CustomersRepository;
import com.persistence.repository.EmpleadosRepository;
import com.persistence.repository.VentasRepository;
import com.persistence.request.VentasRequest;

@Service
public class VentasLogic implements VentasServices{
	@Autowired
	VentasRepository repo;
	
	/*@Autowired
	CustomersRepository customerRepo;
	*/
	@Autowired
	EmpleadosRepository empleadoRepo;
	
	RestTemplate template = new RestTemplate();//cliente http
	

	@Override
	public Ventas guardar(VentasRequest request) {
		
		//Customers customer = customerRepo.findById(request.getCliente().getClienteId()).get();
		int customerId = request.getCliente().getClienteId();
		Customers customer = template.getForObject("http://localhost:8096/v1/customers/buscar-por-id/"+customerId, Customers.class);//endpoint dinamico
		Empleados empleado = empleadoRepo.findById(request.getEmpleado().getEmpleadoId()).get();
		
		Ventas v = new Ventas();
		v.setEmpleado(empleado);

		v.setCliente(customer);
		
		v.setFechaVenta(request.getFechaVenta());
		v.setSubTotal(request.getSubTotal());
		v.setTotal(request.getTotal());
		repo.save(v);
		
		return v;
	}

	@Override
	public Ventas actualizar(VentasRequest request) {
		Ventas v =repo.findById(request.getVenta_Id()).get();
		int customerId = request.getCliente().getClienteId();
		//Customers customer = customerRepo.findById(request.getCliente().getClienteId()).get();
		Empleados empleado = empleadoRepo.findById(request.getEmpleado().getEmpleadoId()).get();
		Customers customer = template.getForObject("http://localhost:8096/v1/customers/buscar-por-id/"+customerId, Customers.class);
		v.setEmpleado(empleado);

		v.setCliente(customer);
		v.setFechaVenta(request.getFechaVenta());
		v.setSubTotal(request.getSubTotal());
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
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
