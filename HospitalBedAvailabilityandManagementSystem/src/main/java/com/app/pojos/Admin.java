package com.app.pojos;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "admin_id")
	private Integer adminID;

	@Column(length = 20, name = "user_name", nullable = false, unique = true)
	private String userName;

	@Column(length = 20, name = "password", nullable = false)
	private String password;

	@OneToMany(mappedBy = "adminID", cascade = CascadeType.ALL)
	private List<Hospital> hospitalId;

	public Admin() {
		System.out.println("In Constructor of--> " + getClass().getName());
	}

	public Admin(Integer adminID, String userName, String password, List<Hospital> hospitalId) {
		super();
		this.adminID = adminID;
		this.userName = userName;
		this.password = password;
		this.hospitalId = hospitalId;
	}

	public Integer getAdminID() {
		return adminID;
	}

	public void setAdminID(Integer adminID) {
		this.adminID = adminID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Hospital> getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(List<Hospital> hospitalId) {
		this.hospitalId = hospitalId;
	}

	@Override
	public String toString() {
		return "Admin [adminID=" + adminID + ", userName=" + userName + ", password=" + password + ", hospitalId="
				+ hospitalId + "]";
	}

}
