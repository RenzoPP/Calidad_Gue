package com.msantisteban.SistemaFacturacion.models.service;

import java.util.List;

import com.msantisteban.SistemaFacturacion.models.entity.Producto;

public interface IProductoService {
	public void guardar(Producto producto);
public List<Producto> listarProductos(); 
 
public void delete (Long id);
	

}
