package com.distribuida.entities;

import java.util.Date;

public class DetalleFactura {
	private int cantidad;
	private Float subtotal;
	private int id_factura;
	private int id_producto;
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Float getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(Float subtotal) {
		this.subtotal = subtotal;
	}
	public int getId_factura() {
		return id_factura;
	}
	public void setId_factura(int id_factura) {
		this.id_factura = id_factura;
	}
	public int getId_producto() {
		return id_producto;
	}
	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}
	@Override
	public String toString() {
		return "DetalleFactura [cantidad=" + cantidad + ", subtotal=" + subtotal + ", id_factura=" + id_factura
				+ ", id_producto=" + id_producto + "]";
	}
	
	

}
