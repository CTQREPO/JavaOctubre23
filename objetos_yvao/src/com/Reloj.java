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
	 * Comportamiento
	 * 1 - Metodos nativos
	 * 2 - Metodos heredados(se sobreescriben)
	 * 3 - Metodos implemetados (traidos de interfaces)
	 */
	
	/*
	 * tipo
	 * color
	 * forma
	 * material
	 * mecanismo
	 * tama�o
	 */
	//atributos
	String tipo,color,forma,material,mecanismo,tama�o;
	double precio;
	
	//constructor vacio
	public Reloj() {	
		
	}
	// recibe 2 cosas
	public Reloj(String color,String mecanismo) {
		this.color = color;
		this.mecanismo = mecanismo;
	}
	// recibe 7 
	public Reloj(String tipo, String color, String forma, String material, String mecanismo, String tama�o,
			double precio) {
		
		this.tipo = tipo;
		this.color = color;
		this.forma = forma;
		this.material = material;
		this.mecanismo = mecanismo;
		this.tama�o = tama�o;
		this.precio = precio;
	}
// getters && setters
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

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
//toString
	
	@Override
	public String toString() {
		return "Reloj [tipo=" + tipo + ", color=" + color + ", forma=" + forma + ", material=" + material
				+ ", mecanismo=" + mecanismo + ", tama�o=" + tama�o + ", precio=" + precio + "]";
	}
	//metodo
	public String consultarhora() {
		Date d = new Date();
		return "La hora es:"+d.getHours()+":"+d.getMinutes();
	}


	}
	
	
	
	
	

