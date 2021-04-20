package ViewModel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProdutoTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	public void ValidarCodFalse() {
		Produto produto = new Produto();
		boolean teste = false;
		boolean result = produto.ValidarCod(123);
		assertEquals (teste,result);
	}
	@Test
	public void ValidarTrue() {
		Produto produto = new Produto();
		boolean teste = true;
		boolean result = produto.ValidarCod(1230);
		assertEquals (teste,result);
	}
	@Test
	public void ValidarProdutoFalse() {
		Produto produto = new Produto();
		boolean teste = false;
		boolean result = produto.ValidarProduto(154, "Sorvete");
		assertEquals (teste,result);
	}
	@Test
	public void ValidarProdutoTrue() {
		Produto produto = new Produto();
		boolean teste = false;
		boolean result = produto.ValidarProduto(1000, "Sorvetes");
		assertEquals (teste,result);
	}
	@Test
	public void ValidarEmpresaTipoFalse1 ()
	{
		Produto produto = new Produto();
		boolean teste = false;
		boolean result = produto.ValidarEmpresaTipo(114, "Sorvetes", "comida");
		assertEquals (teste,result);
	}
	@Test
	public void ValidarEmpresaTipoFalse21 ()
	{
		Produto produto = new Produto();
		boolean teste = false;
		boolean result = produto.ValidarEmpresaTipo(1000, "Sorvetes", "creme");
		assertEquals (teste,result);
	}
	@Test
	public void ValidarEmpresaTipoFalse3 ()
	{
		Produto produto = new Produto();
		boolean teste = false;
		boolean result = produto.ValidarEmpresaTipo(999, "Sorvetes", "creme");
		assertEquals (teste,result);
	}
	@Test
	public void ValidarEmpresaTipoFalse4 ()
	{
		Produto produto = new Produto();
		boolean teste = false;
		boolean result = produto.ValidarEmpresaTipo(1000, "Sorvetes", "comida");
		assertEquals (teste,result);
	}
}
