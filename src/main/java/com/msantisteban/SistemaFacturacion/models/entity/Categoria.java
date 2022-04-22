package com.msantisteban.SistemaFacturacion.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="categoria")
public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cat")
	private Long id;
	@Column(name="nomb_cat")
	private String nombre;
	@Column(name="desc_cat")
	private String descripcion;
	@Column(name="fecha_cat")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechacat;

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFechacat() {
		return fechacat;
	}
	public void setFechacat(Date fechacat) {
		this.fechacat = fechacat;
	}
	
	
	
	
	
}
