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

public class CachedRowSetTest {
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
	public CachedRowSet query(String sql) throws SQLException{
		
			Connection conn = DriverManager.getConnection(url, user, pass);
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			RowSetFactory factory = RowSetProvider.newFactory();
			CachedRowSet crs = factory.createCachedRowSet();
			crs.populate(rs);
			rs.close();
 			stm.close();
			conn.close();
			return crs;
		
	}
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		CachedRowSetTest crst = new CachedRowSetTest();
		crst.initParam("mysql.ini");
		CachedRowSet crs = crst.query("select * from teacher");
		crs.afterLast();
		while(crs.previous()){
			System.out.println(crs.getInt(1)+"\t"+crs.getString(2));
			if(crs.getInt("teacher_id")==10){
				crs.updateString("teacher_name", "tangseng");
				crs.updateRow();
			}
		}
		Connection conn = DriverManager.getConnection(url,user,pass);
		conn.setAutoCommit(false);
		crs.acceptChanges(conn);
	
	}

}
