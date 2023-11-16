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
public class productoLogic implements ProductoService {

	@Autowired
	ProductoRepository repo;

	@Override
	public Productos guardar(ProductoRequest request) {
		Productos p = new Productos();
		
		if (!(request.getRefrigerado()=='Y'|| request.getRefrigerado()=='N')) {
			
			//Lanzar la excepcion
		throw new BusinessException ("El atributo refrigerado debe ser Y o N");
		
		}else if (repo.findByName(request.getNombre()).isPresent()) {
			throw new BusinessException ("Ya existe un producto con ese nombre");
			
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
		// Entidad nueva se llevara a base de datos
		Optional<Productos> p = repo.findExistingById(request.getProductoId());

		if (!(p.isPresent())) {//Si no existe...

			throw new ResourceNotFoundException ("No existe un producto con ese id");
			
			
		} else if (!(request.getRefrigerado()== 'Y'|| request.getRefrigerado()== 'N')) {
			throw new BusinessException("El atributo refrigerado debe ser Y o N");
			
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
		Productos producto = null;

		if (p.isPresent()) {
			producto = p.get();
			return producto;
		} else {
			// Excepcion
			throw new ResourceNotFoundException("No existe un producto con ese Id !");
		
		}
	}

	@Override
	public Productos buscar(String nombre) {
		Optional<Productos> p = repo.findExistingByName(nombre);
		Productos producto = null;

		if (p.isPresent()) {
			producto = p.get();
			return producto;
		} else {
			// Excepcion
			throw new ResourceNotFoundException("No existe un producto con ese noombre !");
		}
	}

	@Override
	public String eliminar(int id) {

		String respuesta = null;
		Optional<Productos> p = repo.findById(id);

		if (p.isPresent()) {
			p.get().setStatus("0");
			repo.save(p.get());
			respuesta = "Eliminado";
		} else {
			throw new ResourceNotFoundException("No es posible elimar un producto que no existe!");
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
