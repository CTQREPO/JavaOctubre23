package com.msproductos.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msproductos.entity.Productos;
import com.msproductos.exception.BusinessException;
import com.msproductos.exception.ResourceNotFoundException;
import com.msproductos.repository.ProductosRepository;
import com.msproductos.request.ProductosRequest;
import com.msproductos.service.ProductosService;


@Service
public class ProductosLogic implements ProductosService {

	@Autowired
	ProductosRepository repo;
	
	
	@Override
	public Productos guardar(ProductosRequest request) {
		
		Productos p = new Productos();
		
		if (!(request.getRefrigerado() == 'Y' || request.getRefrigerado() == 'N')) {
			//System.out.println("Valor incorrecto");
			throw new BusinessException("El atributo refirgerado debe ser 'Y' o 'N' exclusivamente");
		}else if (repo.findByExistingName(request.getNombre()).isPresent()){
			throw new BusinessException("El producto ya existe");
		} else {

			p.setNombre(request.getNombre());
			p.setDeptoId(request.getDeptoId());
			p.setFechaCad(request.getFechaCad());
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
		Optional<Productos> p = repo.findByExistingId(request.getProductoId());
		
		if (!p.isPresent()) {
			throw new ResourceNotFoundException("El registro no existe");
		}else if (!(request.getRefrigerado() == 'Y' || request.getRefrigerado() == 'N')) {
			throw new BusinessException("El atributo refrigerado debe ser 'Y' o 'N' exclusivamente");
		}else {
		
			p.get().setNombre(request.getNombre());
			p.get().setDeptoId(request.getDeptoId());
			p.get().setFechaCad(request.getFechaCad());
			p.get().setPrecioCompra(request.getPrecioCompra());
			p.get().setPrecioVenta(request.getPrecioVenta());
			p.get().setRefrigerado(request.getRefrigerado());
			repo.save(p.get());		
			return p.get();
		}
	}

	@Override
	public Productos buscar(int id) {
		Optional <Productos> p = repo.findByExistingId(id);
		Productos producto = null;
		if (p.isPresent()) {
			producto = p.get();
			return producto;			
		}else {
			//Excepcionthrow
			throw new ResourceNotFoundException("El id de producto no existe");
		}
	}

	@Override
	public Productos buscar(String nombre) {
		
		Optional <Productos> p = repo.findByExistingName(nombre);
		Productos producto = null;
		if (p.isPresent()) {
			producto = p.get();
			return producto;			
		}else {
			//Excepcion
			throw new ResourceNotFoundException("El nombre de producto no existe");
		}
	}

	@Override
	public String eliminar(int id) {

		String respuesta = null;
		//repo.deleteById(id);
		Optional <Productos> p = repo.findById(id);
		
		if (p.isPresent()) {
			p.get().setStatus("0");
			repo.save(p.get());
			respuesta = "Eliminado";
		}else {
			throw new ResourceNotFoundException("No es posible eliminar un id que no existe");

		}
		
		return respuesta;
	}

	@Override
	public List mostrar() {
		if (repo.getAll().size() < 1 ) {
			System.out.println("No hay produtos que mostrar");
			return null;
		}else {
			return repo.getAll();
		}
	}

	
}
