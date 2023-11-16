package com.msproductos.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msproductos.entity.Productos;
import com.msproductos.exception.BusinessException;
import com.msproductos.exception.ResourceNotFoundException;
import com.msproductos.repository.ProductoRepository;
import com.msproductos.request.ProductoRequest;
import com.msproductos.service.ProductoService;

@Service
public class ProductoLogic implements ProductoService{
	
	@Autowired
	ProductoRepository repo;

	@Override
	public Productos guardar(ProductoRequest request) {
		Productos p = new Productos();
		if(!(request.getRefrigerado()=='Y'|| request.getRefrigerado()=='N')) {
			throw new BusinessException("El atributo refrigerado debe ser Y o N");
		}else if(repo.findByName(request.getNombre()).isPresent()){
			throw new BusinessException("Ya existe un producto con ese nombre");
		}if(!(request.getRefrigerado()=='Y'|| request.getRefrigerado()=='N')){
			throw new BusinessException("El atributo refrigerado debe ser Y o N");
		}else {
			p.setNombre(request.getNombre());
			p.setDeptoId(request.getDeptoId());
			p.setFechacad(request.getFechacad());
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

		//Productos p = repo.findById(request.getProductoId()).get();
		Optional<Productos> p = repo.findExistingById(request.getProductoId());
		
		if(!(p.isPresent())) { //si no existe
			throw new ResourceNotFoundException("No existe un producto con ese id!");
		}else {
			p.get().setNombre(request.getNombre());
			p.get().setDeptoId(request.getDeptoId());
			p.get().setFechacad(request.getFechacad());
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
		Productos producto=null;
		
		if(p.isPresent()) {
			producto = p.get();
			return producto;
		}else {
			throw new ResourceNotFoundException("No existe un producto con ese id!");
		}
		//return repo.findById(id).get();
		//return repo.findExistingById(id).get();
	}

	@Override
	public Productos buscar(String nombre) {
		//return repo.findByName(nombre).get();
		//return repo.findExistingByName(nombre).get();
		Optional<Productos> p = repo.findExistingByName(nombre);
		Productos producto=null;
		
		if(p.isPresent()) {
			producto = p.get();
			return producto;
		}else {
			throw new ResourceNotFoundException("No existe un producto con ese nombre!");
		}
	}

	@Override
	public String eliminar(int id) {
		String respuesta = null;
		Optional<Productos> p = repo.findById(id);
		if(p.isPresent()) {
			p.get().setStatus("0");
			repo.save(p.get());
			respuesta = "Eliminado";
		}else {
			throw new ResourceNotFoundException("No es posible eliminar este producto");
		}
		//repo.deleteById(id);
		return respuesta;
	}

	@Override
	public List mostrar() {
		if(repo.getAll().size()<1) {
			System.out.println("No hay productos que mostrar");
			return null;
		}else {
			return repo.getAll();
		}
	}

}
