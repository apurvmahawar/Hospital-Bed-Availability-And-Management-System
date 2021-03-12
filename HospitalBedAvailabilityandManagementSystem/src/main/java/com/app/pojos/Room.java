package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "r_id")
	private Integer roomID;

	@Column(length = 20, name = "r_type")
	private String roomType;
	
//	@OneToOne(mappedBy = "roomId")
	@OneToOne
	@JoinColumn(name = "patient_id")
	private Patient patientId;
	
	public Room() {
		System.out.println("In Constructor of--> "+getClass().getName());
	}

	public Integer getRoomID() {
		return roomID;
	}

	public void setRoomID(Integer roomID) {
		this.roomID = roomID;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public Patient getPatientId() {
		return patientId;
	}

	public void setPatientId(Patient patientId) {
		this.patientId = patientId;
	}

	@Override
	public String toString() {
		return "Room [roomID=" + roomID + ", roomType=" + roomType + ", patientId=" + patientId + "]";
	}

	
	
	
}
