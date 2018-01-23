package com.my.thirteen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class PreparedStatementTest {
	private String driver;
	private String url;
	private String user;
	private String pass;
	
	public void initParam(String paramFile) throws FileNotFoundException, IOException, ClassNotFoundException{
		 Properties pro = new Properties();
		 pro.load(new FileInputStream(paramFile));
		 driver = pro.getProperty("driver");
		 url = pro.getProperty("url");
		 user = pro.getProperty("user");
		 pass = pro.getProperty("pass");
		 Class.forName(driver);
		 
	}
	public void statementTest() {
		long start = System.currentTimeMillis();
		try {
			Connection conn = DriverManager.getConnection(url, user, pass);
			Statement stm = conn.createStatement();
			for(int i=0;i<100;i++){
				stm.executeUpdate("insert into teacher values(null,'abc"+i+"')");
			}
			System.out.println("haoshi="+(System.currentTimeMillis()-start));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void preStatementTest() {
		long start = System.currentTimeMillis();
		try {
			Connection conn = DriverManager.getConnection(url, user, pass);
			PreparedStatement pstm = conn.prepareStatement("insert into teacher values(null,?)");
			for(int i=0;i<100;i++){
				pstm.setString(1, "abcd"+i);
				pstm.executeUpdate();
			}
			System.out.println("haoshi="+(System.currentTimeMillis()-start));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		 PreparedStatementTest pst = new PreparedStatementTest();
		 pst.initParam("mysql.ini");
		 pst.preStatementTest();
	}

}
