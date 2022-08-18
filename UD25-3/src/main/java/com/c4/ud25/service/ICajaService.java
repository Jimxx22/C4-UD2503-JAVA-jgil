package com.c4.ud25.service;

import java.util.List;

import com.c4.ud25.dto.Caja;

public interface ICajaService {
	//Metodos del CRUD
	public List<Caja> listarCajas(); //Listar All 
	
	public Caja guardarCaja(Caja caja);	//Guarda una caja CREATE
	
	public Caja cajaXID(String dni); //Leer datos de una caja READ
	
	public Caja actualizarCaja(Caja caja); //Actualiza datos de una caja UPDATE
	
	public void eliminarCaja(String dni);// Elimina una caja DELETE
}
