package com.msantisteban.SistemaFacturacion.models.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msantisteban.SistemaFacturacion.models.dao.IPuestoDAO;
import com.msantisteban.SistemaFacturacion.models.entity.Puesto;
@Service
public class PuestoServiceImpl implements IPuestoService {

	
	
	@PersistenceContext
	private EntityManager ce;
	@Autowired
	private IPuestoDAO puestoDAO;
	
	
	
	@Override
	public void guardar(Puesto puesto) {
		
		puestoDAO.save(puesto);
		
	}

	@Override
	public List<Puesto> getAllPuestos() {
		return (List<Puesto>)puestoDAO.findAll();
	}

	@Override
	public void delete(Long id) {
	puestoDAO.deleteById(id);
		
	}

	


}
