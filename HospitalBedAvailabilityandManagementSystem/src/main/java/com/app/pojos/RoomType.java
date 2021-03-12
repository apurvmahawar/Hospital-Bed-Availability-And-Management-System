package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class RoomType {

	@Id
	@Column(name = "r_id")
	private Integer roomId;
	@Column(length = 20, name = "category")
	private String Category;
	@Column(name = "quantity")
	private int Quantity;
	@Column(name = "price")
	private int Price;

	@ManyToOne
	@JoinColumn(name = "hospital_admin_id")
	private Hospital hospitalAdminID;

	public RoomType() {
		System.out.println("In Constructor of--> " + getClass().getName());
	}

	public Integer getRoomId() {
		return roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

//	public String getHospitalAdminID() {
//		return hospitalAdminID;
//	}
//
//	public void setHospitalAdminID(String hospitalAdminID) {
//		this.hospitalAdminID = hospitalAdminID;
//	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public Hospital getHospitalAdminID() {
		return hospitalAdminID;
	}

	public void setHospitalAdminID(Hospital hospitalAdminID) {
		this.hospitalAdminID = hospitalAdminID;
	}

	@Override
	public String toString() {
		return "RoomType [roomId=" + roomId + ", Category=" + Category + ", Quantity=" + Quantity + ", Price=" + Price
				+ ", hospitalAdminID=" + hospitalAdminID + "]";
	}

	

	

}
