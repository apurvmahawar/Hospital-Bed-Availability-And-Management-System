package com.app.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.Hospital;
import com.app.pojos.Patient;
import com.app.service.IPatientService;

@Controller
@RequestMapping("/patient")
public class PatientController {

	@Autowired
	private IPatientService patientService;

	@GetMapping("/register")
	public String getPatientRegistrationForm(Model map) {
		System.out.println("In patient registration form ");
		map.addAttribute("patient", new Patient());
		return "/patient/register";
	}

	@PostMapping("/register")
	public String processPatientRegistrationForm(@Valid Patient patient, BindingResult result,
			RedirectAttributes flashMap, HttpSession session) {
		System.out.println("In process patient reg. formof patient -->  " + patient);
		System.out.println("Binding Result--> " + result);
		if (result.hasErrors()) {
			System.out.println("P.L Errors");
			return "/patient/register";

		}
		Hospital hospital = (Hospital) session.getAttribute("hospital_details");
		session.setAttribute("patient_details", patient);
		flashMap.addFlashAttribute("message", patientService.registerPatient(patient, hospital));
		return "redirect:/room/allocate";

	}

	@GetMapping("/list")
	public String showPatientList(HttpSession session) {

		Hospital hospital = (Hospital) session.getAttribute("hospital_details");

		session.setAttribute("patient_list", patientService.getAllPatient(hospital));

		return "/patient/list";
	}

}
