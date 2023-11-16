package com.msproductos.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.msproductos.entity.Productos;

//DAO esta interface es el dao ya tiene todo implementado
@Repository
public interface IProductorepository extends JpaRepository<Productos,Integer> {
	
	@Query("SELECT p FROM Productos p WHERE p.nombre =:nombre")
	Optional<Productos>findByName(@Param("nombre")String nombre);
	
	@Query("SELECT p FROM Productos p WHERE p.status = 1")
	List<Productos>getAll();
	
	@Query("SELECT p FROM Productos p WHERE p.status = 1 AND p.nombre =:nombre")
	Optional<Productos> findExitingByName(@Param("nombre")String nombre);
	
	@Query("SELECT n FROM Productos n WHERE n.status = 1 AND n.productosId =:id")
	Optional<Productos> findExitingById(@Param("id")int id);
	
	

}
