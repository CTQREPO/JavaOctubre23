package com.persistence.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.persistence.entity.Customers;

public interface CustomersRepository extends JpaRepository<Customers,Integer>{
	//JPQL
	@Query("SELECT c FROM Customers c WHERE c.nombre =:nombre")
	Optional<Customers> findByName(@Param("nombre") String nombre);
}
