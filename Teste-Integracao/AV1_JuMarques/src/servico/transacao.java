package servico;

import java.util.List;

import dominio.ItensCarrinho;

public interface transacao {
	public void salva(ItensCarrinho compras);
	public List<ItensCarrinho> encerrados();
	public List<ItensCarrinho> correntes();
	public void atualiza(ItensCarrinho compras);

}
