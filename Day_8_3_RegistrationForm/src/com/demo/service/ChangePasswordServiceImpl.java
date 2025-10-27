package com.demo.service;

import com.demo.bean.LoginBean;
import com.demo.dao.ChangePasswordDao;
import com.demo.dao.ChangePasswordDaoImpl;

public class ChangePasswordServiceImpl implements ChangePasswordService {

    private ChangePasswordDao changePasswordDao = new ChangePasswordDaoImpl();

    @Override
    public LoginBean updatePassword(String user, String pass, String newpass) {
        return changePasswordDao.updatePassword(user, pass, newpass);
    }
}
