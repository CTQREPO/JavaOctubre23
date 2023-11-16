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

import com.persistence.entity.Venta;
import com.persistence.request.VentaRequest;
import com.ventas.impl.VentaLogic;

@RestController
@RequestMapping("v1/venta")
public class VentaController {

	@Autowired
	VentaLogic service;
	
	//http://localhost:8097/v1/venta
	
	@PostMapping 
	 ResponseEntity<Venta> guardar(@RequestBody VentaRequest request){ 
	  Venta venta = service.guardar(request); 
	  return new ResponseEntity<Venta>(venta,HttpStatus.OK); 
	 }  
	 
		//http://localhost:8097/v1/venta

	 @PutMapping 
	 ResponseEntity<Venta> actualizar(@RequestBody VentaRequest request){ 
	  Venta venta = service.actualizar(request); 
	  return new ResponseEntity<Venta>(venta,HttpStatus.OK); 
	 } 
	 
		//http://localhost:8097/v1/venta

	 @GetMapping 
	 ResponseEntity<List<Venta>> mostrar(){ 
	  List<Venta> venta = service.mostrar(); 
	  return new ResponseEntity<List<Venta>>(venta,HttpStatus.OK); 
	 } 
	 
		//http://localhost:8097/v1/venta/buscar-por-id/{id}

	 @GetMapping("buscar-por-id/{id}") 
	 ResponseEntity<Venta> buscar(@PathVariable int id){ 
	  Venta venta = service.buscar(id); 
	  return new ResponseEntity<Venta>(venta,HttpStatus.OK); 
	 } 
	 
		//http://localhost:8097/v1/venta/eliminar/{id}

	 @DeleteMapping("eliminar/{id}") 
	 ResponseEntity<String> eliminar(@PathVariable int id){ 
	  String mensaje = service.eliminar(id); 
	  return new ResponseEntity<String>(mensaje,HttpStatus.OK); 
	 }
	
}
