package com;

public class Cobertor {

	String tamano, color, material, marca;
	double precio;
	
	public Cobertor() {
		
	}
	
	public Cobertor(String color, double precio) {
		this.color = color;
		this.precio = precio;
	}
	
	public Cobertor(String tamano, String color, String material, String marca, double precio) {
		super();
		this.tamano = tamano;
		this.color = color;
		this.material = material;
		this.marca = marca;
		this.precio = precio;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Cobertor [tamano=" + tamano + ", color=" + color + ", material=" + material + ", marca=" + marca
				+ ", precio=" + precio + "]";
	}
	
	
	
}
