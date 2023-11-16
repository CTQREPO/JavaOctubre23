package com.persistence.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.persistence.entity.PersistenceCustomers;

@Repository
public interface RepositoryCustomers extends JpaRepository<PersistenceCustomers,Integer>{

	//JPQL
	@Query("SELECT c FROM PersistenceCustomers c WHERE c.nombre =:nombre") //le va a decir como resolver la consulta
	Optional<PersistenceCustomers>findByName(@Param("nombre") String nombre);//@Param indica donde va a ser colocado el argumento que se le va a dar
	
}  