package com.idat.EFDanyTamaraServicioPizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.idat.EFDanyTamaraServicioPizza.entity.Pizza;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza,Integer> {

}
