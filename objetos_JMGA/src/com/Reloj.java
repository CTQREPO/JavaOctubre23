package com;

import java.util.Date;

public class Reloj {
	
	//Estructura de una clase 
	/*
	 * Atributos
	 * Constructores 
	 * Getters & Setters
	 * toString 
	 * 
	 *   Comportamiento
	 *   1- metodos nativos
	 *   2- metodos heredados(se sobre escriben )
	 *   3-Metodos Implementados(traidos de interfaces)
	 *    
	 * */

	
	/*
	 * Reloj atributos :
	 * color -Stirng
	 * tiopo-String
	 * mecanismo-String 
	 * forma-String
	 * material-String
	 * 
	 * */
	

	String tipo, color, forma, material, mecanismo, tamaño;
	double precio;

	public Reloj() {//contrsuctor vacio
		
	}
	
	public Reloj (String color, String mecanismo) {
		this.color = color;
		this.mecanismo = mecanismo;
		
	}

	public Reloj(String tipo, String color, String forma, String material, String mecanismo, String tamaño,
			double precio) {
		super();this.tipo = tipo;
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

	
	
	
	public String consultaHora () {
		Date d = new Date();
		return "La hora es: "+d.getHours()+":"+d.getMinutes(); 
	}
	
	
	
	
	
	
	
	
	
	
	
}