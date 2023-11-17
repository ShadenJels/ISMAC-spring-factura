package com.distribuida.entities;

import java.util.Date;

public class Facturas {
	private Date fecha;
	private Float total_neto;
	private Float iva;
	private Float total;
	private int id_cliente;
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Float getTotal_neto() {
		return total_neto;
	}
	public void setTotal_neto(Float total_neto) {
		this.total_neto = total_neto;
	}
	public Float getIva() {
		return iva;
	}
	public void setIva(Float iva) {
		this.iva = iva;
	}
	public Float getTotal() {
		return total;
	}
	public void setTotal(Float total) {
		this.total = total;
	}
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	@Override
	public String toString() {
		return "Facturas [fecha=" + fecha + ", total_neto=" + total_neto + ", iva=" + iva + ", total=" + total
				+ ", id_cliente=" + id_cliente + "]";
	}
	
	
}
