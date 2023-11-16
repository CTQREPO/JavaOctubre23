package com.persitence.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.persitence.entity.Customers;

@Repository
public interface ICustomersRepository extends JpaRepository<Customers, Integer> {
	
	@Query("SELECT c FROM Customers c WHERE c.nombre =:nombre")
	Optional<Customers> findByName(@Param("nombre")String nombre);

}
