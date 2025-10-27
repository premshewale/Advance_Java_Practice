package com.demo.service;

import com.demo.bean.LoginBean;
import com.demo.dao.LoginDao;
import com.demo.dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService {
	
	LoginDao logindao = new LoginDaoImpl();
	@Override
	public LoginBean validateUser(String user, String pass) {
		// TODO Auto-generated method stub
		return logindao.validateUser(user, pass);
	}
	

	@Override
	public LoginBean enterUser1(int number, String pass, int salary) {
		// TODO Auto-generated method stub
		return logindao.enterUser1(number, pass,salary);
	}

}
