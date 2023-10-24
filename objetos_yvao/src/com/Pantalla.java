package com;

public class Pantalla {

	String resoluciom;
	String tipoPanel;
	double tama�o;
	int ppi;
	
	//constructor
	public Pantalla() {
		
	}

	public Pantalla(String resoluciom, String tipoPanel, double tama�o, int ppi) {
		super();
		this.resoluciom = resoluciom;
		this.tipoPanel = tipoPanel;
		this.tama�o = tama�o;
		this.ppi = ppi;
	}

	//getters && setters
	public String getResoluciom() {
		return resoluciom;
	}

	public void setResoluciom(String resoluciom) {
		this.resoluciom = resoluciom;
	}

	public String getTipoPanel() {
		return tipoPanel;
	}

	public void setTipoPanel(String tipoPanel) {
		this.tipoPanel = tipoPanel;
	}

	public double getTama�o() {
		return tama�o;
	}

	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}

	public int getPpi() {
		return ppi;
	}

	public void setPpi(int ppi) {
		this.ppi = ppi;
	}

	//toString
	@Override
	public String toString() {
		return "Pantalla [resoluciom=" + resoluciom + ", tipoPanel=" + tipoPanel + ", tama�o=" + tama�o + ", ppi=" + ppi
				+ "]";
	}
	
	
}
