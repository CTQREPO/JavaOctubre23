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

import com.empleados.impl.EmpleadoLogic;
import com.persistence.entity.Empleados;
import com.persistence.request.EmpleadoRequest;

@RestController
@RequestMapping("v1/empleados")
public class EmpleadoController {

	@Autowired
	EmpleadoLogic service;
	
	// http://localhost:8098/v1/empleados (POST GUARDA)

			@PostMapping
			ResponseEntity<Empleados> guardar(@RequestBody EmpleadoRequest request) {
				Empleados emp = service.guardar(request);
				return new ResponseEntity<Empleados>(emp, HttpStatus.OK);
			}

			// http://localhost:8098/v1/empleados (PUT ACTUALIZA COMPLETAMENTE)
			@PutMapping
			ResponseEntity<Empleados> actualizar(@RequestBody EmpleadoRequest request) {
				Empleados emp = service.actualizar(request);
				return new ResponseEntity<Empleados>(emp, HttpStatus.OK);
			}

			@GetMapping
			// http://localhost:8098/v1/empleados (GET MUESTRA TODOS)
			ResponseEntity<List<Empleados>> mostrar() {
				List<Empleados> empleados = service.mostrar();
				return new ResponseEntity<List<Empleados>>(empleados, HttpStatus.OK);
			}

			// http://localhost:8098/v1/empleados/buscar-por-id/30 (GET BUSCA UNO EN
			// ESPECIFICO)
			@GetMapping("buscar-por-id/{id}")
			ResponseEntity<Empleados> buscar(@PathVariable int id) {
				Empleados emp = service.buscar(id);
				return new ResponseEntity<Empleados>(emp, HttpStatus.OK);
			}

			// http://localhost:8098/v1/empleados/eliminar/30 (DELETE ELIMINA)
			@DeleteMapping("eliminar/{id}")
			ResponseEntity<String> eliminar(@PathVariable int id) {
				String mensaje = service.eliminar(id);
				return new ResponseEntity<String>(mensaje, HttpStatus.OK);
			}
}
