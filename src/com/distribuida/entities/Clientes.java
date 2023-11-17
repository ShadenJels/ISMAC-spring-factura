package com.distribuida.entities;

import java.util.Date;

public class Clientes {
	private int cedula;
	private String nombre;
	private String apellido;
	private int edad;
	private Date fecha_nac;
	private String direccion;
	private int telefono;
	private String correo;
	
	public Clientes() {}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Date getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(Date fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Clientes [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", fecha_nac=" + fecha_nac + ", direccion=" + direccion + ", telefono=" + telefono + ", correo="
				+ correo + "]";
	}
	
	
}
