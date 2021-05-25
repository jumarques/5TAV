package dominio;

import java.util.List;

public class Cliente {
private int codCliente;
private String cep;
private String cpf;
public Cliente (int codCliente, String cep, String cpf ) {
    this.setCodCliente(codCliente);
    this.setCep(cep);
    this.setCpf(cpf);
}
public Cliente() {
	// TODO Auto-generated constructor stub
}
public int getCodCliente() {
	return codCliente;
}
public void setCodCliente(int codCliente) {
	this.codCliente = codCliente;
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
public void salvarDados ()
{

}
public List<Cliente> cadastrados() {
	// TODO Auto-generated method stub
	return null;
}

public void atualiza(Cliente cliente) {
	// TODO Auto-generated method stub
	
}
}
