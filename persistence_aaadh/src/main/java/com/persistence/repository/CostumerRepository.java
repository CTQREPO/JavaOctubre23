package com.persistence.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.persistence.entity.Costumers;

public interface CostumerRepository extends JpaRepository <Costumers, Integer>{

	
	//JPQL
	@Query("SELECT c FROM Costumers c WHERE c.nombre =:nombre")
	Optional<Costumers>findByName(@Param ("nombre")String nombre);
	
	
}
