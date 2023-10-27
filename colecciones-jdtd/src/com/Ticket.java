package com;

import java.util.Date;

public class Ticket {
	
	Date fecha;
	double montoDisponible;
	String tipoOperacion;
	int cajeroID;
	int folioOperacion;
	double montoTransferido;

	
	public Ticket() {
		
	}

	public Ticket(Date fecha, double montoDisponible, String tipoOperacion, int cajeroID, int folioOperacion) {
		super();
		this.fecha = fecha;
		this.montoDisponible = montoDisponible;
		this.tipoOperacion = tipoOperacion;
		this.cajeroID = cajeroID;
		this.folioOperacion = folioOperacion;
	}
	
	public Ticket(Date fecha, String tipoOperacion, int cajeroID, int folioOperacion,	double montoTransferido) {
		super();
		this.fecha = fecha;
		this.tipoOperacion = tipoOperacion;
		this.cajeroID = cajeroID;
		this.folioOperacion = folioOperacion;
		this.montoTransferido= montoTransferido;

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

	public String getTipoOperacion() {
		return tipoOperacion;
	}

	public void setTipoOperacion(String tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
	}

	public int getCajeroID() {
		return cajeroID;
	}

	public void setCajeroID(int cajeroID) {
		this.cajeroID = cajeroID;
	}

	public int getFolioOperacion() {
		return folioOperacion;
	}

	public void setFolioOperacion(int folioOperacion) {
		this.folioOperacion = folioOperacion;
	}

	@Override
	public String toString() {
		return "Ticket [fecha=" + fecha + ", montoDisponible=" + montoDisponible + ", tipoOperacion=" + tipoOperacion
				+ ", cajeroID=" + cajeroID + ", folioOperacion=" + folioOperacion + ", montoTransferido="
				+ montoTransferido + "]";
	}

	
	
	
	

}
