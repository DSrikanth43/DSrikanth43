package com.zensar.training.bean;

public class LoginUser {
	private String userName;
	private String password;
	
	public LoginUser() {
		super();
	}
     
	public LoginUser(String userName,String password) {
		super();
		this.setUserName(userName);
		this.setPassword(password);
	}
	public LoginUser(String userName) {
		super();
		this.setUserName(userName);
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
}


