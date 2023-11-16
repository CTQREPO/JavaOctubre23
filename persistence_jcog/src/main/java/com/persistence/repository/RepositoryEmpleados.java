package com.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.persistence.entity.PersistenceEmpleados;

@Repository
public interface RepositoryEmpleados extends JpaRepository<PersistenceEmpleados,Integer>{

}