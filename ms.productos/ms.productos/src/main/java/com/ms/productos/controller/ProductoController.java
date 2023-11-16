package com.ms.productos.controller;

import java.util.List;

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

import com.ms.productos.emtity.Productos;
import com.ms.productos.impl.ProductoLogic;
import com.ms.productos.request.ProductoRequest;

@RestController
@RequestMapping("v1/productos")
public class ProductoController {
	
	ProductoLogic logic;
	
	
	// http://localhost:8090/v1/productos		(POST GUARDA)
	@PostMapping
	ResponseEntity<Productos> guardar(@RequestBody ProductoRequest request) {
		Productos prod = logic.guardar(request);
		return new ResponseEntity<Productos>(prod, HttpStatus.OK);
	}

	// http://localhost:8090/v1/productos		(PUT ACTUALIZA COMPLETAMENTE)
	@PutMapping
	ResponseEntity<Productos> actualizar(@RequestBody ProductoRequest request) {
		Productos prod = logic.actualizar(request);
		return new ResponseEntity<Productos>(prod, HttpStatus.OK);
	}

	// http://localhost:8090/v1/productos		(GET MUESTRA TODOS)
	@GetMapping
	ResponseEntity<List<Productos>> mostrar() {
		List<Productos> productos = logic.mostrar();
		return new ResponseEntity<List<Productos>>(productos, HttpStatus.OK);
	}

	// http://localhost:8090/v1/productos/buscar-por-id/		(GET BUSCA UNO ESPECIFICAMENTE)
	@GetMapping("buscar-por-id/{id}")
	ResponseEntity<Productos> buscar(@PathVariable int id) {
		Productos prod = logic.buscar(id);
		return new ResponseEntity<Productos>(prod, HttpStatus.OK);
	}

	// http://localhost:8090/v1/productos/eliminar/			(DELETE ELIMINA)
	@DeleteMapping("eliminar/{id}")
	ResponseEntity<String> eliminar(@PathVariable int id) {
		String mensaje = logic.eliminar(id);
		return new ResponseEntity<String>(mensaje, HttpStatus.OK);
	}

}
