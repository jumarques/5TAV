package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dominio.Produto;
import servico.CadastrarNovoCliente;

class CadastrarNovoClienteTest {
CadastrarNovoCliente cadastrar = new CadastrarNovoCliente (null, "11111-11");

	@BeforeEach
	void setUp() throws Exception {
	
	}

	@Test 
	void test() {
		//CadastrarNovoCliente cadastrar = new CadastrarNovoCliente (null, "11111-11");
		boolean teste = false;
		boolean result = cadastrar.salvarDados(null, "11111-11");
		assertEquals (teste,result);

}
	@Test 
	void test2() {
		//CadastrarNovoCliente cadastrar = new CadastrarNovoCliente ("1123456", "11111-11");
		boolean teste = true;
		boolean result = cadastrar.salvarDados("1123456", "11111-11");
		assertEquals (teste,result);

}
	@Test 
	void test3() {
		//CadastrarNovoCliente cadastrar = new CadastrarNovoCliente (null, null);
		boolean teste = false;
		boolean result = cadastrar.salvarDados(null, null);
		assertEquals (teste,result);

}
}
