package com;

public class Mouse {

	//variables o atributos
	String Color,Tipo,Diseño,Tamaño,Material;
	double Precio;
	
	//constructor vacio
	public Mouse() {
		
	}
	// constructor  lleno recibe 7
	
	public Mouse(String color, String tipo, String diseño, String tamaño, String material, double precio) {
		
		this.Color = color;
		this.Tipo = tipo;
		this.Diseño = diseño;
		this.Tamaño = tamaño;
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

	public String getDiseño() {
		return Diseño;
	}

	public void setDiseño(String diseño) {
		Diseño = diseño;
	}

	public String getTamaño() {
		return Tamaño;
	}

	public void setTamaño(String tamaño) {
		Tamaño = tamaño;
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
		return "Mouse [Color=" + Color + ", Tipo=" + Tipo + ", Diseño=" + Diseño + ", Tamaño=" + Tamaño + ", Material="
				+ Material + ", Precio=" + Precio + "]";
	}
	
	}
	

