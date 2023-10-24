package com.compu;

public class Compu {
	
	String marca;
	String tamaño;
	int almacenamiento;
	int memoria;
	boolean portatil;
	double precio;
	
	public Compu(String marca, String tamaño, int almacenamiento, int memoria, boolean portatil, double precio) {
		
		this.marca = marca;
		this.tamaño = tamaño;
		this.almacenamiento = almacenamiento;
		this.memoria = memoria;
		this.portatil = portatil;
		this.precio = precio;
	}
	
	public Compu() {
	///se llena en la clase con c1.setalmacenamiento.....
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public int getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public boolean isPortatil() {
		return portatil;
	}

	public void setPortatil(boolean portatil) {
		this.portatil = portatil;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Compu [marca=" + marca + ", tamaño=" + tamaño + ", almacenamiento=" + almacenamiento + ", memoria="
				+ memoria + ", portatil=" + portatil + ", precio=" + precio + "]";
	}
	
	
}
