package com;

public class Calzado {

	String color, marca, tipo, material_principal, material_suela, aseguramiento;
	double talla;
	
	
	
	public Calzado() {
		
	}

	public Calzado(String color, String marca, String tipo, String material_principal, String material_suela,
			String aseguramiento, double talla) {
		super();
		this.color = color;
		this.marca = marca;
		this.tipo = tipo;
		this.material_principal = material_principal;
		this.material_suela = material_suela;
		this.aseguramiento = aseguramiento;
		this.talla = talla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMaterial_principal() {
		return material_principal;
	}

	public void setMaterial_principal(String material_principal) {
		this.material_principal = material_principal;
	}

	public String getMaterial_suela() {
		return material_suela;
	}

	public void setMaterial_suela(String material_suela) {
		this.material_suela = material_suela;
	}

	public String getAseguramiento() {
		return aseguramiento;
	}

	public void setAseguramiento(String aseguramiento) {
		this.aseguramiento = aseguramiento;
	}

	public double getTalla() {
		return talla;
	}

	public void setTalla(double talla) {
		this.talla = talla;
	}

	@Override
	public String toString() {
		return "Calzado [color=" + color + ", marca=" + marca + ", tipo=" + tipo + ", material_principal="
				+ material_principal + ", material_suela=" + material_suela + ", aseguramiento=" + aseguramiento
				+ ", talla=" + talla + "]";
	}
	
	public double encogerCalzado() {
		talla = talla - 0.5;

		return talla;
	}
}
