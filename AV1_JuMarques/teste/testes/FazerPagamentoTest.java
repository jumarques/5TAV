package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import servico.FazerPagamento;
public class FazerPagamentoTest {
FazerPagamento fazer = new FazerPagamento();
	@BeforeEach
	void setUp() throws Exception {
	}

	void test() {
		
		boolean teste = false;
		boolean result = fazer.pagamento("Juliana", 15.50, 15.30);
		assertEquals (teste,result);

}
	@Test 
	void test2() {
		boolean teste = true;
		boolean result = fazer.pagamento("Juliana", 15.50, 15.50);
		assertEquals (teste,result);

}
	@Test 
	void test3() {
		boolean teste = false;
		boolean result = fazer.pagamento(null, 15.50, 15.30);
		assertEquals (teste,result);

}

}
