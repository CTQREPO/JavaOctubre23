package com.persistence.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.persistence.entity.Customers;

@Repository
public interface CustomersRepository extends JpaRepository<Customers, Integer> {

	//JPQL                 ENTIDAD                       ATRIBUTO
	@Query("SELECT c FROM Customers c WHERE c.nombre =:nombre")
	Optional<Customers> finByName(@Param("nombre") String nombre);
	                             //sale de repository . query
}
