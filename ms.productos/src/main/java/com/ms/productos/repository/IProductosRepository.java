package com.ms.productos.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ms.productos.entity.Productos;

//Esta interface es el DAO
@Repository
//productos repository requiere la entidad con la que va a trabajar y el tipo de dato
public interface IProductosRepository extends JpaRepository<Productos,Integer> {

	@Query("SELECT p FROM Productos p WHERE p.nombre =:nombre")
	Optional<Productos> findByName(@Param("nombre") String nombre);

	//lista solo los productos activos
	@Query("SELECT p FROM Productos p WHERE p.status =1")
	List<Productos>getAll();
	
	@Query("SELECT p FROM Productos p WHERE p.status = 1 AND p.nombre =:nombre")
	Optional<Productos> findExistingByName(@Param("nombre")String nombre);
	
	@Query("SELECT p FROM Productos p WHERE p.status = 1 AND p.productoId =:id")
	Optional<Productos> findExistingByName(@Param("id")int id);
	
	
	
}
