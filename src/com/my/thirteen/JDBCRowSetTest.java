package com.my.thirteen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

 
public class JDBCRowSetTest {
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
	public void update(String sql) throws SQLException{
		/*try {
			Connection conn = DriverManager.getConnection(url, user, pass);
			JdbcRowSet jdbcRs = new JdbcRowSetImpl(conn);
			jdbcRs.setCommand(sql);
			jdbcRs.execute();
			jdbcRs.afterLast();
			
			while(jdbcRs.previous()){
				System.out.println(jdbcRs.getInt(1)+"\t"+jdbcRs.getString(2));
				if(jdbcRs.getInt("teacher_id")==3){
					jdbcRs.updateString("teacher_name", "sunwukong");
					jdbcRs.updateRow();
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//Connection conn = DriverManager.getConnection(url, user, pass);
		RowSetFactory factory = RowSetProvider.newFactory();
		try {
			JdbcRowSet jrs = factory.createJdbcRowSet(); 
			jrs.setUrl(url);
			jrs.setUsername(user);
			jrs.setPassword(pass);
			jrs.setCommand(sql);
			jrs.execute();
			jrs.afterLast();
			
			while(jrs.previous()){
				System.out.println(jrs.getInt(1)+"\t"+jrs.getString(2));
				if(jrs.getInt("teacher_id")==5){
					jrs.updateString("teacher_name", "zhubajie");
					jrs.updateRow();
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		JDBCRowSetTest jdbcst = new JDBCRowSetTest();
		jdbcst.initParam("mysql.ini");
		jdbcst.update("select  * from teacher");
	}

}
