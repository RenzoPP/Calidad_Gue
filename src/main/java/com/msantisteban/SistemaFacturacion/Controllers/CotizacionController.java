package com.msantisteban.SistemaFacturacion.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cotizacion")
public class CotizacionController {
	@RequestMapping("/") 
	public String inicio() {
		return "cotizacion/cotizaciones";
	}
}
