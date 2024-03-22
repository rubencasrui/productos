package com.ruben.practica.app.models;

public class Producto {

	Long id;
	String nombre;
	String marca;
	Double precio;
	
	public Producto() {
		
	}
	
	public Producto(Long id, String nombre, String marca, Double precio) {
		super();
		this.id     = id;
		this.nombre = nombre;
		this.marca  = marca;
		this.precio = precio;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public Double getPrecio() {
		return precio;
	}
	
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
}
