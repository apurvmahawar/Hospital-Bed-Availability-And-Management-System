package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Hospital;
import com.app.pojos.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
	List<Patient> findByHospitalID(Hospital hospitalId);
}
