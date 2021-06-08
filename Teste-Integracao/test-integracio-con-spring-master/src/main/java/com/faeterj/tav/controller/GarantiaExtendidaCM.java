package com.faeterj.tav.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.faeterj.tav.model.GarantiaExtendidaMD;
import com.faeterj.tav.repository.GarantiaExtendidaRP;

@RestController
@RequestMapping("v1/api")
public class GarantiaExtendidaCM {

	@Autowired
	GarantiaExtendidaRP garantiaExtendidaRP;
	
	@GetMapping("/garantia")
	public  List<GarantiaExtendidaMD> getClientes(){
		
		return  garantiaExtendidaRP.findAll();
	}
	
	@GetMapping("/garantia/{id}")
	public GarantiaExtendidaMD  getCliente( @PathVariable int  id ) {
		
		Optional <GarantiaExtendidaMD>  garantiaMD =   garantiaExtendidaRP.findById(id);
		if(!garantiaMD.isPresent())
			return null;
		return  garantiaMD.get();
	} 
	
	@PostMapping("/garantia")
	public  ResponseEntity<Object> addCliente( @RequestBody  GarantiaExtendidaMD  garantia){
		
		GarantiaExtendidaMD  garantiaMD  = garantiaExtendidaRP.save(garantia);
		
		URI  location  = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
							.buildAndExpand(garantiaMD.getId()).toUri();
		return  ResponseEntity.created(location).build();
	}
	
	
	@PutMapping("garantia/{id}")
	public  ResponseEntity<Object>  updateCliente( @RequestBody GarantiaExtendidaMD garantia,
													@PathVariable  Integer  id){
		
		Optional<GarantiaExtendidaMD> garantiaMD  = garantiaExtendidaRP.findById(id);
		if(!garantiaMD.isPresent())
			return ResponseEntity.notFound().build();
		
		garantia.setId(id);
		garantiaExtendidaRP.save(garantia);
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("garantia/{id}")
	public void  deleteCliente( @PathVariable Integer  id ) {
		garantiaExtendidaRP.deleteById(id);
	}
	

}
