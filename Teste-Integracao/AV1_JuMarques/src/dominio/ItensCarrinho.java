package dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import dominio.Produto;
import servico.ProdutoNoCarrinho;
import dominio.Carrinho;
import dominio.Frete;
public class ItensCarrinho {
	
private static int quantidade;
public int getIdItens() {
		return idItens;
	}
	public void setIdItens(int idItens) {
		this.idItens = idItens;
	}
	public int getCodCarrinho() {
		return codCarrinho;
	}
	public void setCodCarrinho(int codCarrinho) {
		this.codCarrinho = codCarrinho;
	}
	public int getCodProd() {
		return (int) codProd;
	}
	public void setCodProd(int codProd) {
		this.codProd = codProd;
	}
	public static int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

private int idItens;
private int codCarrinho;
private int codProd;
private double preco;
private String nomeProduto;
public ItensCarrinho ()
{
	this.setIdItens (idItens);
	this.setCodCarrinho (codCarrinho);
	this.setCodProd (codProd);
	this.setQuantidade (quantidade);
	this.setPreco(preco);
	this.setNomeProduto(nomeProduto);
}

public ItensCarrinho(ProdutoNoCarrinho produtoNoCarrinho) {
	// TODO Auto-generated constructor stub
}
public boolean AdicionarProduto ( Produto codProduto, Carrinho carrinho) 
{
	Produto produto = new Produto();
	codProd = produto.getCodprod();
	
	ItensCarrinho p1 = new ItensCarrinho ();
	ArrayList <ItensCarrinho> AdicionarProduto= new ArrayList<ItensCarrinho>();
	AdicionarProduto.add(p1 );
	return false;
	
}
public static double SimularFrete ( int quantidade, double preco)
{Frete frete = new Frete ();
quantidade = getQuantidade();
	double ValorTotal = 0;
	
	preco = frete.CalcularFrete();
	ValorTotal = (preco*quantidade); 
	return ValorTotal;
	
}
public double SimularPreco()
{
	Frete frete = new Frete ();
	double x = frete.CalcularFrete();
	Produto produto = new Produto ();
	double z = produto.getPreco();
	return z+x;
}
public void add(ItensCarrinho compras) {
	// TODO Auto-generated method stub
	
}
public boolean terminandocompra() {
	// TODO Auto-generated method stub
	return false;
}
public List<ItensCarrinho> getItensCarrinho() {
	List<ItensCarrinho> itens = null;
	return Collections.unmodifiableList(itens);
}
public boolean isterminando() {
	// TODO Auto-generated method stub
	return false;
}
public boolean isComprando() {
	// TODO Auto-generated method stub
	return false;
}
public boolean isEncerrado() {
	// TODO Auto-generated method stub
	return false;
}
}
