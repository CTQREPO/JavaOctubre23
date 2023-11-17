package com.mspersistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mspersistence.entity.Ventas;

//En esta interface es el DAO
@Repository
public interface VentasRepository extends JpaRepository<Ventas, Integer>{

}
