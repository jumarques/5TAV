package com.faeterj.tav.utilitis.test;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.annotation.IfProfileValue;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import com.faeterj.tav.PruebaCeibaSoftwareApplication;

@Retention(RetentionPolicy.RUNTIME)
@IfProfileValue(name="testprofile",value="integrationtest")

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.MOCK,classes =PruebaCeibaSoftwareApplication.class)
@AutoConfigureMockMvc
@TestPropertySource(
  locations = "classpath:application.properties")
public @interface IntegrationTest {

}
