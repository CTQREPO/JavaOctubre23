package com.dto;

import java.util.List;

public class ProductosPorClienteDTO {
	
	private String nombre;
	
	//lista
	private List<DetalleProductoDTO> productos;
	
	//calcular totales
	
	private double total;

	public ProductosPorClienteDTO(String nombre, List<DetalleProductoDTO> productos, double total) {
		super();
		this.nombre = nombre;
		this.productos = productos;
		this.total = total;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<DetalleProductoDTO> getProductos() {
		return productos;
	}

	public void setProductos(List<DetalleProductoDTO> productos) {
		this.productos = productos;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	
	

}
