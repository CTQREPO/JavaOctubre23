package com.ms.productos.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.productos.emtity.Productos;
import com.ms.productos.repository.IProductoRrepository;
import com.ms.productos.request.ProductoRequest;
import com.ms.productos.service.IProductoService;

@Service
public class ProductoLogic implements IProductoService {

	@Autowired
	IProductoRrepository repo;

	@Override
	public Productos guardar(ProductoRequest request) {
		//el request es el objeto que viene del cliente
		
		// la entidad nueva se llevara a la base de datos
		Productos p = new Productos();

		p.setNombreProducto(request.getNombreProducto());
		p.setDepartamenoId(request.getDepartamenoId());
		p.setFechaCaducidad(request.getFechaCaducidad());
		p.setPrecioCompra(request.getPrecioCompra());
		p.setPrecioVenta(request.getPrecioVenta());
		p.setRefrigerado(request.getRefrigerado());

		repo.save(p);
		return p;
	}

	@Override
	public Productos actulizar(ProductoRequest request) {	
		Productos p = repo.findById(request.getProductoId()).get();
		p.setNombreProducto(request.getNombreProducto());
		p.setDepartamenoId(request.getDepartamenoId());
		p.setFechaCaducidad(request.getFechaCaducidad());
		p.setPrecioCompra(request.getPrecioCompra());
		p.setRefrigerado(request.getRefrigerado());

		repo.save(p);
		return p;
	}

	@Override
	public Productos buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Productos buscar(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eliminar(int id) {
		repo.deleteById(id);
		return null;
	}

	@Override
	public List mostrar() {
		return repo.findAll();
	}

}
