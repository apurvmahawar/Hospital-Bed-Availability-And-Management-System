package com.app.pojos;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Hospital {
	@Id
	@Column(length = 20, name = "hospital_id", unique = true, nullable = false)
	private String hospitalAdminID;
	@Column(length = 50, nullable = false)
	private String name;
	@Column(length = 50, nullable = false)
	private String address;
	@Column(length = 20, nullable = false)
	private String city;
	@Column(length = 20, nullable = false)
	private String state;
	@Column(nullable = false, name = "contact_no")
	private long contactNo;
	@Column(length = 20, name = "password", nullable = false)
	private String hospitalAdminPassword;

	@ManyToOne
	@JoinColumn(name = "admin_id")
	private Admin adminID;

	@OneToMany(mappedBy = "hospitalAdminID", cascade = CascadeType.ALL)
	private List<RoomType> roomID;

	@OneToMany(mappedBy = "hospitalID", cascade = CascadeType.ALL)
	private List<Patient> patientID;

	public Hospital() {
		System.out.println("In Constructor of--> " + getClass().getName());
	}

	public String getHospitalAdminID() {
		return hospitalAdminID;
	}

	public void setHospitalAdminID(String hospitalAdminID) {
		this.hospitalAdminID = hospitalAdminID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getHospitalAdminPassword() {
		return hospitalAdminPassword;
	}

	public void setHospitalAdminPassword(String hospitalAdminPassword) {
		this.hospitalAdminPassword = hospitalAdminPassword;
	}

	public Admin getAdminID() {
		return adminID;
	}

	public void setAdminID(Admin adminID) {
		this.adminID = adminID;
	}

	public List<RoomType> getRoomID() {
		return roomID;
	}

	public void setRoomID(List<RoomType> roomID) {
		this.roomID = roomID;
	}

	public List<Patient> getPatientID() {
		return patientID;
	}

	public void setPatientID(List<Patient> patientID) {
		this.patientID = patientID;
	}

	@Override
	public String toString() {
		return "Hospital [hospitalAdminID=" + hospitalAdminID + ", name=" + name + ", address=" + address + ", city="
				+ city + ", state=" + state + ", contactNo=" + contactNo + ", hospitalAdminPassword="
				+ hospitalAdminPassword + ", adminID=" + adminID + "]";
	}

	

}
