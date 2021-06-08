package com.faeterj.tav.integracion;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import java.time.LocalDateTime;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.faeterj.tav.PruebaCeibaSoftwareApplication;
import com.faeterj.tav.model.GarantiaExtendidaMD;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.MOCK,
				classes =PruebaCeibaSoftwareApplication.class)
@AutoConfigureMockMvc
@TestPropertySource(
  locations = "classpath:application.properties")
public class GarantiaExtendidaIntegrationTest {
	
	private  String  BASE_URL =  "/v1/api/cliente";
	private  String  CONTENTE_TYPE  = "application/json;charset=UTF-8";
	
	@Autowired
	private WebApplicationContext wac;
	private MockMvc mockMvc;
	
    private GarantiaExtendidaMD garantiaExtendidaMD;
	
    
    
    @Before
    public void setup() throws Exception {
    	this.mockMvc= MockMvcBuilders.webAppContextSetup(this.wac).build();
    
    }
    
    @Test
	public  void  addClienteTest() throws Exception {
	  
				
		mockMvc.perform(post(this.BASE_URL)
				.contentType(CONTENTE_TYPE)
				.content(this.createCliente()))
				.andExpect(status().is(201));
	
	}
    
    public   String createCliente() throws JsonProcessingException {
		
		LocalDateTime localDate = LocalDateTime.now();
		garantiaExtendidaMD = new GarantiaExtendidaMD();
		garantiaExtendidaMD.setFechaSolicitudGarantia(localDate);
		
		ObjectMapper  objectMapper = new ObjectMapper();
		objectMapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
		
		ObjectWriter  objectWriter = objectMapper.writer().withDefaultPrettyPrinter();
		
		String  clienteJson = objectWriter.writeValueAsString(garantiaExtendidaMD);
		return clienteJson;

	}

}
