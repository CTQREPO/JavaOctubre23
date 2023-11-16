package com.ms.productos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms.productos.emtity.Productos;

//DAO
@Repository
public interface IProductoRrepository extends JpaRepository<Productos, Integer> {
	
}
