package com.c4.ud25.controller;

import java.io.Console;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.MBeanServerNotFoundException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c4.ud25.dto.Almacen;
import com.c4.ud25.service.AlmacenServiceImpl;

@RestController
@RequestMapping("/api")
public class AlmacenController {

	@Autowired
	AlmacenServiceImpl almacenServiceImpl;
	
	@GetMapping("/almacenes")
	public List<Almacen> listarAlmacen(){
		return almacenServiceImpl.listarAlmacenes();
	}
	
	@PostMapping("/almacenes")
	public Almacen guardarAlmacen(@RequestBody Almacen almacen) {
		return almacenServiceImpl.guardarAlmacen(almacen);
	}
	
	@GetMapping("/almacenes/{id}")
	public Almacen almacenXId(@PathVariable(name="id") Long id) {
		
		Almacen almacen = new Almacen();
		
		almacen=almacenServiceImpl.almacenXID(id);
		
		return almacen;
	}
	
	@PutMapping("/almacenes/{id}")
	public Almacen actualizarAlmacen(@PathVariable(name="id") Long id, @RequestBody Almacen almacen) {
		
		Almacen almacenSel = new Almacen();
		Almacen almacenAct = new Almacen();
		
		almacenSel=almacenServiceImpl.almacenXID(id);
		
		almacenSel.setLugar(almacen.getLugar());
		almacenSel.setCapacidad(almacen.getCapacidad());
		
		almacenAct= almacenServiceImpl.actualizarAlmacen(almacenSel);
		
		return almacenAct;
		
	}
	
	@DeleteMapping("/almacenes/{id}")
	public String eliminarAlmacen(@PathVariable(name="id")Long id) {
				
		try {
			almacenServiceImpl.eliminarAlmacen(id);
			return "Almacen borrado";
		}catch (Exception e) {
			return "ERROR: no puedes eliminar un Almacen sin haver eliminado sus cajas antes.";
		}
		
	}
	
}
