package com;

public class Sudaderas {
	String tipo, tamaño, color, material;
	double precio;
	
	public Sudaderas() { //obejto vacio 
	}
	
	public Sudaderas (String color, String tamaño) {
		this.color = color;
		this.tamaño = tamaño;
	}
	
	public Sudaderas(String tipo, String tamaño, String color, String material, double precio) {
		super();
		this.tipo = tipo;
		this.tamaño = tamaño;
		this.color = color;
		this.material = material;
		this.precio = precio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Sudaderas [tipo=" + tipo + ", tamaño=" + tamaño + ", color=" + color + ", material=" + material
				+ ", precio=" + precio + "]";
	}
	


	
	

   
}

	
