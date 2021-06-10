package servico;

import java.util.List;

import dominio.ItensCarrinho;

public interface ProdutoNoCarrinho {
	void salva(ItensCarrinho compras);
    List<ItensCarrinho> terminandocompra();
    List<ItensCarrinho> sacola();
    public boolean AdicionarProduto ( int codProduto, int codcarrinho, String Nom);
    public double SimularFrete ( double preco, int quantidade);
    public double SimularPreco(double preco2,double valor );
    void atualiza(ItensCarrinho compras);
	Object SimularFrete(int i, double d);
}
