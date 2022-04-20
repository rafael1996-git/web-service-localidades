package com.ine.cartografia.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import com.ine.cartografia.controller.Controlador;
import com.ine.cartografia.entity.CodDto;
import com.ine.cartografia.entity.Contiene;

@Repository
public class ServiceImpl implements IDaoReposiory{
	
	@Autowired
    private JdbcTemplate jdbcTemplate;

	
	
	@Override
	public List<CodDto> get(Integer entidad,Integer ClaveMunicipio) {
		String sql = "Select distinct clave_localidad, localidad, tipo_localidad from geoloc.codigo_dto where clave_entidad = ? and clave_municipio = ?";
        @SuppressWarnings("deprecation")
		List<CodDto> dato = this.jdbcTemplate.query(sql, new Object[]{entidad,ClaveMunicipio}, new RowMapper<CodDto>() {
            @Override
            public CodDto mapRow(ResultSet rs, int i) throws SQLException {
            	CodDto f = new CodDto();
            	
            	
            	
            	
    		    f.setClaveLocalidad(rs.getInt("clave_localidad"));
    		    f.setLocalidad(rs.getString("localidad"));
    		    f.setTipoLocalidad(rs.getString("tipo_localidad"));
                return f;
            }
        });
        return dato;
    }

}
