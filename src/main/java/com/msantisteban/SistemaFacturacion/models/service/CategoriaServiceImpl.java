package com.msantisteban.SistemaFacturacion.models.service;

import java.util.List;
 

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msantisteban.SistemaFacturacion.models.dao.ICategoriaDAO;
import com.msantisteban.SistemaFacturacion.models.entity.Categoria;
 

 

@Service
public class CategoriaServiceImpl implements ICategoriaService{
	
	
	@PersistenceContext
	private EntityManager em;
	@Autowired
	private ICategoriaDAO categoriaDAO;
	
	
	@Override
	public void guardar(Categoria categoria) {
		categoriaDAO.save(categoria);	
	}
	
	@Override
	public List<Categoria> getAllCategorias() {	
		return (List<Categoria>)categoriaDAO.findAll();
	}

	 

	@Override
	public void delete(Long id) {
		categoriaDAO.deleteById(id);
		
	}
	
	
	

	
}
