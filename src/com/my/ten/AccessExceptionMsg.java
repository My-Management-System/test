package com.my.ten;

import java.io.FileInputStream;
import java.io.IOException;

public class AccessExceptionMsg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		try{
			fis = new FileInputStream("a.txt");
		}
		catch(IOException ioe){
			System.out.println(ioe.getMessage());
			//return;
			//ioe.printStackTrace();
			System.exit(1);
		}
		finally{
			if(fis != null){
				try{
					fis.close();
				}catch(IOException e){
					e.printStackTrace();
					
				}
			}
			System.out.println("zhixing");
		}
	}

}
