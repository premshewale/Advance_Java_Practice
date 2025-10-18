package com.demo.service;
import com.demo.bean.LoginBean;

import com.demo.dao.RegisterDao;
import com.demo.dao.RegisterDaoImpl;
public  class RegisterServiceImpl implements RegisterService{
	RegisterDao registerDao = new RegisterDaoImpl();
	@Override
	public LoginBean insertUser(String user, String pass, String role) {
		// TODO Auto-generated method stub
		return registerDao.insertUser(user, pass,role);
	}
}