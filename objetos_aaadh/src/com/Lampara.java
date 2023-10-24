package com;

public class Lampara {

	String tipo, forma, material, tama�o;

	public Lampara() {
	}
	public Lampara(String tipo, String forma, String material, String tama�o) {
		super();
		this.tipo = tipo;
		this.forma = forma;
		this.material = material;
		this.tama�o = tama�o;
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
	public String getTama�o() {
		return tama�o;
	}
	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}
	@Override
	public String toString() {
		return "Lampara [tipo=" + tipo + ", forma=" + forma + ", material=" + material + ", tama�o=" + tama�o + "]";

	}
}