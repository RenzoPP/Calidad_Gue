package com.msantisteban.SistemaFacturacion.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/roles")
public class RolesController {
	@RequestMapping("/") 
	public String inicio() {
		return "roles/rol";
	}
}
