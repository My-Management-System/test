package com.my.thirteen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnMySql {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		 
			Class.forName("com.mysql.jdbc.Driver");
			try {
				Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","root","1234");
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("select * from teacher");
			
				while(rs.next()){
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		
	}

}
