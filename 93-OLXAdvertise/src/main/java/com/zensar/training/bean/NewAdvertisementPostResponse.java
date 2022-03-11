package com.zensar.training.bean;

public class NewAdvertisementPostResponse {

	private String userName;
	private String password;

	public NewAdvertisementPostResponse() {
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

	public NewAdvertisementPostResponse(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public NewAdvertisementPostResponse(String userName) {
		super();
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "LoginUser [userName=" + userName + ", password=" + password + "]";
	}

	public void setId(int id) {
		// TODO Auto-generated method stub
		
	}

	public void setTitle(String title) {
		// TODO Auto-generated method stub
		
	}

	public void setPrice(double price) {
		// TODO Auto-generated method stub
		
	}

	public void setCategory(String name) {
		// TODO Auto-generated method stub
		
	}

	public void setDescription(String description) {
		// TODO Auto-generated method stub
		
	}

	public void setCreatedDate(String createdDate) {
		// TODO Auto-generated method stub
		
	}

	public void setModifiedDate(String modifiedDate) {
		// TODO Auto-generated method stub
		
	}

	public void setStatus(Object status) {
		// TODO Auto-generated method stub
		
	}

}
