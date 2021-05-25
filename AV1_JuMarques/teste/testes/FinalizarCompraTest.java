package testes;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.caelum.leilao.infra.dao.LeilaoDao;
import br.com.caelum.leilao.infra.dao.RepositorioDeLeiloes;
import servico.Pagamento;
import servico.ProdutoNoCarrinho;
import servico.transacao;
import servico.FinalizarCompra;

class FinalizarCompraTest {
private transacao tras;
	@BeforeEach
	void setUp() {
		transacao salva = mock (transacao.class);
		
	}

	@Test
	void Finalizar() {
	    Class<FinalizarCompra> filtrados;
		when(FinalizarCompra.class).thenReturn(filtrados);

	}

}
