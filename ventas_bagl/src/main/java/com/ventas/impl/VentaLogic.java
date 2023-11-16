package com.ventas.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.persistence.entity.Customer;
import com.persistence.entity.Empleado;
import com.persistence.entity.Venta;
import com.persistence.repository.CustomerRepository;
import com.persistence.repository.EmpleadoRepository;
import com.persistence.repository.VentaRepository;
import com.persistence.request.VentaRequest;
import com.ventas.service.VentaService;

@Service
public class VentaLogic implements VentaService{

	@Autowired
	VentaRepository repo;
	
	@Autowired
	EmpleadoRepository repoE;
	
//	@Autowired
//	CustomerRepository repoC;
	
	RestTemplate restTemplate = new RestTemplate();
	
	@Override
	public Venta guardar(VentaRequest request) {
		Venta venta = new Venta();
		
		Empleado empleado = repoE.findById(request.getEmpleado().getEmpleadoId()).get();
		//Customer customer = repoC.findById(request.getCustomer().getClienteId()).get();
		//La siguiente línea de código es muy importante
		Customer customer = restTemplate.getForObject("http://localhost:8096/v1/customer/buscar-por-id/"+request.getCustomer().getClienteId(), Customer.class);
		System.out.println(empleado);
		venta.setEmpleado(empleado);
		venta.setFechaVenta(request.getFechaVenta());
		venta.setSubtotal(request.getSubtotal());
		venta.setTotal(request.getTotal());
		venta.setCustomer(customer);
		
		repo.save(venta);
		
		return venta;
	}

	@Override
	public Venta actualizar(VentaRequest request) {

		Venta venta = repo.findById(request.getVentaId()).get();
		Empleado empleado = repoE.findById(request.getEmpleado().getEmpleadoId()).get();
		//Customer customer = repoC.findById(request.getCustomer().getClienteId()).get();
		//La siguiente línea de código es muy importante
		Customer customer = restTemplate.getForObject("http://localhost:8096/v1/customer/buscar-por-id/"+request.getCustomer().getClienteId(), Customer.class);
		System.out.println(empleado);
		venta.setEmpleado(empleado);
		venta.setFechaVenta(request.getFechaVenta());
		venta.setSubtotal(request.getSubtotal());
		venta.setTotal(request.getTotal());
		venta.setCustomer(customer);
		
		repo.save(venta);
		
		return venta;
	}

	@Override
	public Venta buscar(int id) {
		return repo.findById(id).get();
	}

	@Override
	public Venta buscar(String nombre) {

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
