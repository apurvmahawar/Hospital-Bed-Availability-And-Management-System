package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IAdminDao;
import com.app.dao.IHospitalAdminDao;
import com.app.pojos.Admin;
import com.app.pojos.Hospital;

@Service
@Transactional
public class AdminServiceImpl implements IAdminService {

	// dependency--> DAO Layer
	@Autowired
	private IAdminDao adminDao;
	
	@Autowired
	private IHospitalAdminDao hospitalDao;

	@Override
	public Admin authenticateAdmin(String user_name, String password) {
		return adminDao.findByUserNameAndPassword(user_name, password);
	}

	public List<Hospital> getAllHospital() {
		return hospitalDao.findAll();
	}
}
