package com.idat.EFDanyTamaraServicioPizza.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class ClientePizzaFK implements Serializable {

	private static final long serialVersionUID = 3157104532152132508L;

	@Column(name = "id_cliente", nullable = false, unique = true)
	private Integer idCliente;
	
	@Column(name = "id_pizza", nullable = false, unique = true)
	private Integer idPizza;
}
