package com.Ventas.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.Ventas.service.IVentasService;
import com.persitence.entity.Customers;
import com.persitence.entity.Empleados;
import com.persitence.entity.Ventas;
import com.persitence.repository.ICustomersRepository;
import com.persitence.repository.IEmpleadosRepository;
import com.persitence.repository.IVentasRepository;
import com.persitence.request.VentasRequest;

@Service
public class VentasLogic implements IVentasService {
	@Autowired // inyeccion de dependecias por atributo
	IVentasRepository repo;
	
//	@Autowired
//	ICustomersRepository crepo; 
	@Autowired
	IEmpleadosRepository erepo;
	
	RestTemplate template = new RestTemplate() ;

	@Override
	public Ventas guardar(VentasRequest request) {

		// request es el objeto que viene desde el cliente

		// Entidad nueva se llevara a la bd
		Ventas p = new Ventas();
//		Customers customer = crepo.findById(request.getCliente().getClienteId()).get();
		int customerid = request.getCliente().getClienteId();
		Customers customer = template.getForObject("http://localhost:8096/v1/customers/buscar-por-id/"+customerid, Customers.class);//endpoint dinamico

		Empleados empleado = erepo.findById(request.getEmpleado().getEmpleadoId()).get();
		p.setEmpleado(empleado);
		p.setCliente(customer);
		p.setFechaventa(request.getFechaventa());
		p.setSubtotal(request.getSubtotal());
		p.setTotal(request.getTotal());

		// Aqui se guarda
		repo.save(p);
		return p;
	}

	@Override
	public Ventas actualizar(VentasRequest request) {

		Ventas p = repo.findById(request.getVentaId()).get();
		//Customers customer = crepo.findById(request.getCliente().getClienteId()).get();
		int customerid = request.getCliente().getClienteId();
		Empleados empleado = erepo.findById(request.getEmpleado().getEmpleadoId()).get();
		Customers customer = template.getForObject("http://localhost:8096/v1/customers/buscar-por-id/"+customerid, Customers.class);
		
		p.setEmpleado(empleado);
		p.setCliente(customer);
		p.setFechaventa(request.getFechaventa());
		p.setSubtotal(request.getSubtotal());
		p.setTotal(request.getTotal());

		// Aqui se guarda
		repo.save(p);
		return p;
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
