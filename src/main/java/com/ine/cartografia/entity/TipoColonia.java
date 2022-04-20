package com.ine.cartografia.entity;

/**
 * @author Alejandro Sandoval Rodriguez
 * @version 1.3.3
 * clase creada con la estructura de la tabla se esta usando javax persistence
 * EntityManager es uno de los objetos m�s relevantes de toda el API,
 *  pues es quien administra el ciclo de vida de todas las entidades.
 */
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * The persistent class for the tipo_colonia database table.
 * 
 */
@Entity
@Table(name = "tipo_colonia", schema = "geoloc")
public class TipoColonia implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * @param tipoColoniaId id de la colonia
	 * @pram descripcion descripcion de la colonia
	 * @param descripcion_corta descripcion corta de la colonia
	 */
	@JsonIgnore
	@Id
	@Column(name = "tipo_colonia_id")
	private Integer tipoColoniaId;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@JsonIgnore
	@Column(name = "descripcion_corta")
	private String descripcionCorta;

	public TipoColonia() {
	}

	public Integer getTipoColoniaId() {
		return this.tipoColoniaId;
	}

	public void setTipoColoniaId(Integer tipoColoniaId) {
		this.tipoColoniaId = tipoColoniaId;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcionCorta() {
		return this.descripcionCorta;
	}

	public void setDescripcionCorta(String descripcionCorta) {
		this.descripcionCorta = descripcionCorta;
	}

}