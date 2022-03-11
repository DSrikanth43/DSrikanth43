package com.zensar.training.bean;

public class NewAdvertisementPostRequest {

	private String userName;
	private String password;

	public NewAdvertisementPostRequest() {
		super();
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

	public NewAdvertisementPostRequest(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public NewAdvertisementPostRequest(String userName) {
		super();
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "LoginUser [userName=" + userName + ", password=" + password + "]";
	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getCategoryId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getStatusId() {
		// TODO Auto-generated method stub
		return null;
	}

}