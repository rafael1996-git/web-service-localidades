package com.ine.cartografia.controller;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.ine.cartografia.entity.CodDto;
import com.ine.cartografia.entity.CodigoDto;
import com.ine.cartografia.entity.Contiene;
import com.ine.cartografia.entity.ResponseOk;
import com.ine.cartografia.service.IDaoReposiory;
import com.ine.cartografia.service.IServiceDao;


@RestController()
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class Controlador {

	
	
	@Autowired
	private IServiceDao Service;
	
	@Autowired
	private IDaoReposiory repository;

	 public static Integer otro;

	 
	
	 @GetMapping(value = "/Clave")
		public ResponseOk  getEntidad(@RequestParam  (required = false) Integer ClaveEntidad,@RequestParam (required = false)Integer ClaveMunicipio)throws Exception{

			ResponseOk reponse = new ResponseOk();

			 System.out.println(" se ah encontrado resultado "+ClaveEntidad+" y "+ClaveMunicipio);
			 Controlador.otro=ClaveMunicipio;
			 System.out.println(" se ah encontrado  Controlador.otro  "+Controlador.otro);

				try {

					List<CodDto> resultado= repository.get(ClaveEntidad,ClaveMunicipio);
//					Iterable<CodDto> result = getEn(ClaveEntidad);
//					List<Contiene> resultado = getAll(result);
					 System.out.println(" resultado  "+resultado);


					if (resultado != null) {
						if (resultado.isEmpty()) {

							reponse.setEstatus(02);
							reponse.setResultado( resultado);
							reponse.setMsj("Operacion Exitosa: no se encontro registro");
						

						} else {
						
							 System.out.println(" listAgrupo otro  "+resultado.size());

							
							
							reponse.setEstatus(04);
							reponse.setResultado(resultado);
							reponse.setMsj("Operacion Exitosa");

						}

					} else {
						reponse.setEstatus(01);
						reponse.setMsj(Response.serverError().toString());

					}
					return reponse;
				} catch (Exception e) {
					throw new ResponseStatusException(
					           HttpStatus.NOT_FOUND, " not found");
				}
}
public List<Contiene> getAll(Iterable<CodDto> result) {
	List<Contiene> listAgrupo = new ArrayList<Contiene>();

	for (CodDto codigo : result) {
		Contiene dato = new Contiene();
		 System.out.println(" getClaveLocalidad  "+codigo.getClaveLocalidad());
		 System.out.println(" getLocalidad  "+codigo.getLocalidad());
		 System.out.println(" getTipoLocalidad  "+codigo.getTipoLocalidad());

		dato.setClaveLocalidad(codigo.getClaveLocalidad());
		dato.setLocalidad(codigo.getLocalidad());
		dato.setTipoLocalidad(codigo.getTipoLocalidad());
		listAgrupo.add(dato);
		

	

	}
	Set<Contiene> listaDeMpios = new LinkedHashSet<Contiene>(listAgrupo);
	listAgrupo.clear();
	listAgrupo.addAll(listaDeMpios);
	 System.out.println(" listAgrupo  "+listAgrupo.toString());


	return listAgrupo;
}


private Iterable<CodDto> getEn( Integer claveEntidad,Integer ClaveMunicipio) throws Exception {
	// TODO Auto-generated method stub
	return repository.get(claveEntidad,ClaveMunicipio);
}
	 
	 
	 
	 
}
