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

import com.empleados.impl.EmpleadosLogic;
import com.persistence.entity.Empleados;
import com.persistence.request.RequestEmpleados;

@RestController
@RequestMapping("v1/empleados")
public class EmpleadosController {

	@Autowired
	EmpleadosLogic logic;
	
	
//////GUARDAR///////////	
	@PostMapping
	ResponseEntity<Empleados>guardar(@RequestBody RequestEmpleados request){
		Empleados emp = logic.guardar(request);
		
		return new ResponseEntity<Empleados>(emp,HttpStatus.OK);
		
	}
	
/////ACTUALIZAR///////	
	@PutMapping
	ResponseEntity<Empleados>actualizar(@RequestBody RequestEmpleados request){
		Empleados emp = logic.actualizar(request);
		
		return new ResponseEntity<Empleados>(emp,HttpStatus.OK);
		
	}
	
//////MOSTRAR//////
	
	
	@GetMapping
	ResponseEntity<List<Empleados>>mostrar(){
		List<Empleados> emp = logic.mostrar();
		return new ResponseEntity<List<Empleados>>(emp,HttpStatus.OK);
	}
	
//////BUSCCAR//////
	@GetMapping("buscar-por-id/{id}")
	ResponseEntity<Empleados>buscar(@PathVariable int id){
		Empleados emp = logic.buscar(id);
		return new ResponseEntity<Empleados>(emp,HttpStatus.OK);
	}

/////ELIMINAR/////
	@DeleteMapping("eliminar/{id}")
	ResponseEntity<String>eliminar(@PathVariable int id){
		String emp = logic.eliminar(id);
		return new ResponseEntity<String>(emp,HttpStatus.OK);
	}
}
