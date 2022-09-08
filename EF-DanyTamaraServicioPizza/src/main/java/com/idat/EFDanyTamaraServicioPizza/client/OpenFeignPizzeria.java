package com.idat.EFDanyTamaraServicioPizza.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.EFDanyTamaraServicioPizza.dto.PizzeriaDTO;

@FeignClient(name = "pizzeria-service")
public interface OpenFeignPizzeria {

	@GetMapping("/pizzeria")
	public List<PizzeriaDTO> listarPizzerias();
	
}
