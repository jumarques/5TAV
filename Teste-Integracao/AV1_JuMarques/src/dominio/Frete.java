package dominio;

public class Frete {
	private int codFrete;
	private double peso;
	private double tamanho;
	private double valor;
	private double distancia;
	private int codProduto;
	public Frete (int codFrete, double peso, double tamanho, double valor, double distancia, int codProduto ) {
        this.setCodFrete(codFrete);
        this.setPeso(peso);
        this.setTamanho(tamanho);
        this.setValor((float) valor);
        this.setDistancia((float) distancia);
        this.setCodProduto(codProduto);
    }
	public Frete() {
		// TODO Auto-generated constructor stub
	}
	public int getCodFrete() {
		return codFrete;
	}
	public void setCodFrete(int codFrete) {
		this.codFrete = codFrete;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getDistancia() {
		return distancia;
	}
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	public int getCodProduto() {
		return codProduto;
	}
	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}
	public double CalcularFrete ()
	{
		double ValorFrete = 0;
		if (peso > 0.100)
		{
			if (tamanho > 45)
			{
				ValorFrete = 2.20 + 5.60;
				return ValorFrete;
			}
			else
			{
				ValorFrete = 2.20 + 7.60;
				return ValorFrete;
			}
		}
		else
		{
			if (peso > 0.500)
			{
				if (tamanho < 45)
				{
					ValorFrete = 6.20 + 5.60;
					return ValorFrete;
				}
				else
				{
					ValorFrete = 6.20 + 5.60;
					return ValorFrete;
				}
			}
			else
			{
				if (peso >1.00)
				{
					double x = peso * 4.20;
					ValorFrete = x +10;
					return ValorFrete;
				}
			}
		}
		return ValorFrete;
	}
}
