package com.day.three;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MetaData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn = DBUtil.getConn();
		try {
			DatabaseMetaData dbmd = conn.getMetaData();
			System.out.println(dbmd.getDatabaseProductName());
			System.out.println(dbmd.getDatabaseProductVersion());
			System.out.println(dbmd.getDriverName());
			System.out.println(dbmd.getStringFunctions());
			System.out.println(dbmd.getNumericFunctions());
			System.out.println(dbmd.getTimeDateFunctions());
			System.out.println(dbmd.getUserName());
			System.out.println(dbmd.getConnection());
			String type[]={"TABLE"};
			ResultSet rs= dbmd.getTables(null, "FSDM24_1", null, type);
			while(rs.next()){
				System.out.println(rs.getString(3));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}

}
