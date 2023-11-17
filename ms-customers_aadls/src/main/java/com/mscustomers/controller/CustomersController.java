package com.mscustomers.controller;

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

import com.mscustomers.impl.CustomersLogic;
import com.mspersistence.entity.Customers;
import com.mspersistence.request.CustomersRequest;

@RestController
@RequestMapping("v1/clientes")
public class CustomersController{

	@Autowired
	CustomersLogic service;
	
	// http://localhost:8070/v1/productos (POST GUARDA)
	@PostMapping
	ResponseEntity<Customers> guardar(@RequestBody CustomersRequest request) {
		Customers cliente = service.guardar(request);
		return new ResponseEntity<Customers>(cliente, HttpStatus.OK);
	}

	// http://localhost:8070/v1/productos (PUT ACTUALIZA COMPLETAMENTE)
	@PutMapping
	ResponseEntity<Customers> actualizar(@RequestBody CustomersRequest request) {
		Customers cliente = service.actualizar(request);
		return new ResponseEntity<Customers>(cliente, HttpStatus.OK);
	}

	// http://localhost:8070/v1/productos (GET MUESTRA TODOS)
	@GetMapping
	ResponseEntity<List<Customers>> mostrar() {
		List<Customers> cliente = service.mostrar();
		return new ResponseEntity<List<Customers>>(cliente, HttpStatus.OK);
	}

	// http://localhost:8070/v1/productos/buscar-por-id/34 (GET BUSCA UNO EN
	// ESPECIFICO)
	@GetMapping("buscar-por-id/{id}")
	ResponseEntity<Customers> buscar(@PathVariable int id) {
		Customers cliente = service.buscar(id);
		return new ResponseEntity<Customers>(cliente, HttpStatus.OK);
	}

	@GetMapping("buscar-por-nombre/{nombre}")
	ResponseEntity<Customers> buscar(@PathVariable String nombre) {
		Customers cliente = service.buscar(nombre);
		return new ResponseEntity<Customers>(cliente, HttpStatus.OK);
	}
	
	// http://localhost:8070/v1/productos/eliminar/30 (DELETE ELIMINA)
	@DeleteMapping("eliminar/{id}")
	ResponseEntity<String> eliminar(@PathVariable int id) {
		String mensaje = service.eliminar(id);
		return new ResponseEntity<String>(mensaje, HttpStatus.OK);
	}

}
