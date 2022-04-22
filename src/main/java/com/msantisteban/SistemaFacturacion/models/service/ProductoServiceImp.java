package com.msantisteban.SistemaFacturacion.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msantisteban.SistemaFacturacion.models.dao.IProductoDAO;
import com.msantisteban.SistemaFacturacion.models.entity.Producto;


@Service
public class ProductoServiceImp implements IProductoService {
    @Autowired
	private IProductoDAO productoDAO;
	
	
	
	@Override
	public void guardar(Producto producto) {
		productoDAO.save(producto);
		
	}



	@Override
	public List<Producto> listarProductos() {
		 
		return productoDAO.findAllByOrderByNombreproAsc();
	}



	@Override
	public void delete(Long id) {
		productoDAO.deleteById(id);
		
	}



	



	



	 
	
 
	


}
