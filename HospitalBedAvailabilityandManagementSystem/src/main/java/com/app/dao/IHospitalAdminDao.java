package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Hospital;

public interface IHospitalAdminDao extends JpaRepository<Hospital, Integer> {

	Hospital findByHospitalAdminIDAndHospitalAdminPassword(String hospital_id, String password);
}
