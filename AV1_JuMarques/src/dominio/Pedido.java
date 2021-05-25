package dominio;

public class Pedido {
	int idPedido;
	int codCliente;
	double ValorTotal;
	int codFrete;

	public Pedido (int idPedido, int codCliente, double ValorTotal, int codFrete ) {  
		this.setIdPedido(idPedido);
	    this.setCodCliente(codCliente);
	    this.setValorTotal(ValorTotal);
	    this.setCodFrete(codFrete);
	}
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public int getCodCliente() {
		return codCliente;
	}
	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}
	public double getValorTotal() {
		return ValorTotal;
	}
	public void setValorTotal(double valorTotal) {
		ValorTotal = valorTotal;
	}
	public int getCodFrete() {
		return codFrete;
	}
	public void setCodFrete(int codFrete) {
		this.codFrete = codFrete;
	}
	public double CalcularValorTotalFrete ()
	{
		double ValorTotal = 0;
		Frete frete = new Frete ();
		ValorTotal = frete.CalcularFrete(); 
		return ValorTotal;
		
	}
	public double CalcularValorTotal()
	{
		double ValorTotal = 0;
		Frete frete = new Frete ();
		ValorTotal = frete.CalcularFrete(); 
		return ValorTotal;
		
	}
	public double PrecoTotal()
	{
		double Valor = 0;
		Frete frete = new Frete ();
		double x = frete.CalcularFrete();
		Produto produto = new Produto ();
		double z = produto.getPreco();
		Valor= z+x;
		return Valor;
	}
}