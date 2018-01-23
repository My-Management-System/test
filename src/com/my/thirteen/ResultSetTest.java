package com.my.thirteen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class ResultSetTest {
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
	public void query(String sql){
		try {
			Connection conn = DriverManager.getConnection(url, user, pass);
			PreparedStatement pst = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = pst.executeQuery();
			rs.last();
			int rowCount = rs.getRow();
			for(int i =rowCount;i>0;i--){
				rs.absolute(i);
				System.out.print(rs.getString(1)+"\t"+rs.getString(2));
				rs.updateString(2, "aaa"+i);
				rs.updateRow();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		ResultSetTest rst = new ResultSetTest();
		rst.initParam("mysql.ini");
		rst.query("select * from teacher");
	}

}
