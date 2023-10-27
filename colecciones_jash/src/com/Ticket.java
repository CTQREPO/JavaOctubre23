package com;

import java.util.Date;

public class Ticket {
	Date fecha;
	double montoDisponible;
	String tipoOperaciones;
	int cajeroID;
	int folioOperaciones;
	double montoTransferido;
	
	public Ticket() {
	}

	public Ticket(Date fecha, double montoDisponible, String tipoOperaciones, int cajeroID, int folioOperaciones) {
		super();
		this.fecha = fecha;
		this.montoDisponible = montoDisponible;
		this.tipoOperaciones = tipoOperaciones;
		this.cajeroID = cajeroID;
		this.folioOperaciones = folioOperaciones;
	}
	
	public Ticket(Date fecha,String tipoOperaciones, int cajeroID, int folioOperaciones, double montoTransferido) {
		super();
		this.fecha = fecha;
		this.tipoOperaciones = tipoOperaciones;
		this.cajeroID = cajeroID;
		this.folioOperaciones = folioOperaciones;
		this.montoTransferido = montoTransferido ; 
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

	public String getTipoOperaciones() {
		return tipoOperaciones;
	}

	public void setTipoOperaciones(String tipoOperaciones) {
		this.tipoOperaciones = tipoOperaciones;
	}

	public int getCajeroID() {
		return cajeroID;
	}

	public void setCajeroID(int cajeroID) {
		this.cajeroID = cajeroID;
	}

	public int getFolioOperaciones() {
		return folioOperaciones;
	}

	public void setFolioOperaciones(int folioOperaciones) {
		this.folioOperaciones = folioOperaciones;
	}
	
	@Override
	public String toString() {
		return "Ticket [fecha=" + fecha + ", montoDisponible=" + montoDisponible + ", tipoOperaciones="
				+ tipoOperaciones + ", cajeroID=" + cajeroID + ", folioOperaciones=" + folioOperaciones
				+ ", montoTransferido=" + montoTransferido + "]";
	}

	public String imprimir() {
		return "Ticket [fecha=" + fecha + ", tipoOperaciones=" + tipoOperaciones + ", cajeroID=" + cajeroID
				+ ", folioOperaciones=" + folioOperaciones + ", montoTransferido=" + montoTransferido + "]";
	}

	
	
	
	
}
