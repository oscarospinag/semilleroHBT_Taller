package com.hbt.semillero.dto;

public class PedidoDTO {
	/**
	 * Serial
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * id de el pedido
	 */
	private Long id;

	/**
	 * Nombre de el campo booleano para comprovar el sitiodel pedido .
	 */
	private boolean En_sitio;
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isEn_sitio() {
		return En_sitio;
	}

	public void setEn_sitio(boolean en_sitio) {
		En_sitio = en_sitio;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	
	

}
