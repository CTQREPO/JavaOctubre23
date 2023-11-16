package com.persitence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.persitence.entity.Empleados;

@Repository
public interface IEmpleadosRepository extends JpaRepository<Empleados, Integer> {
	
}
