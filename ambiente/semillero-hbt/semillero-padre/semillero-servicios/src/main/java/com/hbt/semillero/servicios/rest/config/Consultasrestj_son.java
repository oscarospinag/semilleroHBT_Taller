package com.hbt.semillero.servicios.rest.config;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.hbt.semillero.dto.PedidoDTO;
import com.hbt.semillero.dto.ProductoDTO;
import com.hbt.semillero.ejb.PedidosEJBLocal;



@Path("/Consultasrestj_son")
public class Consultasrestj_son {
	
	@EJB
	private PedidosEJBLocal consultaEJB;
	
	/**
	 * Crea las pedido.
	 * 
	 * @param persona
	 * @return
	 */
	@POST
	@Path("/guardarpedido")
	@Produces(MediaType.APPLICATION_JSON)
	public  guardarPedido(PedidoDTO pedido) {
		return consultaEJB.guardarPedido(pedido);
	}
	/**
	 * Crea las pedido.
	 * 
	 * @param persona
	 * @return
	 */
	@POST
	@Path("/crearproducto")
	@Produces(MediaType.APPLICATION_JSON)
	public  crearProducto(ProductoDTO producto) {
		return consultaEJB.crearProducto(producto);
	}
	
	}
	


