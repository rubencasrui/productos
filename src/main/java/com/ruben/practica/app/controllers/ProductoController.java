package com.ruben.practica.app.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ruben.practica.app.models.Producto;
import com.ruben.practica.app.services.ProductoService;

@RestController
@RequestMapping("/api")
public class ProductoController {
	
	private ProductoService productService;
	
	public ProductoController() {
		productService = new ProductoService();
	}
	
	@GetMapping("/productos")
	public List<Producto> buscarTodos() {
		return productService.buscarTodos();
	}
	
	@GetMapping("/productos/nombre/{nombre}")
	public List<Producto> buscarPorNombre(@PathVariable String nombre) {
		return productService.buscarPorNombre(nombre);
	}
	
	@GetMapping("/productos/marca/{marca}")
	public List<Producto> buscarPorMarca(@PathVariable String marca) {
		return productService.buscarPorMarca(marca);
	}
	
	@GetMapping("/producto/{id}")
	public Producto buscarPorId(@PathVariable Long id) {
		return productService.buscarPorId(id);
	}
}
