package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserInfo {

	//username成为主键
	@Id
	private String username;
	private String password;
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserInfo(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	//无参空构造
	
	public UserInfo() {
		super();
		
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	
}





