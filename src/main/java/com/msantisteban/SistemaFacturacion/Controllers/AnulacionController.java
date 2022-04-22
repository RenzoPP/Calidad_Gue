package com.msantisteban.SistemaFacturacion.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/anulacion")
public class AnulacionController {
	@RequestMapping("/") 
	public String inicio() {
		return "anulacion/anulaciones";
	}
}
