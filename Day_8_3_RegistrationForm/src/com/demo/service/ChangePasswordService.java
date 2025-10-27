package com.demo.service;

import com.demo.bean.LoginBean;

public interface ChangePasswordService {
    LoginBean updatePassword(String user, String pass, String newpass);
}
