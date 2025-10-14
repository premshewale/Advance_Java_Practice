package com.day.three;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {

	public static Connection getConn(){
	
	Connection conn=null;
	try {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("DBConfig.properties");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Properties p =new Properties();
		try {
			p.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Class.forName(p.getProperty("driver"));
		conn = DriverManager.getConnection(p.getProperty("url"),p.getProperty("user"),
				p.getProperty("passwd"));
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return conn;
	}
}
