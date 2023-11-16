package com.Ventas.controller;

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

import com.Ventas.impl.VentasLogic;
import com.persitence.entity.Ventas;
import com.persitence.request.VentasRequest;



@RestController
@RequestMapping("v1/ventas")
public class VentasController {
	@Autowired
	VentasLogic service;

	// http://localhost:8098/v1/ventas (POST GUARDA)

	@PostMapping
	ResponseEntity<Ventas> guardar(@RequestBody VentasRequest request) {
		Ventas prod = service.guardar(request);
		return new ResponseEntity<Ventas>(prod, HttpStatus.OK);
	}

	// http://localhost:8098/v1/ventas (PUT ACTUALIZA COMPLETAMENTE)

	@PutMapping
	ResponseEntity<Ventas> actualizar(@RequestBody VentasRequest request) {
		Ventas prod = service.actualizar(request);
		return new ResponseEntity<Ventas>(prod, HttpStatus.OK);
	}

	// http://localhost:8098/v1/ventas (GET MUESTRA TODOS)

	@GetMapping
	ResponseEntity<List<Ventas>> mostrar() {
		List<Ventas> productos = service.mostrar();
		return new ResponseEntity<List<Ventas>>(productos, HttpStatus.OK);
	}

	// http://localhost:8098/v1/ventas/buscar-por-id/30 (GET BUSCA UNO ESPECIFICADO)

	@GetMapping("buscar-por-id/{id}")
	ResponseEntity<Ventas> buscar(@PathVariable int id) {
		Ventas prod = service.buscar(id);
		return new ResponseEntity<Ventas>(prod, HttpStatus.OK);
	}

	// http://localhost:8098/v1/ventas/30 (DELETE ELIMINA)

	@DeleteMapping("eliminar/{id}")
	ResponseEntity<String> eliminar(@PathVariable int id) {
		String mensaje = service.eliminar(id);
		return new ResponseEntity<String>(mensaje, HttpStatus.OK);
	}


}
