package com;

import java.util.Date;

public class Relog {

	// Estructura de una clase

	/*
	 * Una clase es la sintetizacion de un objeto fisico o abstracto tambien se le
	 * conoce como un modelo o platilla
	 * 
	 * Atrubutos Constructotes Getters y setters toString
	 * 
	 * Comportamiento 1- metodos nativos 2- metodos heredados (se sobreescriben) 3-
	 * Metodos implementados (traidos de interfaz)
	 * 
	 */

	String tipo, color, forma, mecanismo, tama�o;
	double precio;

	public Relog() {

	}
	
	public Relog(String color, String mecanismo) {
		this.color = color;
		this.mecanismo = mecanismo;
	}

	public Relog(String tipo, String color, String forma, String mecanismo, String tama�o, double precio) {
		this.tipo = tipo;
		this.color = color;
		this.forma = forma;
		this.mecanismo = mecanismo;
		this.tama�o = tama�o;
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

	@Override
	public String toString() {
		return "Relog [tipo=" + tipo + ", color=" + color + ", forma=" + forma + ", mecanismo=" + mecanismo
				+ ", tama�o=" + tama�o + ", precio=" + precio + "]";
	}
	
//	public String consultarHora() {
//		Date hora = new Date();
//		return "La hora es: " + hora.getHours()+ ":" + hora.getMinutes();
//	}
	
	public void consultarHora() {
		Date hora = new Date();
		System.out.println("La hora es: " + hora.getHours()+ ":" + hora.getMinutes());
	}
	
}
