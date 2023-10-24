package com;

import java.util.Date;

public class Reloj {
//	
//	Estructura de una clase
//	
//	Atributos
//	Constructores
//	Getters y Setters
//	toString
//	
//	Comportamiento
//	1- Método nativos
//	2- Métodos heredados (se sobreescriben)
//	3- Métodos implementados (traidos de interfaces)
	
	
	//Atributos de reloj
	/*
	*Tipo
	*Material
	*Color
	*Mecanismo
	*Forma
	/*/
	
	String tipo, color, mecanismo, material, forma, tamanio;
	double precio;
	
	//constructors
	
	public Reloj() {
		
		}
	
	public Reloj(String color, String mecanismo) {
		super();
		this.color = color;
		this.mecanismo = mecanismo;
	}

	public Reloj(String tipo, String color, String mecanismo, String material, String forma, String tamanio,
			double precio) {
		super();
		this.tipo = tipo;
		this.color = color;
		this.mecanismo = mecanismo;
		this.material = material;
		this.forma = forma;
		this.tamanio = tamanio;
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

	public String getMecanismo() {
		return mecanismo;
	}

	public void setMecanismo(String mecanismo) {
		this.mecanismo = mecanismo;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Reloj [tipo=" + tipo + ", color=" + color + ", mecanismo=" + mecanismo + ", material=" + material
				+ ", forma=" + forma + ", tamanio=" + tamanio + ", precio=" + precio + "]";
	}
	

	public String consultarHora() {
		Date d = new Date();
		
		
		return "La hora es: " + d.getHours() + ":" +  d.getMinutes() + ":" + d.getSeconds();
	}
}
