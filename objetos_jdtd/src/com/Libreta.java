package com;

public class Libreta {
	
	String tipo,tama�o,forma,calidad,cantidadhojas;
	double precio;
	public Libreta() {
			
		}
	public Libreta(String tipo, String tama�o, String forma, String calidad, String cantidadhojas, double precio) {
		super();
		this.tipo = tipo;
		this.tama�o = tama�o;
		this.forma = forma;
		this.calidad = calidad;
		this.cantidadhojas = cantidadhojas;
		this.precio = precio;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
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
	public String getCalidad() {
		return calidad;
	}
	public void setCalidad(String calidad) {
		this.calidad = calidad;
	}
	public String getCantidadhojas() {
		return cantidadhojas;
	}
	public void setCantidadhojas(String cantidadhojas) {
		this.cantidadhojas = cantidadhojas;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Libreta [tipo=" + tipo + ", tama�o=" + tama�o + ", forma=" + forma + ", calidad=" + calidad
				+ ", cantidadhojas=" + cantidadhojas + ", precio=" + precio + "]";
	}
	

}
