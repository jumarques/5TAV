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

import com.faeterj.tav.model.ProductoMD;
import com.faeterj.tav.repository.ProductoRP;

@RestController
@RequestMapping("v1/api")
public class ProductoCM {
	
	@Autowired
	ProductoRP productoRP;
	
	@GetMapping("/producto")
	public  List<ProductoMD> getClientes(){
		
		return  productoRP.findAll();
	}
	
	@GetMapping("/producto/{id}")
	public ProductoMD  getCliente( @PathVariable int  id ) {
		
		Optional <ProductoMD>  productoMD =   productoRP.findById(id);
		if(!productoMD.isPresent())
			return null;
		return  productoMD.get();
	} 
	
	@PostMapping("/producto")
	public  ResponseEntity<Object> addCliente( @RequestBody  ProductoMD  producto){
		
		ProductoMD  productoMD  = productoRP.save(producto);
		
		URI  location  = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
							.buildAndExpand(productoMD.getId()).toUri();
		return  ResponseEntity.created(location).build();
	}
	
	
	@PutMapping("producto/{id}")
	public  ResponseEntity<Object>  updateCliente( @RequestBody ProductoMD  producto,
													@PathVariable  Integer  id){
		
		Optional <ProductoMD>  productoMD = productoRP.findById(id);
		if(!productoMD.isPresent())
			return ResponseEntity.notFound().build();
		
		producto.setId(id);
		productoRP.save(producto);
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("producto/{id}")
	public void  deleteCliente( @PathVariable Integer  id ) {
		productoRP.deleteById(id);
	}

}
