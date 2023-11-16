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
import com.persistence.entity.Empleado;
import com.persistence.request.EmpleadoRequest;

@RestController
@RequestMapping("v1/empleado")
public class EmpleadoController {

	@Autowired
	EmpleadoLogic service;
	
	//http://localhost:8098/v1/empleado
	
	@PostMapping 
	 ResponseEntity<Empleado> guardar(@RequestBody EmpleadoRequest request){ 
	  Empleado empleado = service.guardar(request); 
	  return new ResponseEntity<Empleado>(empleado,HttpStatus.OK); 
	 }  
	 
		//http://localhost:8098/v1/empleado

	 @PutMapping 
	 ResponseEntity<Empleado> actualizar(@RequestBody EmpleadoRequest request){ 
	  Empleado empleado = service.actualizar(request); 
	  return new ResponseEntity<Empleado>(empleado,HttpStatus.OK); 
	 } 
	 
		//http://localhost:8098/v1/empleado

	 @GetMapping 
	 ResponseEntity<List<Empleado>> mostrar(){ 
	  List<Empleado> empleado = service.mostrar(); 
	  return new ResponseEntity<List<Empleado>>(empleado,HttpStatus.OK); 
	 } 
	 
		//http://localhost:8098/v1/empleado/buscar-por-id/{id}

	 @GetMapping("buscar-por-id/{id}") 
	 ResponseEntity<Empleado> buscar(@PathVariable int id){ 
	  Empleado empleado = service.buscar(id); 
	  return new ResponseEntity<Empleado>(empleado,HttpStatus.OK); 
	 } 
	 
		//http://localhost:8098/v1/empleado/eliminar/{id}

	 @DeleteMapping("eliminar/{id}") 
	 ResponseEntity<String> eliminar(@PathVariable int id){ 
	  String mensaje = service.eliminar(id); 
	  return new ResponseEntity<String>(mensaje,HttpStatus.OK); 
	 }
	 
	 
}
