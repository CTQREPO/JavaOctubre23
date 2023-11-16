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

import com.msempleados.impl.Empleadoslogic;
import com.persistence.entity.PersistenceEmpleados;
import com.persistence.request.RequestEmpleados;


@RestController
@RequestMapping("v1/empleados")
public class Empleadoscontroller { 
	@Autowired
	Empleadoslogic service; 
	
	//http://localhost:8098/v1/empleados		 (POST GUARDA)
	
	@PostMapping 
	ResponseEntity<PersistenceEmpleados> guardar(@RequestBody RequestEmpleados request){
		PersistenceEmpleados empleados = service.guardar(request); 
	  return new ResponseEntity<PersistenceEmpleados>(empleados,HttpStatus.OK); 
	 } 
	 
	//http://localhost:8098/v1/empleados		(PUT ACTUALIZA COMPLETAMENTE)
	 
	 @PutMapping 
	 ResponseEntity<PersistenceEmpleados> actualizar(@RequestBody RequestEmpleados request){ 
		 PersistenceEmpleados empleados = service.actualizar(request); 
	  return new ResponseEntity<PersistenceEmpleados>(empleados,HttpStatus.OK); 
	 } 
	   
	//http://localhost:8098/v1/empleados		(GET MUESTRA TODOS)
	 
	 @GetMapping 
	 ResponseEntity<List<PersistenceEmpleados>> mostrar(){ 
	  List<PersistenceEmpleados> emple = service.mostrar(); 
	  return new ResponseEntity<List<PersistenceEmpleados>>(emple,HttpStatus.OK); 
	 }  
	  
	//http://localhost:8098/v1/empleados/buscar-por-id/30		(GET BUSCA UNO ESPECIFICO)
	 
	 @GetMapping("buscar-por-id/{id}") 
	 ResponseEntity<PersistenceEmpleados> buscar(@PathVariable int id){ 
		 PersistenceEmpleados empleados = service.buscar(id);   
	  return new ResponseEntity<PersistenceEmpleados>(empleados,HttpStatus.OK); 
	 }  
	  
	//http://localhost:8098/v1/empleados/eliminar/30		(DELETE ELIMINA)
	  
	 @DeleteMapping("eliminar/{id}") 
	 ResponseEntity<String> eliminar(@PathVariable int id){ 
	  String mensaje = service.eliminar(id); 
	  return new ResponseEntity<String>(mensaje,HttpStatus.OK); 
	 }
}