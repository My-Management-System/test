package com.my.thirteen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class CachedRowSetPage {
	private String driver;
	private static String url;
	private static String user;
	private static String pass;
	
	public void initParam(String paramFile) throws FileNotFoundException, IOException, ClassNotFoundException{
		 Properties pro = new Properties();
		 pro.load(new FileInputStream(paramFile));
		 driver = pro.getProperty("driver");
		 url = pro.getProperty("url");
		 user = pro.getProperty("user");
		 pass = pro.getProperty("pass");
		 Class.forName(driver);
	}
	public CachedRowSet query(String sql,int pageSize,int page) throws SQLException{
		
		try (
			Connection conn = DriverManager.getConnection(url, user, pass);
			Statement smt = conn.createStatement();
			ResultSet rs = smt.executeQuery(sql) )
		{
			RowSetFactory factory = RowSetProvider.newFactory();
			CachedRowSet cached = factory.createCachedRowSet();
			cached.setPageSize(pageSize);
			cached.populate(rs, (page-1)*pageSize+1);
			return cached;		
		} 
		
	}
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		CachedRowSetPage cachedPage = new CachedRowSetPage();
		cachedPage.initParam("mysql.ini");
		CachedRowSet crs = cachedPage.query("select  * from teacher", 3, 2);
		while(crs.next()){
			System.out.println(crs.getInt(1)+"\t"+crs.getString(2));
		}
	}

}
