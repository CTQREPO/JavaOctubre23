package com.ms.persistence.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ms.persistence.entity.Customers;

@Repository

public interface ICustomersRrepository extends JpaRepository<Customers, Integer> {
	
	// JPQL
	@Query("SELECT c FROM Customers c WHERE c.nombre =:nombre")
	Optional<Customers> findByName (@Param("nombre") String nombre);
	
	@Query("SELECT c FROM Customers c WHERE c.status 1")
	List<Customers> getAll();
	
	@Query("SELECT c FROM Customers c WHERE c.status 1 AND c.nombre =:nombre")
	Optional<Customers> FindExisttingByName(@Param("nombre") String nombre);

}
