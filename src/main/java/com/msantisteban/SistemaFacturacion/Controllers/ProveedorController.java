package com.msantisteban.SistemaFacturacion.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.msantisteban.SistemaFacturacion.models.entity.Proveedor;
import com.msantisteban.SistemaFacturacion.models.service.IProveedorService;


@Controller
@RequestMapping("/proveedor")
public class ProveedorController {

	@Autowired
	private IProveedorService proveedorService;
@RequestMapping("/")
	public String inicio(Model model) {
	Proveedor proveedor=new Proveedor();
	model.addAttribute("proveedor", proveedor);
	model.addAttribute("listaProveedores",proveedorService.getAllProveedores());
	return "proveedor/proveedores";
}
@RequestMapping(value = "/form",method=RequestMethod.POST)
public String guardar(Proveedor proveedor) {
	proveedorService.guardar(proveedor);
	return "redirect:/proveedor/";
	
}


 

}
