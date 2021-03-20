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
import com.app.pojos.Room;
import com.app.service.IRoomService;
import com.app.service.IRoomTypeService;

@Controller
@RequestMapping("/room")
public class RoomController {

	@Autowired
	private IRoomService roomService;

	@Autowired
	private IRoomTypeService roomTypeService;

	@GetMapping("/allocate")
	public String showRoomAllocationForm(Model map) {
		System.out.println("In room allocation form");
		map.addAttribute("room", new Room());
		return "/room/allocate";
	}

	@PostMapping("/allocate")
	public String processRoomAllocationForm(@Valid Room room, BindingResult result, RedirectAttributes flashMap,
			HttpSession session) {
		System.out.println("In process Room allocation form  " + room);
		System.out.println("Binding Result--> " + result);
		if (result.hasErrors()) {
			System.out.println("P.L Errors");
			return "/room/allocate";
		}
		Patient patient = (Patient) session.getAttribute("patient_details");

		flashMap.addFlashAttribute("message", roomService.registerRoom(room, patient));
		Hospital hospital = (Hospital) session.getAttribute("hospital_details");

		// BUSINESS LOGIC
		// for updation in RoomType table of corresponding Hospital whenever a patient is admitted
		if (room.getRoomType().equalsIgnoreCase("ICU")) {
			roomTypeService.updateICURoom(hospital);
		} else if (room.getRoomType().equalsIgnoreCase("non-ICU")) {
			roomTypeService.updateNonICURoom(hospital);
		} else {
			roomTypeService.updateGeneralRoom(hospital);
		}
		return "redirect:/hospital/welcome";
	}

}
