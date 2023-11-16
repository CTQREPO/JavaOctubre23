package com;

import java.util.Date;

public class Reloj {

	//Estructura de una Clase
	
	/*
	 * Atributos
	 * Constructores
	 * Getters & Setters
	 * toString
	 * 
	 * Comportamiento
	 * 1 - Metodos nativos
	 * 2 - Metodos heredados (se sobreescriben)
	 * 3 - Metodos implementados (traidos de interfaces)
	 */
	
	/*
	 * tipo
	 * color
	 * forma
	 * material
	 * mecanismo
	 * tamano
	 */
	
	
	
	String tipo, color, forma, material, mecanismo, tamano;
	double precio;
	//constructores
	public Reloj() {
	
	}
	
	public Reloj(String color, String mecanismo) {
		this.color = color;
		this.mecanismo = mecanismo;
		
	}
	public Reloj(String tipo, String color, String forma, String material, String mecanismo, String tamano,
			double precio) {
		this.tipo = tipo;
		this.color = color;
		this.forma = forma;
		this.material = material;
		this.mecanismo = mecanismo;
		this.tamano = tamano;
		this.precio = precio;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getForma() {
		return forma;
	}
	public void setForma(String forma) {
		this.forma = forma;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getMecanismo() {
		return mecanismo;
	}
	public void setMecanismo(String mecanismo) {
		this.mecanismo = mecanismo;
	}
	public String getTamano() {
		return tamano;
	}
	public void setTamano(String tamano) {
		this.tamano = tamano;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Reloj [tipo=" + tipo + ", color=" + color + ", forma=" + forma + ", material=" + material
				+ ", mecanismo=" + mecanismo + ", tamano=" + tamano + ", precio=" + precio + "]";
	}
	
	public String consultarHora() {
		
		
		Date d = new Date();
		return "La hora es: "+d.getHours()+":"+d.getMinutes();
	}
	
}
