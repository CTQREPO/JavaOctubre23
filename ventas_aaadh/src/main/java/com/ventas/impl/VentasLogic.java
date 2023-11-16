package com.ventas.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.persistence.entity.Costumers;
import com.persistence.entity.Empleados;
import com.persistence.entity.Ventas;
import com.persistence.repository.CostumerRepository;
import com.persistence.repository.EmpleadoRepository;
import com.persistence.repository.VentasRepository;
import com.persistence.request.VentasRequest;
import com.ventas.services.VentasService;

@Service
public class VentasLogic implements VentasService {
	
	@Autowired
	VentasRepository repo;
	
//	@Autowired
//	CostumerRepository costumerRepo;
	@Autowired
	EmpleadoRepository empleadoRepo;
	
	RestTemplate plantilla = new RestTemplate();
	
	@Override
	public Ventas guardar (VentasRequest request) {
//    	Costumers costumers= costumerRepo.findById(request.getCliente().getCliente_Id().get());
		int cliente_Id = request.getCliente().getCliente_Id();
		
		Costumers costumers = plantilla.getForObject("http://localhost:8097/v1/clientes/buscar-por-id/"+ cliente_Id,Costumers.class);         
		Empleados empleado = empleadoRepo.findById(request.getEmpleado().getEmpleado_Id()).get();
		Ventas v = new Ventas();
		
		
		v.setCliente(costumers);
		v.setEmpleado(empleado);
		v.setFechaventa(request.getFecha_venta());
		v.setSubtotal(request.getSubtotal());
		v.setTotal(request.getSubtotal());
		
		repo.save(v);
		return v;
	}

	@Override
	public Ventas actualizar(VentasRequest request) {
		// Entidad nueva se llevara a base de datos
		Ventas v = repo.findById(request.getVenta_Id()).get();

		v.setCliente(request.getCliente());
		v.setEmpleado(request.getEmpleado());
		v.setFechaventa(request.getFecha_venta());
		v.setSubtotal(request.getSubtotal());
		v.setTotal(request.getSubtotal());
		
		repo.save(v);
		return v;
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
