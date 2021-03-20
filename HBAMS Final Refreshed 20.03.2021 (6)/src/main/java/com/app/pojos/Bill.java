package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
public class Bill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "b_id")
	private Integer billID;

	@Column(nullable = false, name = "r_id")
	private int roomID;

	@Column(name = "r_charge")
	private double roomCharge;

	@Column(name = "admitted_days")
	private int admittedDays;

	@Column(name = "total_bill")
	private double totalBill;

	public Bill() {
		System.out.println("In Constructor of--> " + getClass().getName());
	}

	public Bill(Integer billID, int roomID, double roomCharge, int admittedDays, double totalBill) {
		super();
		this.billID = billID;
		this.roomID = roomID;
		this.roomCharge = roomCharge;
		this.admittedDays = admittedDays;
		this.totalBill = totalBill;

	}

	public Integer getBillID() {
		return billID;
	}

	public void setBillID(Integer billID) {
		this.billID = billID;
	}

	public int getRoomID() {
		return roomID;
	}

	public void setRoomID(int roomID) {
		this.roomID = roomID;
	}

	public double getRoomCharge() {
		return roomCharge;
	}

	public void setRoomCharge(double roomCharge) {
		this.roomCharge = roomCharge;
	}

	public int getAdmittedDays() {
		return admittedDays;
	}

	public void setAdmittedDays(int admittedDays) {
		this.admittedDays = admittedDays;
	}

	public double getTotalBill() {
		return totalBill;
	}

	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}

	@Override
	public String toString() {
		return "Bill [billID=" + billID + ", roomID=" + roomID + ", roomCharge=" + roomCharge + ", admittedDays="
				+ admittedDays + ", totalBill=" + totalBill + "]";
	}

}
