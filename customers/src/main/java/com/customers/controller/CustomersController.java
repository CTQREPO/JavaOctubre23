package com.customers.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
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
import com.persistence.request.CustomersRequest;


@RestController //para el consumo o la respuesta JSON
@RequestMapping("v1/customers")
public class CustomersController {
	
	@Autowired
	CustomersLogic service;

	//http://localhost:8095/v1/customers              (POST GUARDA)
	@PostMapping
	ResponseEntity<Customers> guardar(@RequestBody CustomersRequest request) {
		Customers cust = service.guardar(request);
		return new ResponseEntity<Customers>(cust, HttpStatus.OK);
	}
	
	@PutMapping
	ResponseEntity<Customers> actualizar(@RequestBody CustomersRequest request) {
		Customers cust = service.actualizar(request);
		return new ResponseEntity<Customers>(cust, HttpStatus.OK);
	}
	
	@GetMapping
	ResponseEntity<List<Customers>> mostrar() {
		List<Customers> cust = service.mostrar();
		return new ResponseEntity<List<Customers>>(cust, HttpStatus.OK);
	}
	
	@GetMapping("buscar-por-id/{id}")
	ResponseEntity<Customers> buscar(@PathVariable int id) {
		Customers cust = service.buscar(id);
		return new ResponseEntity<Customers>(cust, HttpStatus.OK);
	}
		
		@GetMapping("buscar-por-nombre/{nombre}")
		ResponseEntity<Customers> buscar(@PathVariable String nombre) {
			Customers cust = service.buscar(nombre);
			return new ResponseEntity<Customers>(cust, HttpStatus.OK);
	}
	
	@DeleteMapping("eliminar/{id}")
	ResponseEntity<String> eliminar(@PathVariable int id) {
		String mensaje = service.eliminar(id);
		return new ResponseEntity<String>(mensaje, HttpStatus.OK);
	}
	
	
	
	
	
}
