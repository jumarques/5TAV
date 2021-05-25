package servico;

import java.util.ArrayList;

import dominio.Frete;
import dominio.ItensCarrinho;
import dominio.Produto;

public class FreteDao {
	private ProdutoNoCarrinho carrinho;
	Frete frete = new Frete ();
	Produto produto = new Produto ();
	ItensCarrinho itens = new ItensCarrinho ();
	int codProd = produto.getCodprod(); 
	int quantidade = itens.getQuantidade();
	float preco;
	float preco2;
	double valor = frete.CalcularFrete();
	int codCarrinho;
	
	public boolean AdicionarProduto ( int codProduto, int codcarrinho) 
	{
		Produto produto = new Produto();
		codProd = produto.getCodprod();
		
		ItensCarrinho p1 = new ItensCarrinho ();
		ArrayList <ItensCarrinho> AdicionarProduto= new ArrayList<ItensCarrinho>();
		AdicionarProduto.add(p1 );
		return false;
		
	}
	public double SimularFrete ( double preco, int quantidade)
	{
		double ValorTotal = 0;
		ValorTotal = (preco*quantidade); 
		return ValorTotal;
		
	}
	public double SimularPreco(double preco2,double valor )
	{
		valor+=preco2;
		
		return valor;
	}
	public void setProdutoNoCarrinho(ProdutoNoCarrinho itens) {
		// TODO Auto-generated method stub
		
	}
}
