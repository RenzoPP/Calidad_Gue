package com.msantisteban.SistemaFacturacion.models.dao;

import org.springframework.data.repository.CrudRepository;


import com.msantisteban.SistemaFacturacion.models.entity.Puesto;

public interface IPuestoDAO extends CrudRepository<Puesto, Long>{
}
