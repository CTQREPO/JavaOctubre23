package com.mscustomers.controller;

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

import com.mscustomers.impl.Customerslogic;
import com.persistence.entity.PersistenceCustomers;
import com.persistence.request.RequestCustomers;

@RestController
@RequestMapping("v1/customers")
public class Customerscontroller {
	@Autowired
	Customerslogic service;
	 
	//http://localhost:8096/v1/customers		 (POST GUARDA)
	
	@PostMapping 
	ResponseEntity<PersistenceCustomers> guardar(@RequestBody RequestCustomers request){
		PersistenceCustomers custo = service.guardar(request); 
	  return new ResponseEntity<PersistenceCustomers>(custo,HttpStatus.OK); 
	 }  
	
	//http://localhost:8096/v1/customers		(PUT ACTUALIZA COMPLETAMENTE)
	 
	 @PutMapping 
	 ResponseEntity<PersistenceCustomers> actualizar(@RequestBody RequestCustomers request){ 
		 PersistenceCustomers custo = service.actualizar(request); 
	  return new ResponseEntity<PersistenceCustomers>(custo,HttpStatus.OK); 
	 }  
	 
	//http://localhost:8096/v1/customers		(GET MUESTRA TODOS)
	 
	 @GetMapping 
	 ResponseEntity<List<PersistenceCustomers>> mostrar(){ 
	  List<PersistenceCustomers> customers = service.mostrar(); 
	  return new ResponseEntity<List<PersistenceCustomers>>(customers,HttpStatus.OK);  
	 } 
	 
	//http://localhost:8096/v1/customers/buscar-por-id/30		(GET BUSCA UNO ESPECIFICO)
	 
	 @GetMapping("buscar-por-id/{id}") 
	 ResponseEntity<PersistenceCustomers> buscar(@PathVariable int id){ 
		 PersistenceCustomers custo = service.buscar(id); 
	  return new ResponseEntity<PersistenceCustomers>(custo,HttpStatus.OK); 
	 }
	 
	//http://localhost:8096/v1/customers/buscar-por-nombre/nombre		(GET BUSCA UNO ESPECIFICO)
	 
	 @GetMapping("buscar-por-nombre/{nombre}") 
	 ResponseEntity<PersistenceCustomers> buscar(@PathVariable String nombre){ 
		 PersistenceCustomers custo = service.buscar(nombre); 
	 return new ResponseEntity<PersistenceCustomers>(custo,HttpStatus.OK);
	 }
	  
	//http://localhost:8096/v1/customers/eliminar/30		(DELETE ELIMINA) 
	 
	 @DeleteMapping("eliminar/{id}") 
	 ResponseEntity<String> eliminar(@PathVariable int id){ 
	  String mensaje = service.eliminar(id); 
	  return new ResponseEntity<String>(mensaje,HttpStatus.OK); 
	 }
}