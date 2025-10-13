package com.day.two;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLExecute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn =null;
		try {
			 conn = DBUtil.getConn();
			 Scanner scanner = new Scanner(System.in);
			 System.out.println("Enter a Query");
			 String inputString =scanner.nextLine();
			String query =inputString;
			Statement stmt =conn.createStatement();
			boolean result = stmt.execute(query);
			if (result) {
				ResultSet rs = stmt.getResultSet();
				while(rs.next())
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
				
			}else{
				int count =stmt.getUpdateCount();
				System.out.println(count+" Records updated");
			}
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
