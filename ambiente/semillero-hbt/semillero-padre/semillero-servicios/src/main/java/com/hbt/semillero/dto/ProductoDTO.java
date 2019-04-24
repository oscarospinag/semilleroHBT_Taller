package com.hbt.semillero.dto;

public class ProductoDTO {
	
	/**
	 * Serial
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * id de el producto
	 */
	private Long id;

	/**
	 * Nombre de el campo para que me lo retorne ..
	 */
	private String nombre;
	
	/**
	 * Nombre de el campo valor para que me lo retorne .
	 */
	private Double valor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
