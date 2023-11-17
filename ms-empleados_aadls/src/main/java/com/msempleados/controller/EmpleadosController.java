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
import com.mspersistence.entity.Empleados;
import com.mspersistence.request.EmpleadosRequest;

@RestController
@RequestMapping("v1/empleados")
public class EmpleadosController {

	@Autowired
	EmpleadosLogic service;
	
	
	// http://localhost:8070/v1/productos (POST GUARDA)
		@PostMapping
		ResponseEntity<Empleados> guardar(@RequestBody EmpleadosRequest request) {
			Empleados empleado = service.guardar(request);
			return new ResponseEntity<Empleados>(empleado, HttpStatus.OK);
		}

		// http://localhost:8070/v1/productos (PUT ACTUALIZA COMPLETAMENTE)
		@PutMapping
		ResponseEntity<Empleados> actualizar(@RequestBody EmpleadosRequest request) {
			Empleados empleado = service.actualizar(request);
			return new ResponseEntity<Empleados>(empleado, HttpStatus.OK);
		}

		// http://localhost:8070/v1/productos (GET MUESTRA TODOS)
		@GetMapping
		ResponseEntity<List<Empleados>> mostrar() {
			List<Empleados> empleado = service.mostrar();
			return new ResponseEntity<List<Empleados>>(empleado, HttpStatus.OK);
		}

		// http://localhost:8070/v1/productos/buscar-por-id/34 (GET BUSCA UNO EN
		// ESPECIFICO)
		@GetMapping("buscar-por-id/{id}")
		ResponseEntity<Empleados> buscar(@PathVariable int id) {
			Empleados empleado = service.buscar(id);
			return new ResponseEntity<Empleados>(empleado, HttpStatus.OK);
		}

		// http://localhost:8070/v1/productos/eliminar/30 (DELETE ELIMINA)
		@DeleteMapping("eliminar/{id}")
		ResponseEntity<String> eliminar(@PathVariable int id) {
			String mensaje = service.eliminar(id);
			return new ResponseEntity<String>(mensaje, HttpStatus.OK);
		}

}
