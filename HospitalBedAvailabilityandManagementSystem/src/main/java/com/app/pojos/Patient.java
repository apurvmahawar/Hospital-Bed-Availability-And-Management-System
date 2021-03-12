package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "p_id")
	private Integer patientID;
	@Column(length = 50, nullable = false)
	private String name;
	@Column(length = 20, nullable = false)
	private String gender;
	@Column(nullable = false)
	private int age;
	@Column(nullable = false, name = "contact_no")
	private long contactNo;
	@Column(length = 50, nullable = false)
	private String address;
	@Column(length = 20, nullable = false)
	private String city;
	@Column(length = 20, nullable = false)
	private String state;
	@Column(length = 50)
	private String disease;
	@Column(nullable = false, name = "admit_date")
	private LocalDate admitDate;

	@OneToOne(mappedBy = "patientId", cascade = CascadeType.ALL)
	private Room roomId;

	@OneToOne(mappedBy = "patientID", cascade = CascadeType.ALL)
	private Bill billID;

	@ManyToOne
	@JoinColumn(name = "hospital_id")
	private Hospital hospitalID;

	public Patient() {
		System.out.println("In Constructor of--> " + getClass().getName());
	}

	public Integer getPatientID() {
		return patientID;
	}

	public void setPatientID(Integer patientID) {
		this.patientID = patientID;
	}

	public String getName() {
		return name;
	}

	public Room getRoomId() {
		return roomId;
	}

	public void setRoomId(Room roomId) {
		this.roomId = roomId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
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

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public LocalDate getAdmitDate() {
		return admitDate;
	}

	public void setAdmitDate(LocalDate admitDate) {
		this.admitDate = admitDate;
	}

	public Bill getBillID() {
		return billID;
	}

	public void setBillID(Bill billID) {
		this.billID = billID;
	}

	public Hospital getHospitalID() {
		return hospitalID;
	}

	public void setHospitalID(Hospital hospitalID) {
		this.hospitalID = hospitalID;
	}

	@Override
	public String toString() {
		return "Patient [patientID=" + patientID + ", name=" + name + ", gender=" + gender + ", age=" + age
				+ ", contactNo=" + contactNo + ", address=" + address + ", city=" + city + ", state=" + state
				+ ", disease=" + disease + ", admitDate=" + admitDate + ", roomId=" + roomId + ", billID=" + billID
				+ ", hospitalID=" + hospitalID + "]";
	}

}
