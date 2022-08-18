package com.c4.ud25.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c4.ud25.dto.Caja;
import com.c4.ud25.service.CajaServicesImpl;
@RestController
@RequestMapping("/api")
public class CajaController {

	@Autowired
	CajaServicesImpl cajaServicesImpl;
	
	@GetMapping("/cajas")
	public List<Caja> listarCajas(){
		return cajaServicesImpl.listarCajas();
	}
	
	@PostMapping("/cajas")
	public Caja guardarCaja(@RequestBody Caja caja) {
		return cajaServicesImpl.guardarCaja(caja);
	}
	
	@GetMapping("/cajas/{numReferencia}")
	public Caja cajaXId(@PathVariable(name="numReferencia") String numReferencia) {
		
		Caja Articulo = new Caja();
		
		Articulo=cajaServicesImpl.cajaXID(numReferencia);
		
		return Articulo;
	}
	
	@PutMapping("/cajas/{numReferencia}")
	public Caja actualizarCaja(@PathVariable(name="numReferencia") String numReferencia, @RequestBody Caja caja) {
		
		Caja cajaSel = new Caja();
		Caja cajaAct = new Caja();
		
		cajaSel=cajaServicesImpl.cajaXID(numReferencia);
		
		cajaSel.setContenido(caja.getContenido());
		cajaSel.setValor(caja.getValor());
		cajaSel.setAlmacen(caja.getAlmacen());
		
		cajaAct= cajaServicesImpl.actualizarCaja(cajaSel);
		
		return cajaAct;
		
	}
	
	@DeleteMapping("/cajas/{numReferencia}")
	public void eliminarCaja(@PathVariable(name="numReferencia")String numReferencia) {
		cajaServicesImpl.eliminarCaja(numReferencia);
	}
}
