package com.idat.EFDanyTamaraServicioPizza.service;

import java.util.List;

import com.idat.EFDanyTamaraServicioPizza.entity.Pizza;

public interface PizzaService {

	List<Pizza> listar();
	void guardar(Pizza pizza);
	
}
