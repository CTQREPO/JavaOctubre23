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
import com.persistence.request.VentaRequest;
import com.ventas.impl.VentaLogic;

@RestController
@RequestMapping("v1/ventas")
public class VentaController {

	@Autowired
	VentaLogic service;
	
	// http://localhost:8097/v1/ventas (POST GUARDA)

			@PostMapping
			ResponseEntity<Ventas> guardar(@RequestBody VentaRequest request) {
				Ventas ven = service.guardar(request);
				return new ResponseEntity<Ventas>(ven, HttpStatus.OK);
			}

			// http://localhost:8097/v1/ventas (PUT ACTUALIZA COMPLETAMENTE)
			@PutMapping
			ResponseEntity<Ventas> actualizar(@RequestBody VentaRequest request) {
				Ventas ven = service.actualizar(request);
				return new ResponseEntity<Ventas>(ven, HttpStatus.OK);
			}

			@GetMapping
			// http://localhost:8097/v1/ventas (GET MUESTRA TODOS)
			ResponseEntity<List<Ventas>> mostrar() {
				List<Ventas> ventas = service.mostrar();
				return new ResponseEntity<List<Ventas>>(ventas, HttpStatus.OK);
			}

			// http://localhost:8097/v1/ventas/buscar-por-id/30 (GET BUSCA UNO EN
			// ESPECIFICO)
			@GetMapping("buscar-por-id/{id}")
			ResponseEntity<Ventas> buscar(@PathVariable int id) {
				Ventas ven = service.buscar(id);
				return new ResponseEntity<Ventas>(ven, HttpStatus.OK);
			}

			// http://localhost:8097/v1/ventas/eliminar/30 (DELETE ELIMINA)
			@DeleteMapping("eliminar/{id}")
			ResponseEntity<String> eliminar(@PathVariable int id) {
				String mensaje = service.eliminar(id);
				return new ResponseEntity<String>(mensaje, HttpStatus.OK);
			}
}
