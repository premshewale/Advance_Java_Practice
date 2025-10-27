package com.demo.dao;

import com.demo.bean.LoginBean;

public interface ChangePasswordDao {
    LoginBean updatePassword(String user, String pass, String newpass);
}
