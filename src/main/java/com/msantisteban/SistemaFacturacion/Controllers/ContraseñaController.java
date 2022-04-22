package com.msantisteban.SistemaFacturacion.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contraseña")
public class ContraseñaController {
	@RequestMapping("/") 
	public String inicio() {
		return "contraseña/contra";
	}
}
