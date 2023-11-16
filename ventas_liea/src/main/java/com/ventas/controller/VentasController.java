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
import com.persistence.request.RequestVentas;
import com.ventas.impl.VentasLogic;


@RestController
@RequestMapping("v1/ventas")
public class VentasController {

	@Autowired
	VentasLogic logic;
	
	
//////GUARDAR///////////	
	@PostMapping
	ResponseEntity<Ventas>guardar(@RequestBody RequestVentas request){
		Ventas vent = logic.guardar(request);
		
		return new ResponseEntity<Ventas>(vent,HttpStatus.OK);
		
	}
	
/////ACTUALIZAR///////	
	@PutMapping
	ResponseEntity<Ventas>actualizar(@RequestBody RequestVentas request){
		Ventas vent = logic.actualizar(request);
		
		return new ResponseEntity<Ventas>(vent,HttpStatus.OK);
		
	}
	
//////MOSTRAR//////
	@GetMapping
	ResponseEntity<List<Ventas>>mostrar(){
		List<Ventas> vent = logic.mostrar();
		return new ResponseEntity<List<Ventas>>(vent,HttpStatus.OK);
	}
	
//////BUSCCAR//////
	@GetMapping("buscar-por-id/{id}")
	ResponseEntity<Ventas>buscar(@PathVariable int id){
		Ventas vent = logic.buscar(id);
		return new ResponseEntity<Ventas>(vent,HttpStatus.OK);
	}

/////ELIMINAR/////
	@DeleteMapping("eliminar/{id}")
	ResponseEntity<String>eliminar(@PathVariable int id){
		String vent = logic.eliminar(id);
		return new ResponseEntity<String>(vent,HttpStatus.OK);
	}
}
