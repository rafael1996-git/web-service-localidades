package com.ine.cartografia.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ine.cartografia.entity.CodigoDto;


public interface IServiceDao extends CrudRepository<CodigoDto, Long>{

	@Query(value = "Select * from geoloc.codigo_dto where  clave_entidad = ?1 ", nativeQuery = true)
	List<CodigoDto>  findByCEntidad(int entidad);
	
	@Query(value = "Select distinct clave_localidad, localidad, tipo_localidad from geoloc.codigo_dto where clave_entidad =?1 and clave_municipio = ?1 ", nativeQuery = true)
	List<CodigoDto>  findByCEntidadMunicipio(Integer entidad, Integer municipio);

	
}
