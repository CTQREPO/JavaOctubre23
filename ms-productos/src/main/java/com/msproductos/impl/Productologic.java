package com.msproductos.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msproductos.entity.Productos;
import com.msproductos.exception.BusinessException;
import com.msproductos.exception.ResourceNotFoundException;
import com.msproductos.repository.IProductorepository;
import com.msproductos.request.Productorequest;
import com.msproductos.service.IProductoservice;

@Service
public class Productologic implements IProductoservice {

	@Autowired // inyeccion de dependecias por atributo
	IProductorepository repo;

	@Override
	public Productos guardar(Productorequest request) {

		Productos p = new Productos();

		if (!(request.getRefrigerado() == 'Y' || request.getRefrigerado() == 'N')) {
			System.out.println("Valor incorrecto");
			throw new BusinessException("El atributo refrigerado debe ser Y o N");
		} else if (repo.findByName(request.getNombre()).isPresent()) {
			throw new BusinessException("Ya existe un producto con ese nombre");
		} else {
			p.setNombre(request.getNombre());
			p.setDeptoId(request.getDeptoId());
			p.setFechaCad(request.getFechaCad());
			p.setPrecioCompra(request.getPrecioCompra());
			p.setPrecioVenta(request.getPrecioVenta());
			p.setRefrigerado(request.getRefrigerado());
			p.setStatus("1");
			// Aqui se guarda
			repo.save(p);
		}
		return p;
	}

	@Override
	public Productos actualizar(Productorequest request) {

//		Productos p = repo.findById(request.getProductosId()).get();
		Optional<Productos> p = repo.findExitingById(request.getProductosId());

		if (!(p.isPresent())) {
			throw new ResourceNotFoundException("no existe un producto con ese Id");
		} else if (!(request.getRefrigerado() == 'Y' || request.getRefrigerado() == 'N')) {
			throw new BusinessException("El atributo refrigerado debe ser Y o N");
		}else {			
			p.get().setNombre(request.getNombre());
			p.get().setDeptoId(request.getDeptoId());
			p.get().setFechaCad(request.getFechaCad());
			p.get().setPrecioCompra(request.getPrecioCompra());
			p.get().setPrecioVenta(request.getPrecioVenta());
			p.get().setRefrigerado(request.getRefrigerado());

			// Aqui se guarda
			repo.save(p.get());
			return p.get();

		
			// throw new RuntimeException();

		}
		
	}

	@Override
	public Productos buscar(int id) {

		Optional<Productos> p = repo.findExitingById(id);
		Productos producto = null;

		if (p.isPresent()) {
			producto = p.get();
			return producto;

		} else
			// Exception
			throw new ResourceNotFoundException("No existe un producto con ese Id");

		// return repo.findById(id).get();
//		return repo.findExitingById(id).get();

	}

	@Override
	public Productos buscar(String nombre) {

		Optional<Productos> p = repo.findExitingByName(nombre);
		Productos producto = null;

		if (p.isPresent()) {
			producto = p.get();
			return producto;

		} else
			// Exception
			throw new ResourceNotFoundException("No existe un producto con ese nombre");

		// TODO Auto-generated method stub
		// return repo.findByName(nombre).get();
		// return repo.findExitingByName(nombre).get();
	}

	@Override
	public String eliminar(int id) {
		String respuesta = null;
		Optional<Productos> p = repo.findById(id);

		if (p.isPresent()) {
			p.get().setStatus("0");
			repo.save(p.get());
			respuesta = "eliminado";
		} else {
			throw new ResourceNotFoundException("No es posible eliminar un producto que no existe!");
		}

		// repo.deleteById(id);
		return respuesta;
	}

	@Override
	public List mostrar() {

		if (repo.getAll().size() < 1) {
			System.out.println("No hay productos que mostrar");
			return null;
		} else {

			return repo.getAll();
		}
	}

}
