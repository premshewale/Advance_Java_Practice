package com.day.two;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class MenuDrivenDelete extends MenuDrivenMain{
	public void delete(){
	Connection conn =null;
	try {
		conn = DBUtil.getConn();
		String query ="delete from emp4july where emp_no=12";
		Statement stmt = conn.createStatement();
		int count =stmt.executeUpdate(query);
		System.out.println(count+" record Deleted");
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
	}
	
}
}}
