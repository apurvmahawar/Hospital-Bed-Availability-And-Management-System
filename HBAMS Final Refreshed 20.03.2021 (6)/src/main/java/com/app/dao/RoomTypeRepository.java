package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.app.pojos.Hospital;
import com.app.pojos.RoomType;

public interface RoomTypeRepository extends JpaRepository<RoomType, Integer> {

	RoomType findByHospitalId(Hospital id);

	@Modifying
	@Query(value = "update RoomType r set r.icuQuantity=(r.icuQuantity-1) where r.hospitalId=:id")
	void updateICURoomQuantity(Hospital id);

	@Modifying
	@Query(value = "update RoomType r set r.nonicuQuantity=(r.nonicuQuantity-1) where r.hospitalId=:id")
	void updateNonICURoomQuantity(Hospital id);

	@Modifying
	@Query(value = "update RoomType r set r.generalQuantity=(r.generalQuantity-1) where r.hospitalId=:id")
	void updateGeneralRoomQuantity(Hospital id);

}
