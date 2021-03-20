package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.Hospital;
import com.app.pojos.Patient;

@Controller
@RequestMapping("/bill")
public class BillController {
	public BillController() {
		System.out.println("In Default Constructor of--> " + getClass().getName());
	}

	@GetMapping("/generatedbill")
	public String generateBill(@RequestParam int vpid, HttpSession session) {
		System.out.println("Generate Patient Bill--> " + vpid);
//		Hospital hospital = (Hospital) 
				session.getAttribute("hospital_details");
//		Patient patient = (Patient) session.getAttribute("patient_list");
		session.getAttribute("patient_details");
		return "/bill/generatedbill";
	}

}
