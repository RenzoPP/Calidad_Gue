package com.msantisteban.SistemaFacturacion.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/iproducto")
public class IProductoController {
	@RequestMapping("/") 
	public String inicio() {
		return "iproducto/iproductos";
	}
}
