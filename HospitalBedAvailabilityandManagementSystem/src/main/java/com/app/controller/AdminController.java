package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@GetMapping("/details")
	public String getAdminPanel() {
		System.out.println("Admin Login Successfully");
		return "/admin/details";
	}

	
}
