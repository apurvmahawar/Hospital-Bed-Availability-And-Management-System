package com.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IHospitalAdminDao;
import com.app.pojos.Hospital;

@Service
@Transactional
public class HospitalAdminImpl implements IHospitalAdminService {

	@Autowired
	private IHospitalAdminDao hospitalAdminDao;

	@Override
	public Hospital authenticateHospitalAdmin(String hospital_id, String password) {
		return hospitalAdminDao.findByHospitalAdminIDAndHospitalAdminPassword(hospital_id, password);
	}

}
