package com.day.two;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SQLPreparedStmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn =null;
		try {
			conn = DBUtil.getConn();
			String query = "update emp4july set salary=?"+"where emp_no=?";
			PreparedStatement ps=conn.prepareStatement(query);
			ps.setDouble(1, 99999);
			ps.setInt(2, 11);
			boolean result = ps.execute();
			int count= ps.getUpdateCount();
			System.out.println(count+ " updated...");
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
