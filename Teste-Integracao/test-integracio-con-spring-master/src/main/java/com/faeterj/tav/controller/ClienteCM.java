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

import com.faeterj.tav.model.ClienteMD;
import com.faeterj.tav.repository.ClienteRP;


@RestController
@RequestMapping("v1/api")
public class ClienteCM {

	@Autowired
	ClienteRP clienteRP;
	
	@GetMapping("/cliente")
	public  List<ClienteMD> getClientes(){
		
		return  clienteRP.findAll();
	}
	
	@GetMapping("/cliente/{id}")
	public ClienteMD  getCliente( @PathVariable int  id ) {
		
		Optional <ClienteMD>  clienteMD =   clienteRP.findById(id);
		if(!clienteMD.isPresent())
			return null;
		return  clienteMD.get();
	} 
	
	@PostMapping("/cliente")
	public  ResponseEntity<Object> addCliente( @RequestBody  ClienteMD  cliente){
		
		ClienteMD  clienteMD  = clienteRP.save(cliente);
		
		URI  location  = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
							.buildAndExpand(clienteMD.getId()).toUri();
		return  ResponseEntity.created(location).build();
	}
	
	
	@PutMapping("cliente/{id}")
	public  ResponseEntity<Object>  updateCliente( @RequestBody ClienteMD cliente,
													@PathVariable  Integer  id){
		
		Optional<ClienteMD> clienteMD  = clienteRP.findById(id);
		if(!clienteMD.isPresent())
			return ResponseEntity.notFound().build();
		
		cliente.setId(id);
		clienteRP.save(cliente);
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("cliente/{id}")
	public void  deleteCliente( @PathVariable Integer  id ) {
		clienteRP.deleteById(id);
	}
	
	
}
