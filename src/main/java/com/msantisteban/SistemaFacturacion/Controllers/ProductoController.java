package com.msantisteban.SistemaFacturacion.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.msantisteban.SistemaFacturacion.models.entity.Producto;
import com.msantisteban.SistemaFacturacion.models.service.ICategoriaService;
import com.msantisteban.SistemaFacturacion.models.service.IProductoService;


@Controller
@RequestMapping("/producto")
public class ProductoController {
	
	@Autowired
	private ICategoriaService categoriaService;
	@Autowired
	private IProductoService productoService;
	
	
	
	
	@RequestMapping("/") 
	public String inicio(Model model) {
		Producto producto=new Producto();
		model.addAttribute("producto",producto);
		model.addAttribute("listaCategoria",categoriaService.getAllCategorias());
		model.addAttribute("listaProductos",productoService.listarProductos());
		 
		return "producto/productos";
	}
	
	
	@RequestMapping(value="/form",method = RequestMethod.POST)
	public String guardar(Producto producto) {
		productoService.guardar(producto);
		return "redirect:/producto/";
		
	}
	
	@RequestMapping("/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id")Long id) {
		productoService.delete(id);
		return "redirect:/producto/";
	}
	
}
