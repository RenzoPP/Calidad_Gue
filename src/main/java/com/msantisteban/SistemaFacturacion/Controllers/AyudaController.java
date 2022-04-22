package com.msantisteban.SistemaFacturacion.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ayuda")
public class AyudaController {
	@RequestMapping("/") 
	public String inicio() {
		return "ayuda/help";
	}
}
