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

import com.faeterj.tav.model.VentaMD;
import com.faeterj.tav.repository.VentaRP;

@RestController
@RequestMapping("v1/api")
public class VentaCM {

	@Autowired
	VentaRP ventaRP;
	
	
	@GetMapping("/venta")
	public  List<VentaMD> getClientes(){
		
		return  ventaRP.findAll();
	}
	
	@GetMapping("/venta/{id}")
	public VentaMD  getCliente( @PathVariable int  id ) {
		
		Optional <VentaMD>  ventaMD =   ventaRP.findById(id);
		if(!ventaMD.isPresent())
			return null;
		return  ventaMD.get();
	} 
	
	@PostMapping("/venta")
	public  ResponseEntity<Object> addCliente( @RequestBody  VentaMD  venta){
		
		VentaMD  ventaMD  = ventaRP.save(venta);
		
		URI  location  = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
							.buildAndExpand(ventaMD.getId()).toUri();
		return  ResponseEntity.created(location).build();
	}
	
	
	@PutMapping("venta/{id}")
	public  ResponseEntity<Object>  updateCliente( @RequestBody VentaMD venta,
													@PathVariable  Integer  id){
		
		Optional<VentaMD> ventaMD  = ventaRP.findById(id);
		if(!ventaMD.isPresent())
			return ResponseEntity.notFound().build();
		
		venta.setId(id);
		ventaRP.save(venta);
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("venta/{id}")
	public void  deleteCliente( @PathVariable Integer  id ) {
		ventaRP.deleteById(id);
	}
	
}
