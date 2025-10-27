package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.demo.bean.LoginBean;


public class ChangePasswordDaoImpl implements ChangePasswordDao {

    @Override
    public LoginBean updatePassword(String user, String pass, String newpass) {
        Connection con = null;
        LoginBean loginBean = null;

        try {
            con = DButil.getCon();
            System.out.println("in 1 ");
            String query = "UPDATE user4julydb SET password=? WHERE username=? and password=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, newpass);
            ps.setString(2, user);
            ps.setString(3, pass);
            System.out.println("in value "+newpass+user+pass);
            System.out.println("in 2 ");
            int row = ps.executeUpdate();
            System.out.println("in row "+row);
            if (row > 0) {
                // Password successfully updated
                loginBean = new LoginBean();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return loginBean;
    }
}
