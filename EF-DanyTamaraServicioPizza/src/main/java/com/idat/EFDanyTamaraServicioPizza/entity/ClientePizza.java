package com.idat.EFDanyTamaraServicioPizza.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "cliente_pizza")
public class ClientePizza {

	@EmbeddedId
	private ClientePizzaFK fk = new ClientePizzaFK();
	
}
