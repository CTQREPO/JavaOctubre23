package com.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.persistence.entity.PersistenceVentas;

@Repository
public interface RepositoryVentas extends JpaRepository<PersistenceVentas,Integer>{

}