package com.day.one;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class UpdateSQl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Connection conn =null;
		try {
			conn = DBUtil.getConn();
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			
//			String url ="jdbc:oracle:thin:@AGNI:1521:oracle12c";
//			conn = 
//					DriverManager.getConnection(url,"fsdm24_1","fsdm24_1");
			
			String query ="update emp4july set salary=90000.65 where emp_no=11";
			Statement stmt = conn.createStatement();
			int count =stmt.executeUpdate(query);
			System.out.println(count+" record updated");
	
		
			
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
	}

}
