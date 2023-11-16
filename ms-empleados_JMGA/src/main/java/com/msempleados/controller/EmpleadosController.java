package com.msempleados.controller;

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

import com.msempleados.impl.EmpleadosLogic;

import com.persistence.entity.Empleados;

import com.persistence.request.EmpleadosRequest;

@RestController
@RequestMapping("v1/empleados")
public class EmpleadosController {

	@Autowired
	EmpleadosLogic service;

	// http://localhost:8098/v1/empleados
	@PostMapping
	ResponseEntity<Empleados> guardar(@RequestBody Empleados request) {
		Empleados cust = service.guardar(request);
		return new ResponseEntity<Empleados>(cust, HttpStatus.OK);
	}

	// http://localhost:8098/v1/empleados
	@PutMapping
	ResponseEntity<Empleados> actualizar(@RequestBody EmpleadosRequest request) {
		Empleados empl = service.actualizar(request);
		return new ResponseEntity<Empleados>(empl, HttpStatus.OK);
	}

	// http://localhost:8098/v1/empleados
	@GetMapping
	ResponseEntity<List<Empleados>> mostrar() {
		List<Empleados> empleados = service.mostrar();
		return new ResponseEntity<List<Empleados>>(empleados, HttpStatus.OK);
	}

	// http://localhost:8096/v1/empleados/buscar-por-id/{id}
	@GetMapping("buscar-por-id/{id}")
	ResponseEntity<Empleados> buscar(@PathVariable int id) {
		Empleados empl = service.buscar(id);
		return new ResponseEntity<Empleados>(empl, HttpStatus.OK);
	}

	@DeleteMapping("eliminar/{id}")
	ResponseEntity<String> eliminar(@PathVariable int id) {
		String mensaje = service.eliminar(id);
		return new ResponseEntity<String>(mensaje, HttpStatus.OK);
	}

}
