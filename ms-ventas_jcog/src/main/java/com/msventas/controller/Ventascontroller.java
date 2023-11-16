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

import com.msventas.impl.Ventaslogic;
import com.persistence.entity.PersistenceVentas;
import com.persistence.request.RequestVentas;

@RestController
@RequestMapping("v1/ventas")
public class Ventascontroller { 
	@Autowired
	Ventaslogic service; 
	
	//http://localhost:8097/v1/ventas		 (POST GUARDA)
	
	@PostMapping 
	ResponseEntity<PersistenceVentas> guardar(@RequestBody RequestVentas request){
		PersistenceVentas ventas = service.guardar(request); 
	  return new ResponseEntity<PersistenceVentas>(ventas,HttpStatus.OK); 
	 }   
	 
	//http://localhost:8097/v1/ventas		(PUT ACTUALIZA COMPLETAMENTE)
	 
	 @PutMapping 
	 ResponseEntity<PersistenceVentas> actualizar(@RequestBody RequestVentas request){ 
		 PersistenceVentas ventas = service.actualizar(request); 
	  return new ResponseEntity<PersistenceVentas>(ventas,HttpStatus.OK); 
	 }  
	  
	//http://localhost:8097/v1/ventas		(GET MUESTRA TODOS)
	 
	 @GetMapping 
	 ResponseEntity<List<PersistenceVentas>> mostrar(){ 
	  List<PersistenceVentas> ventaslista = service.mostrar(); 
	  return new ResponseEntity<List<PersistenceVentas>>(ventaslista,HttpStatus.OK); 
	 }  
	 
	//http://localhost:8097/v1/ventas/buscar-por-id/30		(GET BUSCA UNO ESPECIFICO)
	 
	 @GetMapping("buscar-por-id/{id}") 
	 ResponseEntity<PersistenceVentas> buscar(@PathVariable int id){ 
		 PersistenceVentas ventas = service.buscar(id);   
	  return new ResponseEntity<PersistenceVentas>(ventas,HttpStatus.OK); 
	 }  
	   
	//http://localhost:8097/v1/ventas/eliminar/30		(DELETE ELIMINA)
	 
	 @DeleteMapping("eliminar/{id}") 
	 ResponseEntity<String> eliminar(@PathVariable int id){ 
	  String mensaje = service.eliminar(id); 
	  return new ResponseEntity<String>(mensaje,HttpStatus.OK); 
	 }
}