package com.demo.bean;

public class LoginBean {
	
	public String user;public String pass;
	public LoginBean(String user, String pass) {
		this.user = user;
		this.pass = pass;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public LoginBean() {
	}
	@Override
	public String toString() {
		return "LoginBean [user=" + user + ", pass=" + pass + "]";
	}
	public boolean validateUser(){
		if(user.equals("seed") && pass.equals("seed"))
			return true;
		else
			return false;
	}
	
	
}
