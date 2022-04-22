package com.msantisteban.SistemaFacturacion.models.service;

import java.util.List;

import com.msantisteban.SistemaFacturacion.models.entity.Puesto;

public interface IPuestoService {
public void guardar(Puesto puesto);
public List<Puesto>getAllPuestos();
public void delete (Long id);

}
