package com.demo.service;

import com.demo.bean.LoginBean;

public interface LoginService {
	LoginBean validateUser(String user,String pass);
	
}
