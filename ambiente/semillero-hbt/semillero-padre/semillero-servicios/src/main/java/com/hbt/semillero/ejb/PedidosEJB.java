package com.hbt.semillero.ejb;

import java.util.List;

import javax.ejb.Stateless;

import com.hbt.semillero.dto.PedidoDTO;
import com.hbt.semillero.entidades.Productos;

/**
 * Session Bean implementation class PedidosEJB
 */
@Stateless
public class PedidosEJB implements PedidosEJBLocal {

    /**
     * Default constructor. 
     */
    public PedidosEJB() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public PedidoDTO guardarPedido(boolean enSitio, List<Productos> listaProductos) {
		
		return null;
	}

}
