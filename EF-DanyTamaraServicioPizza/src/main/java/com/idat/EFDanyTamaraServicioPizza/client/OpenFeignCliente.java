package com.idat.EFDanyTamaraServicioPizza.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.EFDanyTamaraServicioPizza.dto.ClienteDTO;

@FeignClient(name = "cliente-service")
public interface OpenFeignCliente {

	@GetMapping("/cliente")
	public List<ClienteDTO> listarClientes();
	
}
