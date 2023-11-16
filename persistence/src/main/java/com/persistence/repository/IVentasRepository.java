package com.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.persistence.entity.Ventas;

//Esta interfaz es el DAO
@Repository
//productos repository requiere la entidad con la que va a trabajar y el tipo de dato
public interface IVentasRepository extends JpaRepository<Ventas,Integer>{

}
