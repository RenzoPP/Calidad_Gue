package com.msantisteban.SistemaFacturacion.models.service;

import java.util.List;
 
import com.msantisteban.SistemaFacturacion.models.entity.Categoria;
 



public interface ICategoriaService {
	public void guardar(Categoria categoria); 
	public List<Categoria> getAllCategorias();
 
	public void delete (Long id);

}
