package com.my.thirteen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

 
public class ExecuteSQL {
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
	public void executeSql(String sql) throws ClassNotFoundException{
		Class.forName(driver);
		try {
			Connection conn = DriverManager.getConnection(url, user, pass);
			Statement stm = conn.createStatement();
			boolean hasResult = stm.execute(sql);
			if(hasResult){
				ResultSet rs = stm.getResultSet();
				ResultSetMetaData rsm = rs.getMetaData();
				int comcount = rsm.getColumnCount();
				while(rs.next()){
					for(int i=0;i<comcount;i++){
						System.out.print(rs.getString(i+1)+"\t");
					}
					System.out.println();
				}
			}
			else{
				System.out.println("tiaoshu ="+stm.getUpdateCount());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ExecuteSQL ee = new ExecuteSQL();
		ee.initParam("mysql.ini");
		ee.executeSql("drop table if exists my_test");
		ee.executeSql("create table my_test("
				+ "test_id int auto_increment primary key,"
				+ "test_name varchar(255))");
		ee.executeSql("insert into my_test values(null,'hello')");
		ee.executeSql("select * from my_test");
	}

}
