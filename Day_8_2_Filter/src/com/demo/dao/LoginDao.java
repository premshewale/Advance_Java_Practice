package com.demo.dao;

import com.demo.bean.LoginBean;

public interface LoginDao {

	LoginBean validateUser(String user,String pass);
}
