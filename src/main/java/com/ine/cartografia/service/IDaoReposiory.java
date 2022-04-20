package com.ine.cartografia.service;

import java.util.List;

import com.ine.cartografia.entity.CodDto;

public interface IDaoReposiory {

	public List<CodDto> get(Integer entidad,Integer municipio);
}
