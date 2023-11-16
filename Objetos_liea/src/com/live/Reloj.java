package com.live;

import java.util.Date;

public class Reloj {
	
	String color;
	String tipo;
	String material;
	String tama�o;
	String forma;
	String mecanismo;
	double precio;
	
	
	public Reloj() {///contructor vacio
		
	}

	public Reloj(String color,String mecanismo) {///con dos variables
		
		this.mecanismo = mecanismo;
		this.color = color;
	}

	public Reloj(String color, String tipo, String material, String tama�o, String forma, String mecanismo, double precio) {
	///CONSTRUCTOR LLENO
		
		this.color = color;
		this.tipo = tipo;
		this.material = material;
		this.tama�o = tama�o;
		this.forma = forma;
		this.mecanismo = mecanismo;
		this.precio= precio;
	
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) { 
		this.material = material;
	}


	public String getTama�o() {
		return tama�o;
	}


	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
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


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Reloj [color=" + color + ", tipo=" + tipo + ", material=" + material + ", tama�o=" + tama�o + ", forma="
				+ forma + ", mecanismo=" + mecanismo + ", precio=" + precio + "]";
	}
	
	
	public String consultaHora(){ ////METODO
		
		Date d = new Date();
				
		return"La hora es: "+d.getHours()+":"+d.getMinutes();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
