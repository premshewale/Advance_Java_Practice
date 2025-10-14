package com.day.three;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DyanamicScroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn = DBUtil.getConn();
		
		try {
			Statement stmt= conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE	
					, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs= stmt.executeQuery("select * from emp4july");
			rs.absolute(4);
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
			
			rs.relative(2);
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
			
			rs.first();
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
			
			rs.last();
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
