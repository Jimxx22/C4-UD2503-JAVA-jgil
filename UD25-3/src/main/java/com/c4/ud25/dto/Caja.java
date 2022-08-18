package com.c4.ud25.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Cajas")
public class Caja {

	@Id
	@Column(name="num_Referencia")
	private String numReferencia;
	
	@Column(name="contenido")
	private String contenido;
	
	@Column(name="valor")
	private String valor;
	
	@ManyToOne
    @JoinColumn(name="codigo_Almacen")
	private Almacen almacen;
	
	public Caja() {
		super();
	}

	public Caja(String numReferencia, String contenido, String valor, Almacen almacen) {
		this.numReferencia = numReferencia;
		this.contenido = contenido;
		this.valor = valor;
		this.almacen = almacen;
	}

	public String getNumReferencia() {
		return numReferencia;
	}

	public void setNumReferencia(String numReferencia) {
		this.numReferencia = numReferencia;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Almacen getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	@Override
	public String toString() {
		return "Caja [numReferencia=" + numReferencia + ", contenido=" + contenido + ", valor=" + valor + ", almacen="
				+ almacen + "]";
	}
	
}
