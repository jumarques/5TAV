package dominio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
private static int codCliente;
private String cep;
private String cpf;
public Cliente (int codCliente, String cep, String cpf ) {
    this.setCodCliente(codCliente);
    this.setCep(cep);
    this.setCpf(cpf);
}
public static ArrayList<Cliente> getLista() {
	return lista;
}
public void setLista(ArrayList<Cliente> lista) {
	Cliente.lista = lista;
}
static ArrayList<Cliente> lista = new ArrayList<Cliente>();
public Cliente() {
	// TODO Auto-generated constructor stub
}
public static int getCodCliente() {
	return codCliente;
}
public void setCodCliente(int codCliente) {
	Cliente.codCliente = codCliente;
}
public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}
public String getCep() {
	return cep;
}
public void setCep(String cep) {
	this.cep = cep;
}

public boolean validarDados (String cpf, String Cep) 
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
public ArrayList<Cliente> SalvarDados () 
{ 
	
	return getLista(); 
}
public List<Cliente> cadastrados() {
	// TODO Auto-generated method stub
	return null;
}

public void atualiza(Cliente cliente) {
	// TODO Auto-generated method stub
	
}
public static boolean excluir (ArrayList<Cliente> arrayList)
{
	return true;
}
public static void salvarDados(ArrayList<Cliente> lista2) {
	// TODO Auto-generated method stub
	
}
public static boolean excluir(ArrayList<Cliente> lista2) {
	// TODO Auto-generated method stub
	return false;
}
}
