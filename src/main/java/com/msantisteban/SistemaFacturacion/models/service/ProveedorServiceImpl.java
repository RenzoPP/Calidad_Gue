package com.msantisteban.SistemaFacturacion.models.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 
import com.msantisteban.SistemaFacturacion.models.dao.IProveedorDAO;
 
import com.msantisteban.SistemaFacturacion.models.entity.Proveedor;

@Service
public class ProveedorServiceImpl implements IProveedorService{
	@PersistenceContext
	private EntityManager em;
	@Autowired
	private IProveedorDAO proveedorDAO;
	
	
	@Override
	public void guardar(Proveedor proveedor) {
		proveedorDAO.save(proveedor);	
	}
	
	@Override
	public List<Proveedor> getAllProveedores() {	
		return (List<Proveedor>)proveedorDAO.findAll();
	}

	@Override
	public void delete(Proveedor proveedor) {
		proveedorDAO.delete(proveedor);
		
	}

	 
}
