package com.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.persistence.entity.Empleados;

public interface EmpleadosRepository extends JpaRepository<Empleados,Integer>{

}
