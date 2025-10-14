package com.day.three;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class JDBCRowSetCache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn = DBUtil.getConn();
		try {
			
			Statement stmt = conn.createStatement();
			ResultSet rs =stmt.executeQuery("select * from emp4july");
			CachedRowSet crowset = RowSetProvider.newFactory()
					.createCachedRowSet();
			crowset.populate(rs);
			rs.close();
			stmt.close();
			conn.close();
			
			
			while(crowset.next()){
				System.out.println(crowset.getInt(1)+" "+crowset.getString(2)+" "+crowset.getDouble(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}

}
