package dominio;
import java.util.Date;

public class Carrinho {
private int idcarrinho;
private Date dataCompra;
private double valorTotal;
private double frete;

public Carrinho (int idcarrinho, Date dataCompra, double valorTotal, double frete)
{
	this.setIdcarrinho(idcarrinho);
	this.setDataCompra(dataCompra);
	this.setValorTotal(valorTotal);
	this.setFrete(frete);
}

public int getIdcarrinho() {
	return idcarrinho;
}

public void setIdcarrinho(int idcarrinho) {
	this.idcarrinho = idcarrinho;
}

public Date getDataCompra() {
	return dataCompra;
}

public void setDataCompra(Date dataCompra) {
	this.dataCompra = dataCompra;
}

public double getValorTotal() {
	return valorTotal;
}

public void setValorTotal(double valorTotal) {
	this.valorTotal = valorTotal;
}

public double getFrete() {
	return frete;
}

public void setFrete(double frete) {
	this.frete = frete;
}


}
