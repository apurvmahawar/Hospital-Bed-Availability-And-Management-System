package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.Admin;
import com.app.pojos.Hospital;
import com.app.service.IAdminService;
import com.app.service.IHospitalAdminService;

@Controller
@RequestMapping("/user")
public class UserController {
	public UserController() {
		System.out.println("In constructor of --> " + getClass().getName());
	}

	@Autowired
	private IAdminService adminService;

	@Autowired
	private IHospitalAdminService hospitalService;

	@GetMapping("/admin")
	public String getAdminPage() {
		System.out.println("In show Admin login page");
		return "/user/admin";
	}

	@PostMapping("/admin")
	public String processAdminLoginForm(@RequestParam String user_name, @RequestParam String password, Model map,
			HttpSession session) {
		System.out.println("In Process Admin login form--> " + user_name + " " + password);

		Admin admin = adminService.authenticateAdmin(user_name, password);

		if (admin == null) {
			map.addAttribute("message", "Invalid data");
			return "redirect:/user/admin";
		}

		session.setAttribute("details", admin);
		return "redirect:/admin/details";

	}

	//////////////////////////////////////////////

	@GetMapping("/hospitaladmin")
	public String getHospitalAdminPage() {
		System.out.println("In show Hospital Admin login page");
		return "/user/hospitaladmin";
	}

	@PostMapping("/hospitaladmin")
	public String processHospitalAdminLoginForm(@RequestParam String hospital_id, @RequestParam String password,
			Model map, HttpSession session) {
		System.out.println("In Hospital Admin Login Form--> " + hospital_id + " " + password);
		Hospital hospital = hospitalService.authenticateHospitalAdmin(hospital_id, password);

		if (hospital == null) {
			map.addAttribute("message", "Invalid Hospital Data");
			return "redirect:/user/hospitaladmin";
		}

		session.setAttribute("details", hospital);
		return "redirect:/hospitaladmin/details";
	}

}
