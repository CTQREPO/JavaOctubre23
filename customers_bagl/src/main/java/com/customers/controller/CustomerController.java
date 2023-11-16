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

import com.customers.impl.CustomerLogic;
import com.persistence.entity.Customer;
import com.persistence.request.CustomerRequest;

@RestController
@RequestMapping("v1/customer")
public class CustomerController {

	
	@Autowired
	CustomerLogic service;
	
	//http://localhost:8096/v1/customer
	
	@PostMapping 
	 ResponseEntity<Customer> guardar(@RequestBody CustomerRequest request){ 
	  Customer customer = service.guardar(request); 
	  return new ResponseEntity<Customer>(customer,HttpStatus.OK); 
	 }  
	 
	//http://localhost:8096/v1/customer

	 @PutMapping 
	 ResponseEntity<Customer> actualizar(@RequestBody CustomerRequest request){ 
	  Customer customer = service.actualizar(request); 
	  return new ResponseEntity<Customer>(customer,HttpStatus.OK); 
	 } 
	 
		//http://localhost:8096/v1/customer

	 @GetMapping 
	 ResponseEntity<List<Customer>> mostrar(){ 
	  List<Customer> customer = service.mostrar(); 
	  return new ResponseEntity<List<Customer>>(customer,HttpStatus.OK); 
	 } 
	 
		//http://localhost:8096/v1/customer/buscar-por-id/{id}

	 @GetMapping("buscar-por-id/{id}") 
	 ResponseEntity<Customer> buscar(@PathVariable int id){ 
	  Customer customer = service.buscar(id); 
	  return new ResponseEntity<Customer>(customer,HttpStatus.OK); 
	 } 
	 
		//http://localhost:8096/v1/customer/eliminar/{id}

	 @DeleteMapping("eliminar/{id}") 
	 ResponseEntity<String> eliminar(@PathVariable int id){ 
	  String mensaje = service.eliminar(id); 
	  return new ResponseEntity<String>(mensaje,HttpStatus.OK); 
	 }
	 
	 
	//http://localhost:8096/v1/customer/buscar-por-nombre/{nombre}

		 @GetMapping("buscar-por-nombre/{nombre}") 
		 ResponseEntity<Customer> buscar(@PathVariable String nombre){ 
		  Customer customer = service.buscar(nombre); 
		  return new ResponseEntity<Customer>(customer,HttpStatus.OK); 
		 } 
}
