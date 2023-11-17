package com.msventas.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mspersistence.entity.Customers;
import com.mspersistence.entity.Empleados;
import com.mspersistence.entity.Ventas;
import com.mspersistence.repository.CustomersRepository;
import com.mspersistence.repository.EmpleadosRepository;
import com.mspersistence.repository.VentasRepository;
import com.mspersistence.request.VentasRequest;
import com.msventas.service.VentasService;

@Service
public class VentasLogic implements VentasService {

	@Autowired
	VentasRepository repo;
	
	/*@Autowired
	CustomersRepository customerRepo;
*/
	@Autowired
	EmpleadosRepository empleadoRepo;
	
	RestTemplate template = new RestTemplate(); //cliente http
	
	@Override
	public Ventas guardar(VentasRequest request) {
		// request es el objeto que viene desde el cliente-Frontend

		int customerId= request.getCliente().getClienteId();
		//Metodo de CustomerRepo
	//	Customers customer = customerRepo.findById(request.getCliente().getClienteId()).get();
		Customers customer = template.getForObject("http://localhost:8070/v1/clientes/buscar-por-id/"+customerId, Customers.class); //endpoint dinamico
		// Entidad nueva se llevara a la db
		Empleados empleado = empleadoRepo.findById(request.getEmpleado().getEmpleadoId()).get();
		Ventas v = new Ventas();
		
		v.setCliente(customer);
		v.setEmpleado(empleado);
		v.setFechaVenta(request.getFechaVenta());
		v.setSubtotal(request.getSubtotal());
		v.setTotal(request.getTotal());

		// aqui se guarda
		repo.save(v);

		return v;
	}

	@Override
	public Ventas actualizar(VentasRequest request) {
		Ventas v = repo.findById(request.getVentaId()).get();
		int customerId= request.getCliente().getClienteId();
		//Metodo de CustomerRepo
	//	Customers customer = customerRepo.findById(request.getCliente().getClienteId()).get();
		Customers customer = template.getForObject("http://localhost:8070/v1/ventas/buscar-por-id/"+customerId, Customers.class); //endpoint dinamico
		// Entidad nueva se llevara a la db
		Empleados empleado = empleadoRepo.findById(request.getEmpleado().getEmpleadoId()).get();
		
		v.setCliente(customer);
		v.setEmpleado(empleado);
		v.setFechaVenta(request.getFechaVenta());
		v.setSubtotal(request.getSubtotal());
		v.setTotal(request.getTotal());

		// aqui se guarda
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
