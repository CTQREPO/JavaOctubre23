package com.Customers.controller;

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

import com.Customers.impl.CustomersLogic;
import com.persitence.entity.Customers;
import com.persitence.request.CustomersRequest;



@RestController
@RequestMapping("v1/customers")
public class CustomersController {
	
	@Autowired
	CustomersLogic service;

	// http://localhost:8096/v1/customers (POST GUARDA)

	@PostMapping
	ResponseEntity<Customers> guardar(@RequestBody CustomersRequest request) {
		Customers prod = service.guardar(request);
		return new ResponseEntity<Customers>(prod, HttpStatus.OK);
	}

	// http://localhost:8095/v1/productos (PUT ACTUALIZA COMPLETAMENTE)

	@PutMapping
	ResponseEntity<Customers> actualizar(@RequestBody CustomersRequest request) {
		Customers prod = service.actualizar(request);
		return new ResponseEntity<Customers>(prod, HttpStatus.OK);
	}

	// http://localhost:8096/v1/customers (GET MUESTRA TODOS)

	@GetMapping
	ResponseEntity<List<Customers>> mostrar() {
		List<Customers> customers = service.mostrar();
		return new ResponseEntity<List<Customers>>(customers, HttpStatus.OK);
	}

	// http://localhost:8096/v1/customers/buscar-por-id/30 (GET BUSCA UNO ESPECIFICADO)

	@GetMapping("buscar-por-id/{id}")
	ResponseEntity<Customers> buscar(@PathVariable int id) {
		Customers prod = service.buscar(id);
		return new ResponseEntity<Customers>(prod, HttpStatus.OK);
	}
	
	//http://localhost:8096/v1/customers/buscar-por-nombre/JORGE (GET BUSCA UNO ESPECIFICADO)
	@GetMapping("buscar-por-nombre/{nombre}")
	ResponseEntity<Customers> buscar(@PathVariable String nombre) {
		Customers prod = service.buscar(nombre);
		return new ResponseEntity<Customers>(prod, HttpStatus.OK);
	}

	// http://localhost:8096/v1/customers/eliminar/30 (DELETE ELIMINA)

	@DeleteMapping("eliminar/{id}")
	ResponseEntity<String> eliminar(@PathVariable int id) {
		String mensaje = service.eliminar(id);
		return new ResponseEntity<String>(mensaje, HttpStatus.OK);
	}
	

}
