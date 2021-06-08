package com.faeterj.tav.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Venta")
public class VentaMD {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne
	@JoinColumn( name="fk_id_cliente_venta", 
				 referencedColumnName="id" )
	private ClienteMD  clienteMD;
	
	@ManyToOne
	@JoinColumn( name ="fk_id_producto_venta",
				 referencedColumnName=" id" )
	private  ProductoMD productoMD;
	
	@ManyToOne
	@JoinColumn( name="fk_id_vendedor_venta",
				 referencedColumnName="id")
	private VendedorMD vendedorMD;

	public VentaMD() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ClienteMD getClienteMD() {
		return clienteMD;
	}

	public void setClienteMD(ClienteMD clienteMD) {
		this.clienteMD = clienteMD;
	}

	public ProductoMD getProductoMD() {
		return productoMD;
	}

	public void setProductoMD(ProductoMD productoMD) {
		this.productoMD = productoMD;
	}

	public VendedorMD getVendedorMD() {
		return vendedorMD;
	}

	public void setVendedorMD(VendedorMD vendedorMD) {
		this.vendedorMD = vendedorMD;
	}
	
	
	
	

}
