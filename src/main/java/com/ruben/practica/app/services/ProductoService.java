package com.ruben.practica.app.services;

import java.util.List;

import com.ruben.practica.app.models.Producto;
import com.ruben.practica.app.repositories.ProductoRepository;

public class ProductoService {

	private ProductoRepository productRepository;
	
	public ProductoService() {
		productRepository = new ProductoRepository();
	}
	
	public List<Producto> buscarTodos(){
		return productRepository.buscarTodos();
	}
	
	public Producto buscarPorId(Long id){
		return productRepository.buscarPorId(id);
	}
	
	public List<Producto> buscarPorNombre(String nombre){
		return productRepository.buscarPorNombre(nombre);
	}
	
	public List<Producto> buscarPorMarca(String marca){
		return productRepository.buscarPorMarca(marca);
	}
}
