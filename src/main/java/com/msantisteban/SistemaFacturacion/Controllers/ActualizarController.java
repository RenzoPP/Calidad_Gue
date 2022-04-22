package com.msantisteban.SistemaFacturacion.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/actualizar")
public class ActualizarController {
	@RequestMapping("/") 
	public String inicio() {
		return "actualizar/actualizardata";
	}
}
