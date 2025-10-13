package com.day.two;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class MenuDrivenInsert extends MenuDrivenMain{
	public void insert(){
	Connection conn =null;
	
	try {
		conn = DBUtil.getConn();
		String query = "insert into emp4july values(?,?,?)";
		PreparedStatement ps=conn.prepareStatement(query);
		ps.setInt(1, 15);
		ps.setString(2,"ABC");
		ps.setDouble(3, 55000);
		
		boolean result = ps.execute();
		int count= ps.getUpdateCount();
		System.out.println(count+ " Inserted");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally{
		try{if(conn!=null)
			conn.close();
			
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}}}
}
