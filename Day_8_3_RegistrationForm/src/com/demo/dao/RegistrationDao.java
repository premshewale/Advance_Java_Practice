package com.demo.dao;

import com.demo.bean.LoginBean;

public interface RegistrationDao {

	LoginBean insertUser(String user,String pass,String role);
}
