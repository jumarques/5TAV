package servico;
import java.util.List;

import dominio.Cliente;
public class CadastrarNovoCliente extends Cliente implements SalvandoDados {
Cliente cliente = new Cliente ();
String cpf =cliente.getCpf();
String Cep = cliente.getCep();
public CadastrarNovoCliente (String string, String string1) {
	// TODO Auto-generated constructor stub
}

public boolean salvarDados (String cpf, String Cep) 
{ 
	if (cpf==null && Cep==null)
	{
		return false;
	}
	else
		if (cpf!=null && Cep!=null)
		{
			return true;
		}
	
	return false;
}
public void salva(Cliente cliente) {
	// TODO Auto-generated method stub
	
}
public List<Cliente> cadastrados() {
	// TODO Auto-generated method stub
	return null;
}
public void atualiza(Cliente cliente) {
	// TODO Auto-generated method stub
	
}

}
