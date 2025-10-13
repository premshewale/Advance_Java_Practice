package com.day.two;

import java.awt.Window.Type;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class SQlFindSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Connection conn = DBUtil.getConn();
			CallableStatement cstmt=
					conn.prepareCall("{?=call FindSal(?)}");
			cstmt.registerOutParameter(1, Types.DOUBLE);
			cstmt.setInt(2, 12);
			cstmt.execute();
			System.out.println("Salary is "+cstmt.getDouble(1));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
