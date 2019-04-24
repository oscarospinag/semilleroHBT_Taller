package com.hbt.semillero.ejb;

import java.util.List;

import javax.ejb.Local;

import com.hbt.semillero.dto.PedidoDTO;
import com.hbt.semillero.entidades.Productos;

@Local
public interface PedidosEJBLocal {
	
	public PedidoDTO guardarPedido(boolean enSitio, List<Productos> listaProductos);
	

}
