package com.app.service;

import com.app.pojos.Hospital;

public interface IHospitalAdminService {

	Hospital authenticateHospitalAdmin(String hospital_id, String password);

}
