package com.msantisteban.SistemaFacturacion.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.msantisteban.SistemaFacturacion.models.entity.Puesto;
import com.msantisteban.SistemaFacturacion.models.service.IPuestoService;

@Controller
@RequestMapping("/puesto")
public class PuestoController {
	
	@Autowired
	private IPuestoService puestoService;
	@RequestMapping("/")
private String inicio(Model model) {
	Puesto puesto=new Puesto();
	model.addAttribute("puesto",puesto);
	model.addAttribute("listapuesto",puestoService.getAllPuestos());
	return "puesto/puesto";
}
	@RequestMapping(value="/form",method = RequestMethod.POST)
	public String guardar(Puesto puesto) {
	puestoService.guardar(puesto);
	return "redirect:/puesto/";
	}
	
	@RequestMapping("/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id")Long id) {
		puestoService.delete(id);
		return "redirect:/puesto/";
	}
	
	
	
	
	
	
	
	
	
}
