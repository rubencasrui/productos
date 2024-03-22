package com.ruben.practica.app.controllers;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AyudaController {
	
	public AyudaController() {
		
	}

	@GetMapping("")
	public Map<String, Map<String, String>> ayuda() {
		Map<String, Map<String, String>> ayuda = new TreeMap<>();
		Map<String, String> endPoint = new TreeMap<>();
		
		ayuda.put("Productos", endPoint);
		endPoint.put("1 - Mostrar todos", "/api/productos");
		endPoint.put("2 - Buscar por nombre", "/api/productos/nombre/{nombre}");
		endPoint.put("3 - Buscar por marca",  "/api/productos/marca/{marca}");
		endPoint.put("4 - Buscar por id", "/api/producto/{id}");
		
		return ayuda;
	}
}
