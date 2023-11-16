package com;

import java.util.*;

public class Reloj {
	
	//Estructura de una clase 
	
	/*
	 * Atributos
	 * Construcciones
	 * Getters & Setters
	 * toString
	 * 
	 * Comportamientos
	 * 1- Metodos nativos
	 * 2- Metodos heredados (se sobreescriben)
	 * 3- Metodos implementados (traidos de interfaces)
	 * 
	 */
	
	/*
	 * tipos
	 * color
	 * material
	 * tamaño
	 * mecanismo
	 * forma
	 */
	
	String tipo , color, material, forma, mecanismo, tamaño;
	double precio;
	
	public Reloj() {
		
	}
	
	public Reloj(String color, String mecanismo ){ //sobre carga , lo que existe dentro de los parantesis
		this.color = color;
		this.mecanismo = mecanismo;
		}

	public Reloj(String tipo, String color, String forma, String material, String mecanismo, String tamaño,
			double precio) {
		super();
		this.tipo = tipo;
		this.color = color;
		this.forma = forma;
		this.material = material;
		this.mecanismo = mecanismo;
		this.tamaño = tamaño;
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

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
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
				+ ", mecanismo=" + mecanismo + ", tamaño=" + tamaño + ", precio=" + precio + "]";
	}
	
	public String consultarHora() {

		Date d = new Date();
		return "La hora es: "+d.getHours()+":"+d.getMinutes();
		
	}

}
