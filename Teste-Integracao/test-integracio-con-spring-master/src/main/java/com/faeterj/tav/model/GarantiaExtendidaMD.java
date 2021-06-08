package com.faeterj.tav.model;


import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.faeterj.tav.utilitis.DeserializeDate;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@Entity
@Table(name="garantiaExtendida")
public class GarantiaExtendidaMD {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@JsonProperty("nombre_cliente")
	private String nombreCliente;
	
	@Column
	private double precio;
	

	@JsonDeserialize(using= DeserializeDate.class)
	@JsonProperty("fecha_solicitud_garantia")
	private LocalDateTime  fechaSolicitudGarantia;
	
	

	@JsonProperty("fecha_fin_grantia")
	private LocalDateTime fechaFinGarantia;
	
	@ManyToOne
	@JoinColumn(name = "ID_PRODUCTO", referencedColumnName = "id")
	private ProductoMD producto;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ProductoMD getProducto() {
		return producto;
	}

	public void setProducto(ProductoMD producto) {
		this.producto = producto;
	}

	public LocalDateTime getFechaSolicitudGarantia() {
		return fechaSolicitudGarantia;
	}

	public void setFechaSolicitudGarantia(LocalDateTime fechaSolicitudGarantia) {
		this.fechaSolicitudGarantia = fechaSolicitudGarantia;
	}

	public LocalDateTime getFechaFinGarantia() {
		return fechaFinGarantia;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public double getPrecio() {
		return precio;
	}

}
