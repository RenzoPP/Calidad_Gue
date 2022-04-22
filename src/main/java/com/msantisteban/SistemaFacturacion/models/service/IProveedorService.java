package com.msantisteban.SistemaFacturacion.models.service;

import java.util.List;

 
import com.msantisteban.SistemaFacturacion.models.entity.Proveedor;

public interface IProveedorService {
	public void guardar(Proveedor proveedor); 
	public List<Proveedor> getAllProveedores();
 
	public void delete (Proveedor proveedor);
}
