package com.c4.ud25.service;

import java.util.List;

import com.c4.ud25.dto.Almacen;

public interface IAlmacenService {
	
	//Metodos del CRUD
	public List<Almacen> listarAlmacenes(); //Listar All 
	
	public Almacen guardarAlmacen(Almacen almacen);	//Guarda un almacen CREATE
	
	public Almacen almacenXID(Long id); //Leer datos de un almacen READ
	
	public Almacen actualizarAlmacen(Almacen almacen); //Actualiza datos del almacen UPDATE
	
	public void eliminarAlmacen(Long id);// Elimina el almacen DELETE

}
