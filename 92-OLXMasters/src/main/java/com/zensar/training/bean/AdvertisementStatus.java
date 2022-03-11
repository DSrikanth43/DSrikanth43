package com.zensar.training.bean;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="olx_AdvertismentStatus")

public class AdvertisementStatus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Status;
	public void AdvertismentStatus(int id,String status, String Status) {
	    super();
		this.id = id;
		this.Status = Status;
	}
	
	public AdvertisementStatus(String Status) {
		super();
		this.Status=Status;
	}
	public AdvertisementStatus() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	@Override
	public String toString() {
		return "AdvertismentStatus [id=" + id + ", Status=" + Status + "j";
	}

}
