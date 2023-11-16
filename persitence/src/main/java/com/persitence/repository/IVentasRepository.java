package com.persitence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.persitence.entity.Ventas;

@Repository
public interface IVentasRepository extends JpaRepository<Ventas, Integer> {

}
