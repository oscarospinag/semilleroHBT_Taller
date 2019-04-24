package com.hbt.semillero.ejb;

import java.util.List;

import javax.ejb.Local;

import com.hbt.semillero.dto.ProductoDTO;

@Local
public interface ProductosEJBLocal {
	
	public ProductoDTO crearProducto(String nombre, Double valor);
	
	public ProductoDTO editarProducto(Long id, String nombre, Double valor);
	
	public boolean eliminarProducto(Long id);
	
	public List<ProductoDTO> listaProductos();

}
