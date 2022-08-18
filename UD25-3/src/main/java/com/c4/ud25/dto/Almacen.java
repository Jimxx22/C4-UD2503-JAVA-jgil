package com.c4.ud25.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Almacenes")
public class Almacen {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codigo")
	private Long codigo;
	
	@Column(name="lugar")
	private String lugar;
	
	@Column(name="capacidad")
	private String capacidad;
	
	@OneToMany
	@JoinColumn(name="num_Referencia")
	private List<Caja> cajas;

	public Almacen(String lugar, String capacidad) {
		this.lugar = lugar;
		this.capacidad = capacidad;
	}

	public Almacen() {
	}

	public Long getCodigo() {
		return codigo;
	}

	public void Codigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	
	public String getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Caja")
	public List<Caja> getCajas() {
		return cajas;
	}

	public void setCajas(List<Caja> articulos) {
		this.cajas = articulos;
	}

	@Override
	public String toString() {
		return "Almacen [codigo=" + codigo + ", lugar=" + lugar + ", capacidad=" + capacidad + ", cajas=" + cajas + "]";
	}

	
	
}
