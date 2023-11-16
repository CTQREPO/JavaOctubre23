package com.ms.customers.controller;

import java.util.List;

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

import com.ms.customers.impl.CustomersLogic;
import com.ms.persistence.entity.Customers;
import com.ms.persistence.request.CustomersRequest;

@RestController
@RequestMapping("v1/customers")
public class CustomersController {
	CustomersLogic logic;

	// http://localhost:8090/v1/customers (POST GUARDA)
	@PostMapping
	ResponseEntity<Customers> guardar(@RequestBody CustomersRequest request) {
		Customers customers = logic.guardar(request);
		return new ResponseEntity<Customers>(customers, HttpStatus.OK);
	}

	@PutMapping
	ResponseEntity<Customers> actualizar(@RequestBody CustomersRequest request) {
		Customers customers = logic.actualizar(request);
		return new ResponseEntity<Customers>(customers, HttpStatus.OK);
	}

	// http://localhost:8090/v1/customers (GET MUESTRA TODOS)
	@GetMapping
	ResponseEntity<List<Customers>> mostrar() {
		List<Customers> customers = logic.mostrar();
		return new ResponseEntity<List<Customers>>(customers, HttpStatus.OK);
	}

	@GetMapping("buscar-por-id/{id}")
	ResponseEntity<Customers> buscar(@PathVariable int id) {
		Customers customers = logic.buscar(id);
		return new ResponseEntity<Customers>(customers, HttpStatus.OK);
	}

	@GetMapping("buscar-por-nombre/{nombre}")
	ResponseEntity<Customers> buscar(@PathVariable String nombre) {
		Customers customers = logic.buscar(nombre);
		return new ResponseEntity<Customers>(customers, HttpStatus.OK);
	}

	@DeleteMapping("eliminar/{id}")
	ResponseEntity<String> eliminar(@PathVariable int id) {
		String mensaje = logic.eliminar(id);
		return new ResponseEntity<String>(mensaje, HttpStatus.OK);
	}
}
