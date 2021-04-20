package ViewModel;

public class Produto {
	private int codprod;
	private String produto;
	private String empresa;
	private float preco;
	private String tipo;
	public Produto (int codprod, String produto, String empresa, float preco, String tipo) {
        this.codprod=codprod;
        this.produto = produto;
        this.empresa=empresa;
        this.preco=preco;
        this.tipo=tipo;
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
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
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
	public boolean ValidarCod (int codprod)
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
	boolean ValidarProduto (int cod, String produto)
	{	boolean VCod = this.ValidarCod(codprod);
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
	public boolean ValidarEmpresaTipo (int codprod, String empresa, String tipo)
	{
		boolean ValEmpresa;
		boolean ValProd = this.ValidarProduto(codprod,produto);
		boolean ValCod = this.ValidarCod(codprod);
		if (ValProd==true && ValCod==true)
		{
			if (empresa!=null)
			{
				if (tipo!="beleza"||tipo!="comida"||tipo!="utilidades")
				{
					ValEmpresa=false;
				}
				ValEmpresa=true;

			}
			else
			{
				ValEmpresa=false;
				return ValEmpresa;
			} 
		}
		else
		{
			ValEmpresa = false;
			return ValEmpresa;
		}
		return ValEmpresa;
	}
	
	
}
