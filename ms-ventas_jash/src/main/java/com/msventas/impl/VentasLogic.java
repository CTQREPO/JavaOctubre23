package com.msventas.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.msventas.service.VentasService;
import com.persistence.entity.Customers;
import com.persistence.entity.Empleados;
import com.persistence.entity.Ventas;
import com.persistence.repository.CustomersRepository;
import com.persistence.repository.EmpleadosRepository;
import com.persistence.repository.VentasRepository;
import com.persistence.request.VentasRequest;

@Service
public class VentasLogic implements VentasService {
	
	@Autowired
	VentasRepository repo;
//	@Autowired
//	CustomersRepository custrepo;
	@Autowired
	EmpleadosRepository emplrepo;
	
	RestTemplate template = new RestTemplate();
	
	@Override
	public Ventas guardar(VentasRequest request) {
		//Customers customer = custrepo.findById(request.getCliente().getClienteId()).get();
		int customersId = request.getCliente().getClienteId();
		Customers customer = template.getForObject("http://localhost:8096/v1/customers/buscar-por-id/"+customersId,Customers.class);
		Empleados empleado = emplrepo.findById(request.getEmpleado().getEmpleadoId()).get();
		Ventas v = new Ventas();
		v.setEmpleado(empleado);
		v.setCliente(customer);
		v.setFechaVenta(request.getFechaVenta());
		v.setSubtotal(request.getSubtotal());
		v.setTotal(request.getTotal());
		//aqui se guarda el objeto
		repo.save(v);
		return v;
	}

	@Override
	public Ventas actualizar(VentasRequest request) {
		//Customers customer = custrepo.findById(request.getCliente().getClienteId()).get();
		int customersId = request.getCliente().getClienteId();
		Customers customer = template.getForObject("http://localhost:8096/v1/customers/buscar-por-id/"+customersId,Customers.class);
		Empleados empleado = emplrepo.findById(request.getEmpleado().getEmpleadoId()).get();
		Ventas v = repo.findById(request.getVentaId()).get();
		v.setEmpleado(empleado);
		v.setCliente(customer);
		v.setFechaVenta(request.getFechaVenta());
		v.setSubtotal(request.getSubtotal());
		v.setTotal(request.getTotal());
		//aqui se guarda el objeto
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
