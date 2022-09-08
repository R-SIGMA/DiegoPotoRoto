package com.idat.EFDanyTamaraServicioPizza.dto;

import lombok.Data;

@Data
public class ClienteDTO {

	private int idCliente;
    private String nombreCliente;
    private String apellidoCliente;
    private String nroCelular;
    private String direccion;
	
}
