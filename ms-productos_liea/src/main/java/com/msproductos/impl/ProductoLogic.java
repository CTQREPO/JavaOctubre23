package com.msproductos.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msproductos.entity.Productos;
import com.msproductos.exception.BussinesException;
import com.msproductos.exception.ResourceNotFoundException;
import com.msproductos.repository.ProductoRepository;
import com.msproductos.request.ProductoRequest;
import com.msproductos.service.ProductoService;


@Service ///SIRVE PARA DESIGNAR QUIE RESUELVE LA LOGICA DEL NEGOCIO
public class ProductoLogic implements ProductoService{

	
	
	@Autowired
	ProductoRepository repo;
	
		
	
	@Override
	public Productos guardar(ProductoRequest request) {
		//ENTIDAD NUEVA SE LLEVARA A LA BASE DE DATOS
		//REQUEST ES EL OBJETO QQUE VIENE DESDE EL CLIENTE
		
		Productos p = new Productos();
		if(request.getRefrigerado().equals("Y")||request.getRefrigerado().equals("N")) {
				System.out.println("VALOR INCORRECTO");
			//LANZAR EXEPTION 
				throw new BussinesException("EL ATRIBUTO REFRIGERADO DEBE SER Y O N  (╥﹏╥) ");
		}else if(!(repo.findByName(request.getNombre()).isPresent())){
			throw new BussinesException("YA EXISTE EL PRODUCTO  ");
		}else {
		p.setNombre(request.getNombre());
		p.setDeptoId(request.getDeptoId());
		p.setFecha(request.getFecha());
		p.setPrecioCompra(request.getPrecioCompra());
		p.setPrecioVenta(request.getPrecioVenta());
		p.setRefrigerado(request.getRefrigerado());
		p.setStatus("1");
		
		repo.save(p);	
		
		}
		return p;
		
	}

	@Override
	public Productos actualizar(ProductoRequest request) {
		
		Optional<Productos> p = repo.findById(request.getProductoId());
		////se crea un objeto OPTIONAL y lo captura con .get()
		if(!(p.isPresent())){
		throw new ResourceNotFoundException("NO EXISTE UN PRODUCTO CON ESE ID ");
		}
		else if (request.getRefrigerado().equals("Y")||request.getRefrigerado().equals("N")){
			throw new ResourceNotFoundException("EL ATRIBUTO REFRIGERADO DEBE SER Y O N");
		}
		else {
			p.get().setNombre(request.getNombre());
			p.get().setDeptoId(request.getDeptoId());
			p.get().setFecha(request.getFecha());
			p.get().setPrecioCompra(request.getPrecioCompra());
			p.get().setPrecioVenta(request.getPrecioVenta());
			p.get().setRefrigerado(request.getRefrigerado());
			
			repo.save(p.get());
			return p.get();
			}
		}
		

	@Override
	public Productos buscar(int id) {
		
		Optional<Productos> p = repo.findExistingById(id);
		Productos producto = null;
		if(p.isPresent()) {
			producto = p.get();
			return producto;
		}else {
			///Excepcion
			throw new ResourceNotFoundException("ᕙ( ᗒᗣᗕ )ᕗ   NO EXISTE UN PRODUCTO CON ESE ID!!!!!! ᕙ( ᗒᗣᗕ )ᕗ");
		}
	}

	@Override
	public Productos buscar(String nombre) {
		
		Optional<Productos> p = repo.findExistingByName(nombre);
		Productos producto = null;
		if(p.isPresent()) {
			producto = p.get();
			return producto;
		}else {
			///Excepcion
			throw new ResourceNotFoundException("ᕙ( ᗒᗣᗕ )ᕗ NO EXISTE UN PRODUCTO CON ESE NOMBRE!!!!!! ᕙ( ᗒᗣᗕ )ᕗ");
		}
	}
	

	@Override
	public String eliminar(int id) {
		
		String respuesta = null;
		Optional<Productos> p = repo.findById(id);
		
		if(p.isPresent()) {   ////VERIFICA SI EXSITE EL ID
			p.get().setStatus("0");  
			repo.save(p.get());
			respuesta = "ELIMINADO";
		}else {
			///Excepcion
			throw new ResourceNotFoundException("AHHHHH!!!  NO ES POSIBLE ELIMINAR ESE PRODUCTO!!!!!!");
				}
		
		//repo.deleteById(id);
		
		return respuesta;
	}

	@Override
	public List mostrar() {
		
		if (repo.getAll().size()<1) {
			System.out.println("no hay productos");
			return null;
		}else {
		return repo.findAll();
		}
	}

	
}
