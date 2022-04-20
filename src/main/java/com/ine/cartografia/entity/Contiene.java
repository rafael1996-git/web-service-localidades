package com.ine.cartografia.entity;

import java.util.List;

public class Contiene {

	private Integer claveLocalidad;
	private String localidad;
	private String tipoLocalidad;
	public Contiene() {
		
	}
	public Contiene(Integer claveLocalidad, String localidad, String tipoLocalidad) {
		this.claveLocalidad = claveLocalidad;
		this.localidad = localidad;
		this.tipoLocalidad = tipoLocalidad;
	}
	public Integer getClaveLocalidad() {
		return claveLocalidad;
	}
	public void setClaveLocalidad(Integer claveLocalidad) {
		this.claveLocalidad = claveLocalidad;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getTipoLocalidad() {
		return tipoLocalidad;
	}
	public void setTipoLocalidad(String tipoLocalidad) {
		this.tipoLocalidad = tipoLocalidad;
	}
	
	
	
}
