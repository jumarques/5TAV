package testes;
import dominio.ItensCarrinho;
import servico.FreteDao;
import servico.ProdutoNoCarrinho;
import org.junit.jupiter.api.Test;
import org.junit.Before;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SimularFreteTest{
private FreteDao frete;	
private ProdutoNoCarrinho itens;

@Before
public void setUp(){
   frete = new FreteDao();
   itens = mock(ProdutoNoCarrinho.class);
   frete.setProdutoNoCarrinho(itens);
}
@Test
public void testCalcularPreco ()
{
    when(itens.SimularPreco(20.0,10.0)).thenReturn(30.0);
    when(itens.SimularFrete(2,30.0)).thenReturn(60.0);
    when(itens.AdicionarProduto(9,10,"tesoura")).thenReturn(true);

}

	
	
}


