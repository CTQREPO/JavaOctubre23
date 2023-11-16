package com.msproductos.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.msproductos.entity.Productos;

//Esta interface es el DAO

@Repository
public interface ProductosRepository extends JpaRepository<Productos, Integer>{
	//Qué es el borrado lógico?
	@Query("SELECT p FROM Productos p WHERE p.nombre =:nombre")
	Optional <Productos> findByName (@Param("nombre") String nombre);

	//Lista para obtener solo los productos activos
	@Query("SELECT p FROM Productos p WHERE p.status = 1")
	List<Productos> getAll();
	
	@Query("SELECT p FROM Productos p WHERE p.status = 1 AND p.nombre =:nombre")
	Optional <Productos> findByExistingName(@Param ("nombre")String nombre);
	
	@Query("SELECT p FROM Productos p WHERE p.status = 1 AND p.productoId =:id")
	Optional <Productos> findByExistingId(@Param ("id")int id);
}
