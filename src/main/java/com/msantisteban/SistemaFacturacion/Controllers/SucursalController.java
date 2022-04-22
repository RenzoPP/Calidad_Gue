package com.msantisteban.SistemaFacturacion.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sucursales")
public class SucursalController {
	@RequestMapping("/") 
	public String inicio() {
		return "sucursales/sucursal";
	}
}
