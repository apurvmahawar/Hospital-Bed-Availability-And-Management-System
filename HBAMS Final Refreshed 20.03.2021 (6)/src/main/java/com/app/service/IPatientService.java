package com.app.service;

import java.util.List;

import com.app.pojos.Hospital;
import com.app.pojos.Patient;

public interface IPatientService {
	String registerPatient(Patient patient, Hospital hospital);

	List<Patient> getAllPatient(Hospital hospital);
}
