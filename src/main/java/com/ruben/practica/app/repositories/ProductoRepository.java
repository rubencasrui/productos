package com.ruben.practica.app.repositories;

import java.util.LinkedList;
import java.util.List;

import com.ruben.practica.app.models.Producto;

public class ProductoRepository {

	private List<Producto> data;
	
	public ProductoRepository() {
		data = new LinkedList<>();

		data.add(new Producto(1L, "Teclado", "Mars", 49.99));
		data.add(new Producto(2L, "Teclado", "Logitech", 49.99));
		data.add(new Producto(3L, "Raton", "Mars", 29.99));
		data.add(new Producto(4L, "Raton", "Logitech", 29.99));
		data.add(new Producto(5L, "Monitor", "MSI", 199.99));
	}
	
	public List<Producto> buscarTodos() {
		return data;
	}
	
	public Producto buscarPorId(Long id) {
		Producto p = null;
		
		for(int i = 0; i < data.size() && p == null; i++) {
			Producto pro = data.get(i);
			
			if(pro.getId() == id){
				p = pro;
			}
		}
		
		return p;
	}
	
	public List<Producto> buscarPorNombre(String nombre) {
		List<Producto> p = new LinkedList<>();
		
		for(Producto pro : data) {
			if(pro.getNombre().toLowerCase().contains(nombre.toLowerCase())){
				p.add(pro);
			}
		}
		
		return p;
	}
	
	public List<Producto> buscarPorMarca(String marca) {
		List<Producto> p = new LinkedList<>();
		
		for(Producto pro : data) {
			if(pro.getMarca().toLowerCase().contains(marca.toLowerCase())){
				p.add(pro);
			}
		}
		
		return p;
	}
	
}
