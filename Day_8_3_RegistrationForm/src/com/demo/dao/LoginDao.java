package com.demo.dao;

import com.demo.bean.LoginBean;

public interface LoginDao {

	LoginBean validateUser(String user,String pass);
	
	LoginBean enterUser1(int user, String pass, int role);

	
	
}
