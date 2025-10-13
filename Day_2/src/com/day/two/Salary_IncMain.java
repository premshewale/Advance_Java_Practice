package com.day.two;

import java.sql.Connection;

public class Salary_IncMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		Connection conn =DBUtil.getConn();
		Sal_Increse si =new Sal_Increse(14, 2.5);
		si.increse();
		System.out.println(si);
	}

}
