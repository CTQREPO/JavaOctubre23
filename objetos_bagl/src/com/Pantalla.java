package com;

public class Pantalla {
	
	String resolucion;
	String tipoPanel;
	String tamanio;
	int ppi;
	
	public Pantalla() {
		
	}

	public Pantalla(String resolucion, String tipoPanel, String tamanio, int ppi) {
		super();
		this.resolucion = resolucion;
		this.tipoPanel = tipoPanel;
		this.tamanio = tamanio;
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

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public int getPpi() {
		return ppi;
	}

	public void setPpi(int ppi) {
		this.ppi = ppi;
	}

	@Override
	public String toString() {
		return "Pantalla [resolucion=" + resolucion + ", tipoPanel=" + tipoPanel + ", tamanio=" + tamanio + ", ppi="
				+ ppi + "]";
	}

	
}
