package com.msantisteban.SistemaFacturacion.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/compra")
public class CompraController {
	@RequestMapping("/") 
	public String inicio() {
		return "compra/compras";
	}
}
