package com.mspersistence.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mspersistence.entity.Customers;

//En esta interface es el DAO
@Repository
public interface CustomersRepository extends JpaRepository<Customers, Integer>{

	//JPQL
	@Query("SELECT c FROM Customers c WHERE c.nombre =:nombre")
	Optional<Customers> findByName(@Param("nombre") String nombre);
	
	
}
