package com.app.service;

import com.app.pojos.Hospital;
import com.app.pojos.RoomType;

public interface IRoomTypeService {
	String registerRoomType(Hospital hospital, RoomType roomType);

	RoomType showBedList(Hospital id);

	String updateICURoom(Hospital id);
	String updateNonICURoom(Hospital id);
	String updateGeneralRoom(Hospital id);
	
}
