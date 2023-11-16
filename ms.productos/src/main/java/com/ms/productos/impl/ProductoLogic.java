package com.ms.productos.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.productos.entity.Productos;
import com.ms.productos.exception.BusinessException;
import com.ms.productos.exception.ResourceNotFoundException;
import com.ms.productos.repository.IProductosRepository;
import com.ms.productos.request.ProductosRequest;
import com.ms.productos.service.IProductoService;

@Service
public class ProductoLogic implements IProductoService{

	@Autowired  // 
	IProductosRepository repo;
	
	@Override
	public Productos guardar(ProductosRequest request) {
		Productos p = new Productos();
		
		if(!(request.getRefrigerado()=='Y' || request.getRefrigerado()=='N')) {
			System.out.println("Valor incorrecto");
			
			//lanzar exception
			throw new BusinessException("El atributo refrigerado debe ser Y o N!");
		}else if (repo.findByName(request.getNombre()).isPresent())  {
			throw new BusinessException("Ya existe un producto con ese nombre");
		}else {	
			p.setNombre(request.getNombre());
			p.setDeptoId(request.getDeptoId());
			p.setFechaCad(request.getFechaCad());;
			p.setPrecioCompra(request.getPrecioCompra());
			p.setPrecioVenta(request.getPrecioVenta());
			p.setRefrigerado(request.getRefrigerado());
			p.setStatus("1");
			repo.save(p);
		}
		return p;
	}

	@Override
	public Productos actualizar(ProductosRequest request) {
		
		Optional<Productos> p = repo.findExistingByName(request.getProductoId());
		if(!(p.isPresent())) { //exista
			
			throw new ResourceNotFoundException("No existe un producto con ese id");
		
		}else if(!(request.getRefrigerado()=='Y' || request.getRefrigerado()=='N')) {
			throw new BusinessException("El atributo refrigerado debe ser Y o N");
		}else {
			p.get().setNombre(request.getNombre());
			p.get().setDeptoId(request.getDeptoId());
			p.get().setFechaCad(request.getFechaCad());;
			p.get().setPrecioCompra(request.getPrecioCompra());
			p.get().setPrecioVenta(request.getPrecioVenta());
			p.get().setRefrigerado(request.getRefrigerado());
			repo.save(p.get());
			return p.get();
		}

	}

	@Override
	public Productos buscar(int id) {
		
		Optional<Productos> p = repo.findById(id);
		Productos producto = null;
		if(p.isPresent()) {
			producto = p.get();
			return producto;
		}else {
			//Exception
			throw new ResourceNotFoundException("No existe un producto con ese Id !");
		}
	}

	@Override
	public Productos buscar(String nombre) {
		//return repo.findByName(nombre).get();
		
		Optional<Productos> p = repo.findExistingByName(nombre);
		Productos producto = null;
		
		if(p.isPresent()) {
			producto = p.get();
			return producto;
		}else {
			//Exception
			throw new ResourceNotFoundException("No existe un producto con ese nombre !");
		}
	}

	@Override
	public String eliminar(int id) {
		
		String respuesta=null;
		Optional<Productos> p = repo.findById(id);
		
		if(p.isPresent()) {
			p.get().setStatus("0");
			repo.save(p.get());
			respuesta = "Eliminado";
		}else {
			throw new ResourceNotFoundException("No es posible eliminar un producto que no existe !");
		}
		return respuesta;
	}

	@Override
	public List mostrar() {
		if(repo.getAll().size()<1) {
			System.out.println("No hay productos que mostrar");
			return null;
		}
		return repo.getAll();
	}

}
