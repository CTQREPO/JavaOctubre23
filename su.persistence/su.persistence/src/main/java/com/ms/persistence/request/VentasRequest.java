
package com.ms.persistence.request;

import java.util.Date;
import javax.validation.constraints.*;;

public class VentasRequest {

	int ventaId;
	int empleadoId;
	int clienteId;
	Date fechaVenta;
	double subtotalVenta;
	double totalVenta;

	public VentasRequest(int ventaId, int empleadoId, int clienteId, Date fechaVenta, double subtotalVenta,
			double totalVenta) {
		this.ventaId = ventaId;
		this.empleadoId = empleadoId;
		this.clienteId = clienteId;
		this.fechaVenta = fechaVenta;
		this.subtotalVenta = subtotalVenta;
		this.totalVenta = totalVenta;
	}

	public int getVentaId() {
		return ventaId;
	}

	public void setVentaId(int ventaId) {
		this.ventaId = ventaId;
	}

	public int getEmpleadoId() {
		return empleadoId;
	}

	public void setEmpleadoId(int empleadoId) {
		this.empleadoId = empleadoId;
	}

	public int getClienteId() {
		return clienteId;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}

	public Date getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public double getSubtotalVenta() {
		return subtotalVenta;
	}

	public void setSubtotalVenta(double subtotalVenta) {
		this.subtotalVenta = subtotalVenta;
	}

	public double getTotalVenta() {
		return totalVenta;
	}

	public void setTotalVenta(double totalVenta) {
		this.totalVenta = totalVenta;
	}

	@Override
	public String toString() {
		return "VentasRequest [ventaId=" + ventaId + ", empleadoId=" + empleadoId + ", clienteId=" + clienteId
				+ ", fechaVenta=" + fechaVenta + ", subtotalVenta=" + subtotalVenta + ", totalVenta=" + totalVenta
				+ "]";
	}
}
