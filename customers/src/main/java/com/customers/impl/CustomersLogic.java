package com.customers.impl;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customers.service.CustomersService;
import com.persistence.entity.Customers;
import com.persistence.repository.CustomersRepository;
import com.persistence.request.CustomersRequest;


@Service
public class CustomersLogic  implements CustomersService{
	
	@Autowired
	CustomersRepository repo;
	

@Override
	
	public Customers guardar(CustomersRequest request) {
		//requets es el obejto que viene desde el cliente
		
		//entidad nueva, se llava a la db
		Customers c = new Customers();
		
		
		c.setNombre(request.getNombre());
		c.setFechaNac(request.getFechaNac());
		c.setDomicilio(request.getDomicilio());
		
		
		//Aqui se guarda
		repo.save(c);
		
		return c;
	}

@Override
public Customers actualizar(CustomersRequest request) {
	                            //pregunto por su id     tomar al opcional
	Customers c = repo.findById(request.getClienteId()).get();
    
   //Optional<Productos> p = repo.findById(request.getProductoId());
    
	c.setNombre(request.getNombre());
	c.setFechaNac(request.getFechaNac());
	c.setDomicilio(request.getDomicilio());
	
	
	//Aqui se guarda
	repo.save(c);
	
	return c;
    }


	@Override
	public Customers buscar(int id) {
		return repo.findById(id).get();
		
	}

	@Override
	public Customers buscar(String nombre) {
		// TODO Auto-generated method stub
		return repo.finByName(nombre).get();
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
