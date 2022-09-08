package com.idat.EFDanyTamaraServicioPizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EFDanyTamaraServicioPizza.entity.PizzeriaPizza;

@Repository
public interface PizzeriaPizzaRepository extends JpaRepository<PizzeriaPizza,Integer> {

}
