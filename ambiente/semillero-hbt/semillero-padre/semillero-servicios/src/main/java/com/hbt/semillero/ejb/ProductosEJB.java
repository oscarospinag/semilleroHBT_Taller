package com.hbt.semillero.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.hbt.semillero.dto.ProductoDTO;
import com.hbt.semillero.entidades.Productos;

/**
 * Session Bean implementation class ProductosEJB
 */
@Stateless
public class ProductosEJB implements ProductosEJBLocal {

	@PersistenceContext
	private EntityManager em;
	
    /**
     * Default constructor. 
     */
    public ProductosEJB() {
        // TODO Auto-generated constructor stub
    }

	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public ProductoDTO crearProducto(String nombre, Double valor) {
		em.persist();
		Productos productos = newProductos();
		productos.setNombre(nombre);
		productos.setValor(valor);
		
		return productos;
	

	@Override
	public ProductoDTO editarProducto(Long id, String nombre, Double valor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminarProducto(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<ProductoDTO> listaProductos() {
		// TODO Auto-generated method stub
		return null;
	}

}
