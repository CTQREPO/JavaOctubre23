package com.persistence.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.persistence.entity.Empleados;

public interface EmpleadoRepository extends JpaRepository <Empleados, Integer> {

}
