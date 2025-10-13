package com.day.two;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class PLSQl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		try {
			Connection conn = DBUtil.getConn();
			CallableStatement cstmt =
					conn.prepareCall("{call addEmpRec(?,?,?)}");
			cstmt.setInt(1, 15);
			cstmt.setString(2, "JKL");
			cstmt.setDouble(3, 23432);
			
			cstmt.execute();
			System.out.println("Record Added...");
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
