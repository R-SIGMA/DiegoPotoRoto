package com.idat.EFDanyTamaraServicioPizza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EFDanyTamaraServicioPizza.entity.Pizza;
import com.idat.EFDanyTamaraServicioPizza.repository.PizzaRepository;

@Service
public class PizzaServiceImpl implements PizzaService {

	@Autowired
	private PizzaRepository repository;
	
	@Override
	public List<Pizza> listar() {
		return repository.findAll();
	}

	@Override
	public void guardar(Pizza pizza) {
		repository.save(pizza);
	}

}
