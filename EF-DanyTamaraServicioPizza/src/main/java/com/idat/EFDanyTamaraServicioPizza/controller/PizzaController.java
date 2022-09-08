package com.idat.EFDanyTamaraServicioPizza.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idat.EFDanyTamaraServicioPizza.entity.Pizza;
import com.idat.EFDanyTamaraServicioPizza.service.PizzaService;

@RestController
@RequestMapping("/pizza")
public class PizzaController {

	@Autowired
	private PizzaService service;
	
	@PostMapping
	public ResponseEntity<?> guardar(@RequestBody Pizza pizza) {
		try {
			service.guardar(pizza);
			return ResponseEntity.ok("Guardado");
		} catch (Exception e) {
			return ResponseEntity.badRequest().body("Error");
		}
	}
	
	@GetMapping
	public ResponseEntity<?> listar() {
		List<Pizza> listado = service.listar();
		return ResponseEntity.ok(listado);
	}
	
}
