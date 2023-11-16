package com;

public class Pantalla {

	String resolucion;
	String tipoPanel;
	double tamano;
	int ppi;
	
	public Pantalla() {
		
	}

	public Pantalla(String resolucion, String tipoPanel, double tamano, int ppi) {
		super();
		this.resolucion = resolucion;
		this.tipoPanel = tipoPanel;
		this.tamano = tamano;
		this.ppi = ppi;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public String getTipoPanel() {
		return tipoPanel;
	}

	public void setTipoPanel(String tipoPanel) {
		this.tipoPanel = tipoPanel;
	}

	public double getTamano() {
		return tamano;
	}

	public void setTamano(double tamano) {
		this.tamano = tamano;
	}

	public int getPpi() {
		return ppi;
	}

	public void setPpi(int ppi) {
		this.ppi = ppi;
	}

	@Override
	public String toString() {
		return "Pantalla [resolucion=" + resolucion + ", tipoPanel=" + tipoPanel + ", tamano=" + tamano + ", ppi=" + ppi
				+ "]";
	}
	
	
}