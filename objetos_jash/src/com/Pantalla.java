package com;

public class Pantalla {
	String resolucion;
	String tipoPanel;
	double tama�o;
	int ppi;
	
	public Pantalla() {
		
	}

	public Pantalla(String resolucion, String tipoPanel, double tama�o, int ppi) {
		super();
		this.resolucion = resolucion;
		this.tipoPanel = tipoPanel;
		this.tama�o = tama�o;
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

	@Override
	public String toString() {
		return "Pantalla [resolucion=" + resolucion + ", tipoPanel=" + tipoPanel + ", tama�o=" + tama�o + ", ppi=" + ppi
				+ "]";
	}
	
	
}
