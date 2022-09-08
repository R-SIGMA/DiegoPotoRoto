package com.idat.EFDanyTamaraServicioPizza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.EFDanyTamaraServicioPizza.client.OpenFeignPizzeria;
import com.idat.EFDanyTamaraServicioPizza.dto.PizzeriaDTO;
import com.idat.EFDanyTamaraServicioPizza.entity.PizzeriaPizza;
import com.idat.EFDanyTamaraServicioPizza.entity.PizzeriaPizzaFK;
import com.idat.EFDanyTamaraServicioPizza.repository.PizzeriaPizzaRepository;

public class PizzeriaPizzaServiceImpl implements PizzeriaPizzaService {

	@Autowired
	private PizzeriaPizzaRepository repository;
	
	@Autowired
	private OpenFeignPizzeria feign;
	
	@Override
	public List<PizzeriaPizza> listar() {
		return repository.findAll();
	}

	@Override
	public void asignarTodos() {
		PizzeriaPizza pipz = null;
		PizzeriaPizzaFK fk = null;
		
		for (PizzeriaDTO dto : feign.listarPizzerias()) {
			pipz = new PizzeriaPizza();
			fk = new PizzeriaPizzaFK();
			fk.setIdPizerria(dto.getIdPizerria());
			fk.setIdPizza(1);
			pipz.setFk(fk);
			repository.save(pipz);
		}
	}

}
