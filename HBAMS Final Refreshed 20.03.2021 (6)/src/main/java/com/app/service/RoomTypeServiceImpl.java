package com.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.RoomTypeRepository;
import com.app.pojos.Hospital;
import com.app.pojos.RoomType;

@Service
@Transactional
public class RoomTypeServiceImpl implements IRoomTypeService {

	@Autowired
	private RoomTypeRepository roomTypeRepo;

	@Override
	public String registerRoomType(Hospital hospital, RoomType roomType) {
		hospital.addRoomType(roomType);
		RoomType newRoomType = roomTypeRepo.save(roomType);
		return "Room Allocated with ID-> " + newRoomType.getRoomCategoryId();
	}

	@Override
	public RoomType showBedList(Hospital id) {
		return roomTypeRepo.findByHospitalId(id);
	}

	@Override
	public String updateICURoom(Hospital id) {
		roomTypeRepo.updateICURoomQuantity(id);
		return "ICU room decreased by 1";
	}

	@Override
	public String updateNonICURoom(Hospital id) {
		roomTypeRepo.updateNonICURoomQuantity(id);
		return "non-ICU room decreased by 1";
	}

	@Override
	public String updateGeneralRoom(Hospital id) {
		roomTypeRepo.updateGeneralRoomQuantity(id);
		return "General room decreased by 1";
	}

	

}
