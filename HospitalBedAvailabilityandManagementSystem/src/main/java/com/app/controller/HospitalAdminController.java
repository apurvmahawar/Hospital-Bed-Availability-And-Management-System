package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hospitaladmin")
public class HospitalAdminController {
	
	@GetMapping("details")
	public String getHospitalAdminPanel() {
		System.out.println("Hospital Logged in Successfully");
		return "/hospitaladmin/details";
	}

}

