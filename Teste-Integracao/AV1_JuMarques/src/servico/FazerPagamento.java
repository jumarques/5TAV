package servico;

public class FazerPagamento {
	private Pagamento pg;
String nome;
double total;
double pagamento;

public boolean pagamento(String nome, double total, double pagamento )
{ 
	if (total==pagamento)
	{
		if (nome!=null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	else
	{
		return false;
	}
}
}
