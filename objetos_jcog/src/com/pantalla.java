package com;

public class pantalla {

	String resolucion;
	String panel;
	double tama�o;
	int ppi;
	
	public pantalla() {
		
	}

	public pantalla(String resolucion, String panel, double tama�o, int ppi) {
		super();
		this.resolucion = resolucion;
		this.panel = panel;
		this.tama�o = tama�o;
		this.ppi = ppi;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public String getPanel() {
		return panel;
	}

	public void setPanel(String panel) {
		this.panel = panel;
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
		return "pantalla [resolucion=" + resolucion + ", panel=" + panel + ", tama�o=" + tama�o + ", ppi=" + ppi + "]";
	}
	
	
	
	
}
