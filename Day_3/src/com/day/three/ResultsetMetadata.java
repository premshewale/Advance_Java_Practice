package com.day.three;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;


public class ResultsetMetadata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=DBUtil.getConn();
		try {
		
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from emp4july");
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println("Total Columns "+rsmd.getColumnCount());
			
			for(int i=1;i<=rsmd.getColumnCount();i++){
			System.out.println(rsmd.getColumnName(i)+" "+rsmd.getColumnTypeName(i));
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}

}
