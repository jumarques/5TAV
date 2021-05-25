package servico;
import java.util.List;

import dominio.Cliente;
public interface SalvandoDados {
	void salva(Cliente cliente);
    List<Cliente> cadastrados();
    void atualiza(Cliente cliente);
}
