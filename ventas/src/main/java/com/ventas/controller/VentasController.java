package com.ventas.controller;

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


import com.persistence.entity.Ventas;

import com.persistence.request.VentasRequest;
import com.ventas.impl.VentasLogic;

@RestController //para el consumo o la respuesta JSON
@RequestMapping("v1/ventas")
public class VentasController {
	
	@Autowired
	VentasLogic service;
	
	@PostMapping
	ResponseEntity<Ventas> guardar(@RequestBody VentasRequest request) {
		Ventas ventas = service.guardar(request);
		return new ResponseEntity<Ventas>(ventas, HttpStatus.OK);
	}
	
	
	@PutMapping
	ResponseEntity<Ventas> actualizar(@RequestBody VentasRequest request) {
		Ventas ventas = service.actualizar(request);
		return new ResponseEntity<Ventas>(ventas, HttpStatus.OK);
	}

	@GetMapping
	ResponseEntity<List<Ventas>> mostrar() {
		List<Ventas> ventas = service.mostrar();
		return new ResponseEntity<List<Ventas>>(ventas, HttpStatus.OK);
	}
	
	@GetMapping("buscar-por-id/{id}")
	ResponseEntity<Ventas> buscar(@PathVariable int id) {
		Ventas ventas = service.buscar(id);
		return new ResponseEntity<Ventas>(ventas, HttpStatus.OK);

}
	
	@DeleteMapping("eliminar/{id}")
	ResponseEntity<String> eliminar(@PathVariable int id) {
		String mensaje = service.eliminar(id);
		return new ResponseEntity<String>(mensaje, HttpStatus.OK);
	}
}

