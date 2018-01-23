package com.my.thirteen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ExecuteDDL {
	
	private String driver;
	private String url;
	private String user;
	private String pass;
	
	public void initParam(String paramFile) throws FileNotFoundException, IOException{
		 Properties pro = new Properties();
		 pro.load(new FileInputStream(paramFile));
		 driver = pro.getProperty("driver");
		 url = pro.getProperty("url");
		 user = pro.getProperty("user");
		 pass = pro.getProperty("pass");
	}
	public void creatTable(String sql) throws ClassNotFoundException{
		Class.forName(driver);
		try {
			Connection conn = DriverManager.getConnection(url, user, pass);
			Statement stm = conn.createStatement();
			stm.executeUpdate(sql);
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		ExecuteDDL ed = new ExecuteDDL();
		ed.initParam("mysql.ini");
		ed.creatTable("create table jdbc_test(jdbc_id int auto_increment primary key,"
				+ "jdbc_name varchar(255),"
				+ "jdbc_desc text);");
		System.out.println("建表成功！！！");
	}

}
