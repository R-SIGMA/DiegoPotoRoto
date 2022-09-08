package com.idat.EFDanyTamaraServicioPizza.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class PizzeriaPizzaFK implements Serializable {
	
	private static final long serialVersionUID = 5521112511313654589L;

	@Column(name = "id_pizerria", nullable = false, unique = true)
	private Integer idPizerria;
	
	@Column(name = "id_pizza", nullable = false, unique = true)
	private Integer idPizza;
}
