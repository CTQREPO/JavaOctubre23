package com;

public class Sudaderas {
	String tipo, tama�o, color, material;
	double precio;
	
	public Sudaderas() { //obejto vacio 
	}
	
	public Sudaderas (String color, String tama�o) {
		this.color = color;
		this.tama�o = tama�o;
	}
	
	public Sudaderas(String tipo, String tama�o, String color, String material, double precio) {
		super();
		this.tipo = tipo;
		this.tama�o = tama�o;
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

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
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
		return "Sudaderas [tipo=" + tipo + ", tama�o=" + tama�o + ", color=" + color + ", material=" + material
				+ ", precio=" + precio + "]";
	}
	


	
	

   
}

	
