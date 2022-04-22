package com.msantisteban.SistemaFacturacion.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.msantisteban.SistemaFacturacion.models.entity.Proveedor;

 

public interface IProveedorDAO extends CrudRepository<Proveedor, Long>{

}
