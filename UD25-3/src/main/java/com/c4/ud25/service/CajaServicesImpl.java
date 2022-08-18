package com.c4.ud25.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c4.ud25.dao.ICajaDAO;
import com.c4.ud25.dto.Caja;

@Service
public class CajaServicesImpl implements ICajaService{

	@Autowired
	ICajaDAO iCajasDAO;
	
	@Override
	public List<Caja> listarCajas() {
		// TODO Auto-generated method stub
		return iCajasDAO.findAll();
	}

	@Override
	public Caja guardarCaja(Caja caja) {
		// TODO Auto-generated method stub
		return iCajasDAO.save(caja);
	}

	@Override
	public Caja cajaXID(String dni) {
		// TODO Auto-generated method stub
		return iCajasDAO.findById(dni).get();
	}

	@Override
	public Caja actualizarCaja(Caja caja) {
		// TODO Auto-generated method stub
		return iCajasDAO.save(caja);
	}

	@Override
	public void eliminarCaja(String dni) {
		// TODO Auto-generated method stub
		iCajasDAO.deleteById(dni);
	}

}
