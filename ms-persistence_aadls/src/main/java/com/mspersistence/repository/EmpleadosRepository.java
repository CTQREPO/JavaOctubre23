package com.mspersistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mspersistence.entity.Empleados;

//En esta interface es el DAO
@Repository
public interface EmpleadosRepository extends JpaRepository<Empleados, Integer>{

	
}
