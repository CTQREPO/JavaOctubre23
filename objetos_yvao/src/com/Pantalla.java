package com;

public class Pantalla {

	String resoluciom;
	String tipoPanel;
	double tamaño;
	int ppi;
	
	//constructor
	public Pantalla() {
		
	}

	public Pantalla(String resoluciom, String tipoPanel, double tamaño, int ppi) {
		super();
		this.resoluciom = resoluciom;
		this.tipoPanel = tipoPanel;
		this.tamaño = tamaño;
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

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
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
		return "Pantalla [resoluciom=" + resoluciom + ", tipoPanel=" + tipoPanel + ", tamaño=" + tamaño + ", ppi=" + ppi
				+ "]";
	}
	
	
}
