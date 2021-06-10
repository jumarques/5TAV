package dominio;

import java.util.ArrayList;

public class Produto {
	private int codprod;
	private String produto;
	private String tipo;
	private float preco;
	private double tamanho;
	private double peso;
	
	public Produto (int codprod, String produto, String tipo, double preco, double tamanho, double peso) {
        this.codprod=codprod;
        this.produto = produto;
        this.preco=(float) preco;
        this.tipo=tipo;
        this.setTamanho(tamanho);
        this.setPeso(peso);
    }
	public Produto(int i, String string, String string2, double d) {
		// TODO Auto-generated constructor stub
	}
	public Produto() {
		// TODO Auto-generated constructor stub
	}
	public int getCodprod() {
		return codprod;
	}
	public void setCodprod(int codprod) {
		this.codprod = codprod;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public boolean ValidarCod ()
	{
		
		if (codprod<1000 )
		{
			boolean Validar = false;
			return Validar;
		}
		else 
		{
			boolean Validar = true;
			return Validar;
		}
	}
	public boolean ValidarProduto ()
	{	boolean VCod = this.ValidarCod();
		boolean ValidarP = false;
		if (VCod==true)
		{
			if (produto=="")
			{
				ValidarP=true;
				return ValidarP;
			}
			else
			{
				ValidarP=false;
				return ValidarP;
			}
		}
		else
		{
			return ValidarP;
		}
	}
	
	public boolean ValidarValor()
	{
		boolean ValValor = false;
		boolean ValEmp = this.ValidarProduto();
		if (ValEmp==true)
		{
			if (tipo.equals("beleza"))
			{
				if (preco>=(5.50) && preco<=(50.00))
				{
					ValValor=true;
					return ValValor;
				}
				else
				{
					ValValor=false;
					return ValValor;
				}
			}
			else
			{
				if (tipo.equals("comida"))
				{
					if (preco>(20.50) && preco<(39.00))
					{
						ValValor=true;
						return ValValor;
					}
					else
					{
						ValValor=false;
						return ValValor;
					}
				}
				else
				{
					if (preco>=(1.99))
					{
						ValValor=true;
						return ValValor;
					}
					else
					{
						ValValor=false;
						return ValValor;
						
					}
				} 
			}

}
		return ValValor;
	}
	
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}
