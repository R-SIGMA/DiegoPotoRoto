package com.idat.EFDanyTamaraServicioPizza.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "pizerria_pizza")
public class PizzeriaPizza {

	@EmbeddedId
	private PizzeriaPizzaFK fk = new PizzeriaPizzaFK();
	
}
