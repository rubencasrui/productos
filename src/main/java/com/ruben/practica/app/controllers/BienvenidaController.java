package com.ruben.practica.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class BienvenidaController {

	public BienvenidaController() {
		
	}

	@GetMapping("")
	public String ayuda() {
		return "Bienvenido a la api de Productos.";
	}
}
