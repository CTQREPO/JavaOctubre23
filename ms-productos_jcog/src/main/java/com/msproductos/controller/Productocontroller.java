package com.msproductos.controller;

import java.util.List;

import javax.validation.Valid;

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

import com.msproductos.entity.Productos;
import com.msproductos.impl.Productologic;
import com.msproductos.request.Productorequest;

@RestController
@RequestMapping("v1/productos")
public class Productocontroller { 
	@Autowired
	Productologic service;
	
	//http://localhost:8090/v1/productos		 (POST GUARDA)
	
	@PostMapping 
	 ResponseEntity<Productos> guardar(@Valid @RequestBody Productorequest request){ 
	  Productos prod = service.guardar(request);
	  return new ResponseEntity<Productos>(prod,HttpStatus.OK); 
	 }  
	
	//http://localhost:8090/v1/productos		(PUT ACTUALIZA COMPLETAMENTE)
	
	 @PutMapping 
	 ResponseEntity<Productos> actualizar(@RequestBody Productorequest request){ 
	  Productos prod = service.actualizar(request); 
	  return new ResponseEntity<Productos>(prod,HttpStatus.OK); 
	 } 
	 
	//http://localhost:8090/v1/productos		(GET MUESTRA TODOS)
	 
	 @GetMapping 
	 ResponseEntity<List<Productos>> mostrar(){ 
	  List<Productos> productos = service.mostrar(); 
	  return new ResponseEntity<List<Productos>>(productos,HttpStatus.OK); 
	 } 
	 
	//http://localhost:8090/v1/productos/buscar-por-id/30		(GET BUSCA UNO ESPECIFICO)
	 
	 @GetMapping("buscar-por-id/{id}") 
	 ResponseEntity<Productos> buscar(@PathVariable int id){ 
	  Productos prod = service.buscar(id); 
	  return new ResponseEntity<Productos>(prod,HttpStatus.OK); 
	 } 
	 
	//http://localhost:8090/v1/productos/eliminar/30		(DELETE ELIMINA)
	 
	 @DeleteMapping("eliminar/{id}") 
	 ResponseEntity<String> eliminar(@PathVariable int id){ 
	  String mensaje = service.eliminar(id); 
	  return new ResponseEntity<String>(mensaje,HttpStatus.OK); 
	 }
	
}
