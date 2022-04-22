package com.msantisteban.SistemaFacturacion.models.entity;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;


@Entity
@Table(name="producto")
public class Producto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_pro")
	private Long id;
	@Column(name="codigo_pro")
	private int codigopro;
	@Column(name="nombre_pro")
	private String nombrepro;
	
	@Column(name="pcompra_pro")
	private int pcompra;
	@Column(name="pventa_pro")
	private double pventa;
	@Column(name="stock_pro")
	private int stock;
	
	
	private Long id_cat;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getCodigopro() {
		return codigopro;
	}
	public void setCodigopro(int codigopro) {
		this.codigopro = codigopro;
	}
	public String getNombrepro() {
		return nombrepro;
	}
	public void setNombrepro(String nombrepro) {
		this.nombrepro = nombrepro;
	}
	public int getPcompra() {
		return pcompra;
	}
	public void setPcompra(int pcompra) {
		this.pcompra = pcompra;
	}
	public double getPventa() {
		return pventa;
	}
	public void setPventa(double pventa) {
		this.pventa = pventa;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public Long getId_cat() {
		return id_cat;
	}
	public void setId_cat(Long id_cat) {
		this.id_cat = id_cat;
	}
	
	
	
	
}
