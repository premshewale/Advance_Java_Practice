package com.day.three;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

public class Batch_update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn = DBUtil.getConn();
		try {
			conn.setAutoCommit(false);
			Statement stmt = conn.createStatement();
			stmt.addBatch("insert into emp4july values(16,'PQR',86525)");
			stmt.addBatch("insert into emp4july values(17,'STU',96525)");
			stmt.addBatch("insert into emp4july values(18,'LMN',76525)");
			stmt.addBatch("insert into emp4july values(19,'IJK',66525)");
			int i[]=stmt.executeBatch();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			try {
				conn.rollback();
				System.out.println("Not Done...");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		try {
			conn.commit();
			System.out.println("All okk..");
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
		
		}}}	



