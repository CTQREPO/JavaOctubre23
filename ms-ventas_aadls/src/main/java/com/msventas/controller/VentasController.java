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

import com.mspersistence.entity.Ventas;
import com.mspersistence.request.VentasRequest;
import com.msventas.impl.VentasLogic;


@RestController
@RequestMapping("v1/ventas")
public class VentasController {
	
	@Autowired
	VentasLogic service;

	// http://localhost:8070/v1/productos (POST GUARDA)
		@PostMapping
		ResponseEntity<Ventas> guardar(@RequestBody VentasRequest request) {
			Ventas venta = service.guardar(request);
			return new ResponseEntity<Ventas>(venta, HttpStatus.OK);
		}

		// http://localhost:8070/v1/productos (PUT ACTUALIZA COMPLETAMENTE)
		@PutMapping
		ResponseEntity<Ventas> actualizar(@RequestBody VentasRequest request) {
			Ventas venta = service.actualizar(request);
			return new ResponseEntity<Ventas>(venta, HttpStatus.OK);
		}

		// http://localhost:8070/v1/productos (GET MUESTRA TODOS)
		@GetMapping
		ResponseEntity<List<Ventas>> mostrar() {
			List<Ventas> venta = service.mostrar();
			return new ResponseEntity<List<Ventas>>(venta, HttpStatus.OK);
		}

		// http://localhost:8070/v1/productos/buscar-por-id/34 (GET BUSCA UNO EN
		// ESPECIFICO)
		@GetMapping("buscar-por-id/{id}")
		ResponseEntity<Ventas> buscar(@PathVariable int id) {
			Ventas venta = service.buscar(id);
			return new ResponseEntity<Ventas>(venta, HttpStatus.OK);
		}

		// http://localhost:8070/v1/productos/eliminar/30 (DELETE ELIMINA)
		@DeleteMapping("eliminar/{id}")
		ResponseEntity<String> eliminar(@PathVariable int id) {
			String mensaje = service.eliminar(id);
			return new ResponseEntity<String>(mensaje, HttpStatus.OK);
		}

}
