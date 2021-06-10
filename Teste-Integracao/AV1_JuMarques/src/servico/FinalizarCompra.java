package servico;

import java.util.ArrayList;
import java.util.List;

import dominio.ItensCarrinho;

public abstract class FinalizarCompra implements ProdutoNoCarrinho{

	private static List<ItensCarrinho> compras = new ArrayList<ItensCarrinho>();
	public void salva(ItensCarrinho compras) {
		compras.add(compras);
	}

	public List<ItensCarrinho> encerrados() {
		
		List<ItensCarrinho> filtrados = new ArrayList<ItensCarrinho>();
		for(ItensCarrinho compras : compras) {
			if(compras.isEncerrado()) filtrados.add(compras);
		}

		return filtrados;
	}
	
	public List<ItensCarrinho> correntes() {
		
		List<ItensCarrinho> filtrados = new ArrayList<ItensCarrinho>();
		for(ItensCarrinho compras : compras) {
			if(!compras.isEncerrado()) filtrados.add(compras);
		}

		return filtrados;
	}
	
	public void atualiza(ItensCarrinho compras) { /* faz nada! */ }
}