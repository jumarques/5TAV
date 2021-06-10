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
	int quantidade = ItensCarrinho.getQuantidade();
	static float preco;
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
		return true;
		
	}
	public static double SimularFrete (double preco, double quantidade )
	{
		double ValorTotal = 0;
		ValorTotal = (preco*quantidade); 
		return (int) ValorTotal;
		
	}
	public ProdutoNoCarrinho getCarrinho() {
		return carrinho;
	}
	public void setCarrinho(ProdutoNoCarrinho carrinho) {
		this.carrinho = carrinho;
	}
	public Frete getFrete() {
		return frete;
	}
	public void setFrete(Frete frete) {
		this.frete = frete;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public ItensCarrinho getItens() {
		return itens;
	}
	public void setItens(ItensCarrinho itens) {
		this.itens = itens;
	}
	public int getCodProd() {
		return codProd;
	}
	public void setCodProd(int codProd) {
		this.codProd = codProd;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		FreteDao.preco = preco;
	}
	public float getPreco2() {
		return preco2;
	}
	public void setPreco2(float preco2) {
		this.preco2 = preco2;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getCodCarrinho() {
		return codCarrinho;
	}
	public void setCodCarrinho(int codCarrinho) {
		this.codCarrinho = codCarrinho;
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
