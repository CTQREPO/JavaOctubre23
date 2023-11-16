package com.persistence.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.persistence.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	//JPQL¿? pseudolenguaje
	@Query("SELECT c FROM Customer c WHERE c.nombre =:nombre")
	Optional<Customer> findByName( @Param("nombre") String nombre );
}
