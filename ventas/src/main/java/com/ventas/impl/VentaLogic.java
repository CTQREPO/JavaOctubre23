package com.ventas.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.persistence.entity.Customers;
import com.persistence.entity.Empleados;
import com.persistence.entity.Ventas;
import com.persistence.repository.ICustomerRepository;
import com.persistence.repository.IEmpleadoRepository;
import com.persistence.repository.IVentaRepository;
import com.persistence.request.VentaRequest;
import com.ventas.service.IVentaService;

@Service
public class VentaLogic implements IVentaService {

	@Autowired
	IVentaRepository repo;

	// @Autowired
	// ICustomerRepository crepo;

	@Autowired
	IEmpleadoRepository empl;

	RestTemplate template = new RestTemplate();

	@Override
	public Ventas guardar(VentaRequest request) {

		// El request es el objeto que viene desde el cliente

		// Entidad nueva, se llevara a la db

		// Customers customer =
		// crepo.findById(request.getCliente().getClienteId()).get();
		int customerId = request.getCliente().getClienteId();
		Customers customer = template.getForObject("http://localhost:8096/v1/customers/buscar-por-id/" + customerId,
				Customers.class);
		Empleados empleado = empl.findById(request.getEmpleado().getEmpleadoId()).get();
		Ventas v = new Ventas();

		v.setEmpleado(request.getEmpleado());
		v.setCliente(request.getCliente());
		v.setFechaVenta(request.getFechaVenta());
		v.setSubtotal(request.getSubtotal());
		v.setTotal(request.getTotal());

		// Aqui se guarda
		repo.save(v);
		return v;
	}

	@Override
	public Ventas actualizar(VentaRequest request) {

		// Customers customer =
		// crepo.findById(request.getCliente().getClienteId()).get();
		int customerId = request.getCliente().getClienteId();
		Customers customer = template.getForObject("http://localhost:8096/v1/customers/buscar-por-id/" + customerId,
				Customers.class);
		Empleados empleado = empl.findById(request.getEmpleado().getEmpleadoId()).get();
		Ventas v = repo.findById(request.getVentaId()).get();

		v.setEmpleado(request.getEmpleado());
		v.setCliente(request.getCliente());
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
