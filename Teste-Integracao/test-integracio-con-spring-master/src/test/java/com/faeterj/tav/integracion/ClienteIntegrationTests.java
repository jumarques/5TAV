package com.faeterj.tav.integracion;



import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

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
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.faeterj.tav.PruebaCeibaSoftwareApplication;
import com.faeterj.tav.model.ClienteMD;
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

public class ClienteIntegrationTests {
	
	private  String  BASE_URL =  "/v1/api/cliente";
	private  String  CONTENTE_TYPE  = "application/json;charset=UTF-8";
	
	@Autowired
	private WebApplicationContext wac;
	private MockMvc mockMvc;
	
    private ClienteMD clienteMD;
	
    
    
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
	
	@Test
	public  void  getClienteTest() throws Exception {
		
		 mockMvc.perform(get(BASE_URL+"/{id}",1))
				.andDo(print()).andExpect(status().isOk())
				.andExpect(MockMvcResultMatchers.content().contentType(CONTENTE_TYPE))
				.andExpect(jsonPath("$.id").value(1));
	}
	
	@Test
	public  void  getClientesTest() throws Exception {
		
		mockMvc.perform(get(BASE_URL))
				.andDo(print()).andExpect(status().isOk())
				.andExpect(MockMvcResultMatchers.content().contentType(CONTENTE_TYPE))
				.andExpect(jsonPath("$[0].id", is(1)));
	
	}
	
	@Test
	public  void  putClientesTest() throws Exception {
		
		mockMvc.perform(put(this.BASE_URL+"/{id}",1)
				.contentType(CONTENTE_TYPE)
				.content(this.createCliente()))
				.andExpect(status().is(204));
	}
	
	@Test
	public  void  deleteClienteTest() throws Exception {
		
		mockMvc.perform(delete(this.BASE_URL+"/{id}",1)
				.contentType(CONTENTE_TYPE)
				.content(this.createCliente()))
				.andExpect(status().is(204));
	}
	
	public   String createCliente() throws JsonProcessingException {
		
		clienteMD = new ClienteMD();
		clienteMD.setNombre("catalina");
		clienteMD.setApellido("Prado");
		clienteMD.setIdentificacion("89898989");
		
		ObjectMapper  objectMapper = new ObjectMapper();
		objectMapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
		
		ObjectWriter  objectWriter = objectMapper.writer().withDefaultPrettyPrinter();
		
		String  clienteJson = objectWriter.writeValueAsString(clienteMD);
		return clienteJson;

	}
}
