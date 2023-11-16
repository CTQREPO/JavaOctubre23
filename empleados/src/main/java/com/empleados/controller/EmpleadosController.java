package com.empleados.controller;

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


import com.empleados.impl.EmpleadosLogic;
import com.persistence.entity.Empleados;
import com.persistence.request.EmpleadosRequest;


@RestController //para el consumo o la respuesta JSON
@RequestMapping("v1/empleados")
public class EmpleadosController {
	@Autowired
	EmpleadosLogic service;
	@PostMapping
	ResponseEntity<Empleados> guardar(@RequestBody EmpleadosRequest request) {
		Empleados cust = service.guardar(request);
		return new ResponseEntity<Empleados>(cust, HttpStatus.OK);
	}
	
	@PutMapping
	ResponseEntity<Empleados> actualizar(@RequestBody EmpleadosRequest request) {
		Empleados cust = service.actualizar(request);
		return new ResponseEntity<Empleados>(cust, HttpStatus.OK);
	}
	
	@GetMapping
	ResponseEntity<List<Empleados>> mostrar() {
		List<Empleados> cust = service.mostrar();
		return new ResponseEntity<List<Empleados>>(cust, HttpStatus.OK);
	}
	
	@GetMapping("buscar-por-id/{id}")
	ResponseEntity<Empleados> buscar(@PathVariable int id) {
		Empleados cust = service.buscar(id);
		return new ResponseEntity<Empleados>(cust, HttpStatus.OK);
	}
	@DeleteMapping("eliminar/{id}")
	ResponseEntity<String> eliminar(@PathVariable int id) {
		String mensaje = service.eliminar(id);
		return new ResponseEntity<String>(mensaje, HttpStatus.OK);
	}
	
}
