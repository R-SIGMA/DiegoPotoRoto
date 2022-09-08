package com.idat.EFDanyTamaraServicioPizza.service;

import java.util.List;

import com.idat.EFDanyTamaraServicioPizza.entity.ClientePizza;

public interface ClientePizzaService {

	List<ClientePizza> listar();
	void asignarTodos();
	
}
