package com.persistence.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

	@Entity
	@Table(name = "VENTAS")
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "venta_id", scope = Ventas.class)
	
	public class Ventas implements Serializable{

		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="vid_auto")
		@SequenceGenerator(name="vid_auto", sequenceName="VENTAS_SEQ", allocationSize=1)
		
		
		
		@Column(name="VENTA_ID", columnDefinition="NUMBER")
		int venta_id;
		@ManyToOne
		@JoinColumn(name="EMPLEADO_ID", columnDefinition="NUMBER")
		Empleados empleado;
		@ManyToOne
		@JoinColumn(name="CLIENTE_ID", columnDefinition="NUMBER")
		Customers cliente;
		@Column(name="FECHA_VENTA", columnDefinition="DATE")
		Date fecha_venta;
		@Column(name="SUBTOTAL", columnDefinition="NUMBER(5,2)")
		double subtotal;
		@Column(name="TOTAL", columnDefinition="NUMBER(5,2)")
		double total;
		
		
		public int getVenta_id() {
			return venta_id;
		}
		public void setVenta_id(int venta_id) {
			this.venta_id = venta_id;
		}
		public Empleados getEmpleado() {
			return empleado;
		}
		public void setEmpleado(Empleados empleado) {
			this.empleado = empleado;
		}
		public Customers getCliente() {
			return cliente;
		}
		public void setCliente(Customers cliente) {
			this.cliente = cliente;
		}
		public Date getFecha_venta() {
			return fecha_venta;
		}
		public void setFecha_venta(Date fecha_venta) {
			this.fecha_venta = fecha_venta;
		}
		public double getSubtotal() {
			return subtotal;
		}
		public void setSubtotal(double subtotal) {
			this.subtotal = subtotal;
		}
		public double getTotal() {
			return total;
		}
		public void setTotal(double total) {
			this.total = total;
		}
		
		
	}
