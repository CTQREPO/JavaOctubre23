package com;

public class Lapiz {
	
	String color;
	String tipo;
	int numnero;
	
	
	public Lapiz() {
		
	}


	public Lapiz(String color, String tipo, int numnero) {
		super();
		this.color = color;
		this.tipo = tipo;
		this.numnero = numnero;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String isTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getNumnero() {
		return numnero;
	}


	public void setNumnero(int numnero) {
		this.numnero = numnero;
	}


	@Override
	public String toString() {
		return "Lapiz [color=" + color + ", tipo=" + tipo + ", numnero=" + numnero + "]";
	} 
	
	
	public void escribir () {
		System.out.println("EL lapiz pinto correctamente");
	}
	

}
