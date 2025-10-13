package com.day.two;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MenuDrivenSelect extends MenuDrivenMain {
	
	public  void select(){
		Connection conn =null;
		
		try {
			conn = DBUtil.getConn();
			String query = "select * from emp4july";
			//PreparedStatement resultset=conn.prepareStatement(query);
			Statement statement = conn.createStatement();
			String queary ="select * from emp4july";
			ResultSet resultset = statement.executeQuery(queary);
			while(resultset.next())
				System.out.println(resultset.getInt(1)+" "+resultset.getString(2)+
						" "+resultset.getDouble(3));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		}
		finally{
			try{if(conn!=null)
				conn.close();
				
			}catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}}
}
}