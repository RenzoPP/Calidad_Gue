package com.msantisteban.SistemaFacturacion.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/venta")
public class VentaController {
	@RequestMapping("/") 
	public String inicio() {
		return "venta/ventas";
	}
}
