package com.costumers.controller;

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

import com.costumers.impl.CostumersLogic;
import com.persistence.entity.Costumers;
import com.persistence.request.CostumerRequest;

@RestController
@RequestMapping("v1/clientes")
public class CostumersController {
	@Autowired
	CostumersLogic service;

//http://localhost:8096/v1/clientes           (POST GUARDA)
	@PostMapping 
	 ResponseEntity<Costumers> guardar(@RequestBody CostumerRequest request){ 
	  Costumers cost = service.guardar(request); 
	  return new ResponseEntity<Costumers>(cost,HttpStatus.OK); 
	 }  

	// http://localhost:8096/v1/clientes (PUT ACTUAIZA COMPLETAMENTE)
	@PutMapping
	ResponseEntity<Costumers> actualizar(@RequestBody CostumerRequest request) {
		Costumers cost = service.actualizar(request);
		return new ResponseEntity<Costumers>(cost, HttpStatus.OK);
	}

	// http://localhost:8096/v1/clientes (GET MOSTRAR TODOS)
	@GetMapping
	ResponseEntity<List<Costumers>> mostrar() {
		List<Costumers> cost = service.mostrar();
		return new ResponseEntity<List<Costumers>>(cost, HttpStatus.OK);
	}

	// http://localhost:8096/v1/clientes/buscar-por-nombre/nombre (GET BUSCA UNO ESPECIFICO)
	@GetMapping("buscar-por-nombre/{nombre}")
	ResponseEntity<Costumers> buscar(@PathVariable String nombre) {
		Costumers cost = service.buscar(nombre);
		return new ResponseEntity<Costumers>(cost, HttpStatus.OK);
	}

	// http://localhost:8096/v1/clientes/eliminar/30 (DELETE ELIMINA)
	@DeleteMapping("eliminar/{id}")
	ResponseEntity<String> eliminar(@PathVariable int id) {
		String mensaje = service.eliminar(id);
		return new ResponseEntity<String>(mensaje, HttpStatus.OK);
	}

}
