package com.day.three;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Scroll_Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Connection conn = DBUtil.getConn();
		
		try {
			Statement stmt= conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE	
					, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs= stmt.executeQuery("select emp_no,emp_name,salary from emp4july");
			rs.absolute(5);
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
//			rs.deleteRow();
//			System.out.println("Check...");
			
			rs.absolute(6);
			rs.updateString("emp_name", "AAAA");
			rs.updateRow();
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
			
			rs.moveToInsertRow();
			rs.updateInt("emp_no", 22);
			rs.updateString("emp_name", "XXXX");
			rs.updateDouble("salary", 11111);
			rs.insertRow();
			System.out.println("checked..");
			//System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
