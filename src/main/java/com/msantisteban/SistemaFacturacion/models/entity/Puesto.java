package com.msantisteban.SistemaFacturacion.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="puesto")
public class Puesto implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_puesto")
	private Long id;
	@Column(name="nombre_puesto")
	private String nombrepues;
	@Column(name="descripcion_puesto")
	private String descrip;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombrepues() {
		return nombrepues;
	}
	public void setNombrepues(String nombrepues) {
		this.nombrepues = nombrepues;
	}
	public String getDescrip() {
		return descrip;
	}
	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}
	
}
