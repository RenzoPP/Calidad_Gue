package com.msantisteban.SistemaFacturacion.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.msantisteban.SistemaFacturacion.models.entity.Categoria;



public interface ICategoriaDAO extends CrudRepository<Categoria, Long>{

}
