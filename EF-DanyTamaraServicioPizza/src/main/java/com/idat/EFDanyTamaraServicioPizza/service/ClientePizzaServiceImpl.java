package com.idat.EFDanyTamaraServicioPizza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EFDanyTamaraServicioPizza.client.OpenFeignCliente;
import com.idat.EFDanyTamaraServicioPizza.dto.ClienteDTO;
import com.idat.EFDanyTamaraServicioPizza.entity.ClientePizza;
import com.idat.EFDanyTamaraServicioPizza.entity.ClientePizzaFK;
import com.idat.EFDanyTamaraServicioPizza.repository.ClientePizzaRepository;

@Service
public class ClientePizzaServiceImpl implements ClientePizzaService {

	@Autowired
	private ClientePizzaRepository repository;
	
	@Autowired
	private OpenFeignCliente feign;
	
	@Override
	public List<ClientePizza> listar() {
		return repository.findAll();
	}

	@Override
	public void asignarTodos() {
		ClientePizza clpi = null;
		ClientePizzaFK fk = null;
		
		for (ClienteDTO dto : feign.listarClientes()) {
			clpi = new ClientePizza();
			fk = new ClientePizzaFK();
			fk.setIdCliente(dto.getIdCliente());
			fk.setIdPizza(1);
			clpi.setFk(fk);
			repository.save(clpi);
		}
	}

}
