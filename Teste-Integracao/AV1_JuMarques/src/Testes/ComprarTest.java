package Testes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dominio.Cliente;
import servico.FreteDao;

import junit.framework.Assert;
import servico.CadastrarNovoCliente;
class ComprarTest {

	private static final Cliente Salvar = null;
	private static final String Fim = null;

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testeClienteIncluir ()
	{
		Cliente.salvarDados(Salvar.getLista());
		//assertEquals(Salvar.getCodCliente(), Cliente.getCodCliente());
		
	}
	@Test
	void testeClientePesquisar ()
	{
		assertEquals(Salvar.getCodCliente(), Cliente.getCodCliente());
	}
	@Test
void TesteExcluirCliente ()
{
	Cliente.excluir (Salvar.getLista());
	
	boolean result = Cliente.excluir (Cliente.getLista());
	boolean teste = Cliente.excluir (Salvar.getLista());
	assertEquals (teste,result);
}
	@Test
void FinalizarCompraTeste ()
{
		FreteDao Fim = new FreteDao ();
	FreteDao.SimularFrete(15, 6);
	double result = FreteDao.SimularFrete(15,6);
	double teste = Fim.SimularFrete(15,6);
	assertEquals (teste, result);
	
}
	@Test
void SimularCOMPRAtest ()
{
	FreteDao Fim = new FreteDao ();

	double result = FreteDao.SimularFrete(15.1,6);
	double teste = Fim.SimularFrete(15.1,6);
	assertEquals (teste, result);
}

	private Object getQuantidade() {
		// TODO Auto-generated method stub
		return null;
	}

	private Object getValor() {
		// TODO Auto-generated method stub
		return null;
	}
}
