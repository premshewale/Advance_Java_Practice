package com.demo.dao;

import com.demo.bean.LoginBean;

public interface RegisterDao {
	LoginBean insertUser(String user,String pass,String role);
}
