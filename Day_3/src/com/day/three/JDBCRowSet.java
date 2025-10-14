package com.day.three;

import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class JDBCRowSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				String url ="jdbc:oracle:thin:@AGNI:1521:oracle12c";
				
				RowSetFactory rp = RowSetProvider.newFactory();
				JdbcRowSet rowset =rp.createJdbcRowSet();
				rowset.setUrl(url);
				rowset.setUsername("FSDM24_1");
				rowset.setPassword("fsdm24_1");
				rowset.setCommand("select * from emp4july");
				rowset.execute();
				//rowset.close();
				
				while(rowset.next()){
					System.out.println(rowset.getInt(1)+" "+rowset.getString(2)+" "+rowset.getDouble(3));
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			
		
	}

}
