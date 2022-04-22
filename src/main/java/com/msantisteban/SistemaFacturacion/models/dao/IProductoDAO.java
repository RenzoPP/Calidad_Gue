package com.msantisteban.SistemaFacturacion.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.msantisteban.SistemaFacturacion.models.entity.Producto;

public interface IProductoDAO extends CrudRepository<Producto, Long>{
public List<Producto> findAllByOrderByNombreproAsc();


}
