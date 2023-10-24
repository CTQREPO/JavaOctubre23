package com;

public class Articulo {
	int id, cantidadStock;
	String nombre, codigoBarras, fabricacion;
	double precio;

	public Articulo() {
		// TODO Auto-generated constructor stub
	}

	public Articulo(int id, int cantidadStock, String nombre, String codigoBarras, String fabricacion, double precio) {
		this.id = id;
		this.cantidadStock = cantidadStock;
		this.nombre = nombre;
		this.codigoBarras = codigoBarras;
		this.fabricacion = fabricacion;
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidadStock() {
		return cantidadStock;
	}

	public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getFabricacion() {
		return fabricacion;
	}

	public void setFabricacion(String fabricacion) {
		this.fabricacion = fabricacion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Articulo [id=" + id + ", cantidadStock=" + cantidadStock + ", nombre=" + nombre + ", codigoBarras="
				+ codigoBarras + ", fabricacion=" + fabricacion + ", precio=" + precio + "]";
	}
}
