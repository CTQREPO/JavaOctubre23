package com;

public class Mouse {

	//variables o atributos
	String Color,Tipo,Dise�o,Tama�o,Material;
	double Precio;
	
	//constructor vacio
	public Mouse() {
		
	}
	// constructor  lleno recibe 7
	
	public Mouse(String color, String tipo, String dise�o, String tama�o, String material, double precio) {
		
		this.Color = color;
		this.Tipo = tipo;
		this.Dise�o = dise�o;
		this.Tama�o = tama�o;
		this.Material = material;
		this.Precio = precio;
	}
	//constructor recibe 2
	public Mouse(String color, String material) {
		this.Color = color;
		this.Material = material;
		
	}
//getters && setters
	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public String getDise�o() {
		return Dise�o;
	}

	public void setDise�o(String dise�o) {
		Dise�o = dise�o;
	}

	public String getTama�o() {
		return Tama�o;
	}

	public void setTama�o(String tama�o) {
		Tama�o = tama�o;
	}

	public String getMaterial() {
		return Material;
	}

	public void setMaterial(String material) {
		Material = material;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}
//toString

	@Override
	public String toString() {
		return "Mouse [Color=" + Color + ", Tipo=" + Tipo + ", Dise�o=" + Dise�o + ", Tama�o=" + Tama�o + ", Material="
				+ Material + ", Precio=" + Precio + "]";
	}
	
	}
	

