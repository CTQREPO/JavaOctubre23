package com.customers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customers.impl.CustomersLogic;
import com.persistence.entity.Customers;
import com.persistence.request.RequestCustomers;

@RestController
@RequestMapping("v1/customers")
public class CustomersController {

	@Autowired
	CustomersLogic logic;
	
	
//////GUARDAR///////////	
	@PostMapping
	ResponseEntity<Customers>guardar(@RequestBody RequestCustomers request){
		Customers costu = logic.guardar(request);
		
		return new ResponseEntity<Customers>(costu,HttpStatus.OK);
		
	}
	
/////ACTUALIZAR///////	
	@PutMapping
	ResponseEntity<Customers>actualizar(@RequestBody RequestCustomers request){
		Customers costu = logic.actualizar(request);
		
		return new ResponseEntity<Customers>(costu,HttpStatus.OK);
		
	}
	
//////MOSTRAR//////
	
	
	@GetMapping
	ResponseEntity<List<Customers>>mostrar(){
		List<Customers> costu = logic.mostrar();
		return new ResponseEntity<List<Customers>>(costu,HttpStatus.OK);
	}
	
//////BUSCCAR//////
	@GetMapping("buscar-por-id/{id}")
	ResponseEntity<Customers>buscar(@PathVariable int id){
		Customers costu = logic.buscar(id);
		return new ResponseEntity<Customers>(costu,HttpStatus.OK);
	}

/////ELIMINAR/////
	@DeleteMapping("eliminar/{id}")
	ResponseEntity<String>eliminar(@PathVariable int id){
		String costu = logic.eliminar(id);
		return new ResponseEntity<String>(costu,HttpStatus.OK);
	}

//////buscar por nombre////////

	@GetMapping("buscar-por-nombre/{nombre}")
	ResponseEntity<Customers>buscar(@PathVariable String nombre){
		Customers costu = logic.buscar(nombre);
		return new ResponseEntity<Customers>(costu,HttpStatus.OK);
	}
}

