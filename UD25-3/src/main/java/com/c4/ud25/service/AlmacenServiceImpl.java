package com.c4.ud25.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c4.ud25.dao.IAlmacenDAO;
import com.c4.ud25.dto.Almacen;

@Service
public class AlmacenServiceImpl implements IAlmacenService{

	@Autowired
	IAlmacenDAO iAlmacenesDAO;
	
	@Override
	public List<Almacen> listarAlmacenes() {
		// TODO Auto-generated method stub
		return iAlmacenesDAO.findAll();
	}

	@Override
	public Almacen guardarAlmacen(Almacen almacen) {
		// TODO Auto-generated method stub
		return iAlmacenesDAO.save(almacen);
	}

	@Override
	public Almacen almacenXID(Long id) {
		// TODO Auto-generated method stub
		return iAlmacenesDAO.findById(id).get();
	}

	@Override
	public Almacen actualizarAlmacen(Almacen almacen) {
		// TODO Auto-generated method stub
		return iAlmacenesDAO.save(almacen);
	}

	@Override
	public void eliminarAlmacen(Long id) {
		// TODO Auto-generated method stub
		iAlmacenesDAO.deleteById(id);
	}

}
