package com;

import java.util.Date;

public class Ticket {

	Date fecha;
	double montoDisponible;
	String tipoDeOperacion;
	int cajeroId;
	int folio;
	double montoTransferido;
	public Ticket() {
		
	}
	public Ticket(Date fecha, double montoDisponible, String tipoDeOperacion, int cajeroId, int folio, double montoTransferido) {
		super();
		this.fecha = fecha;
		this.montoDisponible = montoDisponible;
		this.tipoDeOperacion = tipoDeOperacion;
		this.cajeroId = cajeroId;
		this.folio = folio;
		this.montoTransferido = montoTransferido;
	}

	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public double getMontoDisponible() {
		return montoDisponible;
	}
	public void setMontoDisponible(double montoDisponible) {
		this.montoDisponible = montoDisponible;
	}
	public String getTipoDeOperacion() {
		return tipoDeOperacion;
	}
	public void setTipoDeOperacion(String tipoDeOperacion) {
		this.tipoDeOperacion = tipoDeOperacion;
	}
	public int getCajeroId() {
		return cajeroId;
	}
	public void setCajeroId(int cajeroId) {
		this.cajeroId = cajeroId;
	}
	public int getFolio() {
		return folio;
	}
	public void setFolio(int folio) {
		this.folio = folio;
	}

	@Override
	public String toString() {
		return "Ticket [fecha=" + fecha + ", montoDisponible=" + montoDisponible + ", tipoDeOperacion="
				+ tipoDeOperacion + ", cajeroId=" + cajeroId + ", folio=" + folio + ", montoTransferido="
				+ montoTransferido + "]";
	}
	
	public String imprimir() {
		return "Ticket [fecha=" + fecha + ", tipoDeOperacion="
				+ tipoDeOperacion + ", cajeroId=" + cajeroId + ", folio=" + folio + ", montoTransferido="
				+ montoTransferido + "]";
	}
	

	
}
