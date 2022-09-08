package com.idat.EFDanyTamaraServicioPizza.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idat.EFDanyTamaraServicioPizza.entity.PizzeriaPizza;
import com.idat.EFDanyTamaraServicioPizza.service.PizzeriaPizzaService;

@RestController
@RequestMapping("/pizzeriapizza")
public class PizzeriaPizzaController {

	@Autowired
	private PizzeriaPizzaService service;
	
	@PostMapping
	public ResponseEntity<?> asignarTodos() {
		try {
			service.asignarTodos();
			return ResponseEntity.ok("Guardado");
		} catch (Exception e) {
			return ResponseEntity.badRequest().body("Error");
		}
	}
	
	@GetMapping
	public ResponseEntity<?> listar() {
		List<PizzeriaPizza> listado = service.listar();
		return ResponseEntity.ok(listado);
	}
}
