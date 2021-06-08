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

import com.faeterj.tav.model.VendedorMD;
import com.faeterj.tav.repository.VendedorRP;

@RestController
@RequestMapping("/v1/api")
public class VendedorCM {

	@Autowired
	VendedorRP  vendedorRP;
	
	@GetMapping("/vendedor")
	public  List<VendedorMD> getClientes(){
		
		return  vendedorRP.findAll();
	}
	
	@GetMapping("/vendedor/{id}")
	public VendedorMD  getCliente( @PathVariable int  id ) {
		
		Optional <VendedorMD>  vendedorMD =   vendedorRP.findById(id);
		if(!vendedorMD.isPresent())
			return null;
		return  vendedorMD.get();
	} 
	
	@PostMapping("/vendedor")
	public  ResponseEntity<Object> addCliente( @RequestBody  VendedorMD  vendedor){
		
		VendedorMD  vendedorMD  = vendedorRP.save(vendedor);
		
		URI  location  = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
							.buildAndExpand(vendedorMD.getId()).toUri();
		return  ResponseEntity.created(location).build();
	}
	
	
	@PutMapping("vendedor/{id}")
	public  ResponseEntity<Object>  updateCliente( @RequestBody VendedorMD vendedor,
													@PathVariable  Integer  id){
		
		Optional<VendedorMD> vendedorMD  = vendedorRP.findById(id);
		if(!vendedorMD.isPresent())
			return ResponseEntity.notFound().build();
		
		vendedor.setId(id);
		vendedorRP.save(vendedor);
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("vendedor/{id}")
	public void  deleteCliente( @PathVariable Integer  id ) {
		vendedorRP.deleteById(id);
	}
	
	
	
}
