package testes;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import dominio.Produto;

public class ProdutoTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	public void ValidarCodFalse() {
		Produto produto = new Produto (120, null, null, 0);
		boolean teste = false;
		boolean result = produto.ValidarCod ();
		assertEquals (teste,result);
	}
	@Test
	public void ValidarCodigoTrue() {
		Produto produto = new Produto (1230, null, null, 0);
		boolean teste = false;
		boolean result = produto.ValidarCod ();
		assertEquals (teste,result);
	}
	@Test
	public void ValidarProdutoCodFalse() {
		Produto produto = new Produto (154, "sorvete", null, 0);
		boolean teste = false;
		boolean result = produto.ValidarProduto();
		assertEquals (teste,result);
	}
	@Test
	public void ValidarProdutoFalseCodTrue() {
		Produto produto = new Produto (1001, null, null, 0);
		boolean teste = false;
		boolean result = produto.ValidarProduto();
		assertEquals (teste,result);
	}
	@Test
	public void ValidarEmpresaCodFalse ()
	{
		Produto produto = new Produto (114, "Sorvetes", "comida", 0);
		boolean teste = false;
		boolean result = produto.ValidarValor();
		assertEquals (teste,result);
	}
	@Test
	public void ValidarEmpresaTipoFalse ()
	{
		Produto produto = new Produto (1000, "Sorvetes", "creme", 0);
		boolean teste = false;
		boolean result = produto.ValidarValor();
		assertEquals (teste,result);
	}
	@Test
	public void ValidarEmpresaTipoFaseNULL()
	{
		Produto produto = new Produto (1000, "Sorvetes", null, 0);
		boolean teste = false;
		boolean result = produto.ValidarValor();
		assertEquals (teste,result);
	}
	
	@Test
	public void ValidarPrecoMaior()
	{
		Produto produto = new Produto (1000, "Sorvetes", "comida", 62.50);
		boolean teste = false;
		boolean result = produto.ValidarValor();
		assertEquals (teste,result);
	}
	@Test
	public void ValidarPrecoTudoErrado()
	{
		Produto produto = new Produto (1000, "Sorvetes", null, 52.50);
		boolean teste = false;
		boolean result = produto.ValidarValor();
		assertEquals (teste,result);
	}
	@Test
	public void ValidarPrecoProdutoFalse()
	{
		Produto produto = new Produto (1000, null, "lasanha", 52.50);
		boolean teste = false;
		boolean result = produto.ValidarValor();
		assertEquals (teste,result);
	}
	@Test
	public void ValidarPrecoCodFalso()
	{
		Produto produto = new Produto (332, "Sorvetes", "comida", 32.50);
		boolean teste = false;
		boolean result = produto.ValidarValor();
		assertEquals (teste,result);
	}
	@Test
	public void ValidarPrecoTipoErrado()
	{
		Produto produto = new Produto (1000, "Lanche duplo", "comidas", 32.50);
		boolean teste = false;
		boolean result = produto.ValidarValor();
		assertEquals (teste,result);
	}
}
