package com.day.two;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class Sal_Increse  extends Salary_IncMain{
public int emp_no;
public double sal_increse;
public Sal_Increse(int emp_no, double sal_increse) {
	super();
	this.emp_no = emp_no;
	this.sal_increse = sal_increse;
}
public void increse(){
	
	try {
		Connection conn = DBUtil.getConn();
		CallableStatement cstmt =
				conn.prepareCall("{call addPerSalary(?,?)}");
		cstmt.setInt(1, emp_no);
		
		cstmt.setDouble(2, sal_increse);
		
		cstmt.execute();
		
		conn.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();}
	}
@Override
public String toString() {
	return "Sal_Increse [emp_no=" + emp_no + ", sal_increse=" + sal_increse + "%]";
}


}
