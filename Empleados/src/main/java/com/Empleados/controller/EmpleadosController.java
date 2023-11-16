package com.Empleados.controller;

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


import com.Empleados.impl.EmpleadosLogic;
import com.persitence.entity.Empleados;
import com.persitence.request.EmpleadosRequest;

@RestController
@RequestMapping("v1/empleados")
public class EmpleadosController {
	@Autowired
	EmpleadosLogic service;

	// http://localhost:8097/v1/empleados (POST GUARDA)

	@PostMapping
	ResponseEntity<Empleados> guardar(@RequestBody EmpleadosRequest request) {
		Empleados prod = service.guardar(request);
		return new ResponseEntity<Empleados>(prod, HttpStatus.OK);
	}

	// http://localhost:8097/v1/empleados (PUT ACTUALIZA COMPLETAMENTE)

	@PutMapping
	ResponseEntity<Empleados> actualizar(@RequestBody EmpleadosRequest request) {
		Empleados prod = service.actualizar(request);
		return new ResponseEntity<Empleados>(prod, HttpStatus.OK);
	}

	// http://localhost:8097/v1/empleados (GET MUESTRA TODOS)

	@GetMapping
	ResponseEntity<List<Empleados>> mostrar() {
		List<Empleados> Empleados = service.mostrar();
		return new ResponseEntity<List<Empleados>>(Empleados, HttpStatus.OK);
	}

	// http://localhost:8097/v1/empleados/buscar-por-id/30 (GET BUSCA UNO ESPECIFICADO)

	@GetMapping("buscar-por-id/{id}")
	ResponseEntity<Empleados> buscar(@PathVariable int id) {
		Empleados prod = service.buscar(id);
		return new ResponseEntity<Empleados>(prod, HttpStatus.OK);
	}

	// http://localhost:8097/v1/empleados/eliminar/30 (DELETE ELIMINA)

	@DeleteMapping("eliminar/{id}")
	ResponseEntity<String> eliminar(@PathVariable int id) {
		String mensaje = service.eliminar(id);
		return new ResponseEntity<String>(mensaje, HttpStatus.OK);
	}
	

}
