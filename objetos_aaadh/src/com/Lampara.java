package com;

public class Lampara {

	String tipo, forma, material, tamaño;

	public Lampara() {
	}
	public Lampara(String tipo, String forma, String material, String tamaño) {
		super();
		this.tipo = tipo;
		this.forma = forma;
		this.material = material;
		this.tamaño = tamaño;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
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
	public String getTamaño() {
		return tamaño;
	}
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}
	@Override
	public String toString() {
		return "Lampara [tipo=" + tipo + ", forma=" + forma + ", material=" + material + ", tamaño=" + tamaño + "]";

	}
}