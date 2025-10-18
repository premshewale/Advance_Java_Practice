package com.demo.service;

import com.demo.bean.LoginBean;

public interface RegisterService {
	LoginBean insertUser(String user,String pass,String role);
}
