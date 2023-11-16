package com.msventas.controller;

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

import com.msventas.impl.VentasLogic;
import com.persistence.entity.Ventas;
import com.persistence.request.VentasRequest;

@RestController
@RequestMapping("v1/ventas")
public class VentasController {
	@Autowired
	VentasLogic service;

	// http://localhost:8097/v1/ventas (POST GUARDA)

	@PostMapping
	ResponseEntity<Ventas> guardar(@RequestBody VentasRequest request) {
		Ventas prod = service.guardar(request);
		return new ResponseEntity<Ventas>(prod, HttpStatus.OK);
	}

	// http://localhost:8097/v1/ventas (PUT ACTUALIZAR COPLETAMENTE)
	@PutMapping
	ResponseEntity<Ventas> actualizar(@RequestBody VentasRequest request) {
		Ventas prod = service.actualizar(request);
		return new ResponseEntity<Ventas>(prod, HttpStatus.OK);
	}

	// http://localhost:8097/v1/ventas (GET ESTRA TODOS)
	@GetMapping
	ResponseEntity<List<Ventas>> mostrar() {
		List<Ventas> ventas = service.mostrar();
		return new ResponseEntity<List<Ventas>>(ventas, HttpStatus.OK);
	}

	// http://localhost:8097/v1/ventas/buscar-por-id/12 (GET BUSCA POR ID)
	@GetMapping("buscar-por-id/{id}")
	ResponseEntity<Ventas> buscar(@PathVariable int id) {
		Ventas prod = service.buscar(id);
		return new ResponseEntity<Ventas>(prod, HttpStatus.OK);
	}

	// http://localhost:8097/v1/ventas/eliminar/12 (DELETE POR ID)
	@DeleteMapping("eliminar/{id}")
	ResponseEntity<String> eliminar(@PathVariable int id) {
		String mensaje = service.eliminar(id);
		return new ResponseEntity<String>(mensaje, HttpStatus.OK);
	}
}
