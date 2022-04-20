package com.ine.cartografia.entity;


// Generated 29/01/2020 05:48:07 PM by Hibernate Tools 5.2.12.Final
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "codigo_dto", schema = "geoloc")
public class CodigoDto implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;



	private Integer claveEntidad;
	private String nombreEntidad;
	private Integer claveMunicipio;
	private String nombreMunicipio;
	private Integer claveLocalidad;
	private String tipoLocalidad;
	private Integer ClaveMColonia;
	private String nombreColonia;
	private String tipoGeo;
	private Long control;
	private String localidad;
	private Long clasificacion;
	private Integer cp;
	/**
	 * Constructor por default
	 */
	public CodigoDto() {
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="clave_entidad" )
	public Integer getClaveEntidad() {
		return claveEntidad;
	}
	public void setClaveEntidad(Integer claveEntidad) {
		this.claveEntidad = claveEntidad;
	}
 	@JsonIgnore
	@Column(name="nombre_entidad" )
	public String getNombreEntidad() {
		return nombreEntidad;
	}
	public void setNombreEntidad(String nombreEntidad) {
		this.nombreEntidad = nombreEntidad;
	}
 	@JsonIgnore
	@Column(name="clave_municipio" )
	public Integer getClaveMunicipio() {
		return claveMunicipio;
	}
	public void setClaveMunicipio(Integer claveMunicipio) {
		this.claveMunicipio = claveMunicipio;
	}
 	@JsonIgnore
	@Column(name="nombre_municipio" )
	public String getNombreMunicipio() {
		return nombreMunicipio;
	}
	public void setNombreMunicipio(String nombreMunicipio) {
		this.nombreMunicipio = nombreMunicipio;
	}
	
	@Column(name="clave_localidad" )
	public Integer getClaveLocalidad() {
		return claveLocalidad;
	}
	public void setClaveLocalidad(Integer claveLocalidad) {
		this.claveLocalidad = claveLocalidad;
	}
 	
	@Column(name="tipo_localidad" )
	public String getTipoLocalidad() {
		return tipoLocalidad;
	}
	public void setTipoLocalidad(String tipoLocalidad) {
		this.tipoLocalidad = tipoLocalidad;
	}
 	@JsonIgnore
	@Column(name="clave_municipio_colonia" )
	public Integer getClaveMColonia() {
		return ClaveMColonia;
	}
	public void setClaveMColonia(Integer claveMColonia) {
		ClaveMColonia = claveMColonia;
	}
	@JsonIgnore
	@Column(name="nombre_colonia" )
	public String getNombreColonia() {
		return nombreColonia;
	}
	public void setNombreColonia(String nombreColonia) {
		this.nombreColonia = nombreColonia;
	}
	@JsonIgnore
	@Column(name="tipo_geo" )
	public String getTipoGeo() {
		return tipoGeo;
	}
	public void setTipoGeo(String tipoGeo) {
		this.tipoGeo = tipoGeo;
	}
	@JsonIgnore
	@Column(name="control" )
	public Long getControl() {
		return control;
	}
	public void setControl(Long control) {
		this.control = control;
	}
 	
	@Column(name="localidad" )
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	@JsonIgnore
	@Column(name="clasificacion" )
	public Long getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(Long clasificacion) {
		this.clasificacion = clasificacion;
	}
	@JsonIgnore
	@Column(name="cp" )
	public Integer getCp() {
		return cp;
	}
	public void setCp(Integer cp) {
		this.cp = cp;
	}
	public CodigoDto(Integer claveLocalidad, String tipoLocalidad, String localidad) {
		this.claveLocalidad = claveLocalidad;
		this.tipoLocalidad = tipoLocalidad;
		this.localidad = localidad;
	}
	@Override
	public String toString() {
		return "CodigoDto [claveLocalidad=" + claveLocalidad + ", tipoLocalidad=" + tipoLocalidad + ", localidad="
				+ localidad + "]";
	}

	


	
	

	
	

	

}
