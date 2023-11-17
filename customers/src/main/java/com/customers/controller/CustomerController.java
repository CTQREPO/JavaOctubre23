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
import com.persistence.entity.Customers;
import com.persistence.request.CustomerRequest;

@RestController
@RequestMapping("v1/customers")
public class CustomerController {

	@Autowired
	CustomerLogic service;
	
	// http://localhost:8096/v1/customers (POST GUARDA)

		@PostMapping
		ResponseEntity<Customers> guardar(@RequestBody CustomerRequest request) {
			Customers cust = service.guardar(request);
			return new ResponseEntity<Customers>(cust, HttpStatus.OK);
		}

		// http://localhost:8096/v1/customers (PUT ACTUALIZA COMPLETAMENTE)
		@PutMapping
		ResponseEntity<Customers> actualizar(@RequestBody CustomerRequest request) {
			Customers cust = service.actualizar(request);
			return new ResponseEntity<Customers>(cust, HttpStatus.OK);
		}

		@GetMapping
		// http://localhost:8096/v1/customers (GET MUESTRA TODOS)
		ResponseEntity<List<Customers>> mostrar() {
			List<Customers> customers = service.mostrar();
			return new ResponseEntity<List<Customers>>(customers, HttpStatus.OK);
		}

		// http://localhost:8096/v1/customers/buscar-por-id/30 (GET BUSCA UNO EN
		// ESPECIFICO)
		@GetMapping("buscar-por-id/{id}")
		ResponseEntity<Customers> buscar(@PathVariable int id) {
			Customers cust = service.buscar(id);
			return new ResponseEntity<Customers>(cust, HttpStatus.OK);
		}
		
		// http://localhost:8096/v1/customers/buscar-por-nombre/nombre(GET BUSCA UNO EN
				// ESPECIFICO)
				@GetMapping("buscar-por-nombre/{nombre}")
				ResponseEntity<Customers> buscar(@PathVariable String nombre) {
					Customers cust = service.buscar(nombre);
					return new ResponseEntity<Customers>(cust, HttpStatus.OK);
				}

		// http://localhost:8096/v1/customers/eliminar/30 (DELETE ELIMINA)
		@DeleteMapping("eliminar/{id}")
		ResponseEntity<String> eliminar(@PathVariable int id) {
			String mensaje = service.eliminar(id);
			return new ResponseEntity<String>(mensaje, HttpStatus.OK);
		}
}
